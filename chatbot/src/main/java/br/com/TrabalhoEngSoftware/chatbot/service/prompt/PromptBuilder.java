package br.com.TrabalhoEngSoftware.chatbot.service.prompt;

import br.com.TrabalhoEngSoftware.chatbot.entity.SourceEntity;
import br.com.TrabalhoEngSoftware.chatbot.repository.NoteRepository;
import br.com.TrabalhoEngSoftware.chatbot.repository.SourceRepository;

import org.springframework.ai.chat.messages.AssistantMessage;
import org.springframework.ai.chat.messages.Message;
import org.springframework.ai.chat.messages.Media;
import org.springframework.ai.chat.messages.SystemMessage;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.prompt.ChatOptions;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.util.MimeType;
import org.springframework.util.MimeTypeUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


/* Roles:
 * System: Guia o comportamento da IA e estilo de resposta, definindo parâmetros e regras para a forma que a LLM deve interpretar e responder a uma mensagem.
 * User: Entradas do Usuário. Perguntas, afirmações e comandos que vão ser o principal determinante na resposta final da IA
 * Assistant: Mantém rastreio das respostas anteriores da LLM para manter o fluxo de uma conversa (em casos de chats ou requests que precisem de continuidade entre si)
 * Function/ToolResponse: Tarefas Específicas. Dá acesso à ferramentas para a LLM, como cálculos, busca na web, etc...
*/
//TODO: Adicionar suporte a Function-Calling
@Component
@Scope("prototype")
public class PromptBuilder {

    private NoteRepository noteRepository;
    private SourceRepository sourceRepository;

    private List<Message> promptMessages;
    private String systemMessageContent;
    private List<UserMessage> extraContext;
    private ChatOptions chatOptions;
    private boolean hasUserMessage = false;

    @Autowired
    public void setNoteRepository(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Autowired
    public void setSourceRepository(SourceRepository sourceRepository) {
        this.sourceRepository = sourceRepository;
    }

    public PromptBuilder withSystemMessage(String systemMessage) {
        systemMessageContent = systemMessage;
        return this;
    }

    public PromptBuilder withUserMessage(String userMessage) {
        promptMessages.add(new UserMessage(userMessage));
        hasUserMessage = true;
        return this;
    }
    
    public PromptBuilder withAssistantMessage(String assistantMessage) {
        promptMessages.add(new AssistantMessage(assistantMessage));
        return this;
    }

    public PromptBuilder withOptions(ChatOptions modelOptions) {
        chatOptions = modelOptions;
        return this;
    }

    public PromptBuilder withNoteContext(Long noteId, Long userId) {
        if (noteId != null) {
            StringBuilder contextBuilder = new StringBuilder();
            noteRepository.findById(noteId).ifPresent(note -> {
                if (note.getUserEntity().getId().equals(userId)) {
                    contextBuilder.append("## Context from Note (ID: ").append(noteId).append("):\n");
                    contextBuilder.append("### Title: ").append(note.getTitle()).append("\n");
                    if (note.getSubtitle() != null && !note.getSubtitle().isEmpty()) {
                        contextBuilder.append("#### Subtitle: ").append(note.getSubtitle()).append("\n");
                    }
                    contextBuilder.append("### Content:\n").append(note.getContent()).append("\n\n---\n\n");
                } else {
                    System.err.println("User " + userId + " attempted to access unauthorized note " + noteId);
                }
            });
        }
        return this;
    }

    public PromptBuilder withSourceContext(List<Long> sourceIds, Long noteId, Long userId) {
        if (sourceIds != null && !sourceIds.isEmpty()) {
            StringBuilder contextBuilder = new StringBuilder();
            contextBuilder.append("## Context from Uploaded Sources:\n");
            List<SourceEntity> sources = sourceRepository.findAllById(sourceIds);
            for (SourceEntity source : sources) {
                if (source.getNoteEntity().getUserEntity().getId().equals(userId)) {
                    if (noteId == null || source.getNoteEntity().getId().equals(noteId)) {
                        contextBuilder.append("### Source (File: ").append(source.getFileName()).append("):\n");
                        //TODO: Utilizar RAG para arquivos grandes
                        try {
                            byte[] fileData = new ClassPathResource(source.getFilePath()).getContentAsByteArray();
                            String mimeTypeString = Files.probeContentType(Paths.get(source.getFilePath()));
                            MimeType mimeType = MimeTypeUtils.parseMimeType(mimeTypeString);
                            //FIXME: Esse construtor de Media é deprecado, ver docs de novas versões para substituir
                            extraContext.add(new UserMessage(contextBuilder.toString(), new Media(mimeType, fileData)));
                        } catch (IOException e) {
                            System.err.println("Error processing file: " + source.getFilePath() + " - " + e.getMessage());
                        }
                    }
                } else {
                    System.err.println("User " + userId + " attempted to access unauthorized source " + source.getId());
                }
            }
            contextBuilder.append("---\n\n");
        }
        return this;
    }

    public PromptBuilder forFlashcardGeneration(String noteContent, int count) { //FIXME: Prompt de Demo pra usar no Kairo por enquanto, remover depois
        withSystemMessage("You are an AI assistant specialized in creating educational flashcards. " +
                "Based on the provided text, generate exactly " + count + " flashcards. " +
                "Each flashcard must have a 'front' (a question, term, or concept) and a 'back' (the corresponding answer, definition, or explanation). " +
                "The 'front' should be concise and suitable for a flashcard. The 'back' should also be concise but comprehensive enough to be useful. " +
                "IMPORTANT: Respond ONLY with a valid JSON array of objects. Each object must have two keys: \"front\" and \"back\". Do not include any other text, explanations, or introductions in your response. " +
                "Example format: [{\"front\": \"What is photosynthesis?\", \"back\": \"The process by which green plants use sunlight, water, and carbon dioxide to create their own food.\"}, {\"front\": \"Capital of France?\", \"back\": \"Paris\"}]");
        withUserMessage("Here is the text to generate flashcards from:\n\n" + noteContent);
        return this;
    }

    public Prompt build() {
        String effectiveSystemPrompt = systemMessageContent;
        
        if (effectiveSystemPrompt != null && !effectiveSystemPrompt.trim().isEmpty()) {
            promptMessages.add(new SystemMessage(effectiveSystemPrompt));
        }
        if (!hasUserMessage) {
            promptMessages.add(new UserMessage("Please provide a response based on the context."));
        }
        if (!extraContext.isEmpty()) { 
            //TODO: Experimentar diferentes ordens de mensagens, colocar o contexto adicional no final pode fazer com que a LLM acabe ignorando o input do próprio usuário (que ficaria no meio)
            //OBS: Talvez também seja melhor deixar antes das mensagens do usuário para permitir caching do prompt.
            promptMessages.addAll(extraContext);   
        }

        if (chatOptions != null) {
            return new Prompt(promptMessages, chatOptions);
        } else {
            return new Prompt(promptMessages);
        }
    }
}

