package br.com.TrabalhoEngSoftware.chatbot.service.prompt;

import br.com.TrabalhoEngSoftware.chatbot.entity.NoteEntity;
import br.com.TrabalhoEngSoftware.chatbot.entity.SourceEntity;
import br.com.TrabalhoEngSoftware.chatbot.repository.NoteRepository;
import br.com.TrabalhoEngSoftware.chatbot.repository.SourceRepository;
import org.springframework.ai.chat.messages.Message;
import org.springframework.ai.chat.messages.SystemMessage;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class PromptBuilder {

    private NoteRepository noteRepository;
    private SourceRepository sourceRepository;

    private String systemMessageContent = "";
    private String userMessageContent = "";
    private StringBuilder contextBuilder = new StringBuilder();

    @Autowired
    public void setNoteRepository(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Autowired
    public void setSourceRepository(SourceRepository sourceRepository) {
        this.sourceRepository = sourceRepository;
    }

    public PromptBuilder withSystemMessage(String systemMessage) {
        this.systemMessageContent = systemMessage;
        return this;
    }

    public PromptBuilder withUserMessage(String userMessage) {
        this.userMessageContent = userMessage;
        return this;
    }

    public PromptBuilder withNoteContext(Long noteId, Long userId) {
        if (noteId != null) {
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
            contextBuilder.append("## Context from Uploaded Sources:\n");
            List<SourceEntity> sources = sourceRepository.findAllById(sourceIds);
            for (SourceEntity source : sources) {
                if (source.getNoteEntity().getUserEntity().getId().equals(userId)) {
                    if (noteId == null || source.getNoteEntity().getId().equals(noteId)) {
                        if (source.getExtractedText() != null && !source.getExtractedText().isEmpty()) {
                            contextBuilder.append("### Source (File: ").append(source.getFileName()).append("):\n");
                            String extractedContent = source.getExtractedText();
                            contextBuilder.append(extractedContent.substring(0, Math.min(extractedContent.length(), 4000)));
                            if (extractedContent.length() > 4000) {
                                contextBuilder.append("...\n[Content Truncated]");
                            }
                            contextBuilder.append("\n\n");
                        } else {
                            contextBuilder.append("### Source (File: ").append(source.getFileName()).append("):\nText content not available or empty.\n\n");
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

    public PromptBuilder forFlashcardGeneration(String noteContent, int count) {
        this.systemMessageContent = "You are an AI assistant specialized in creating educational flashcards. " +
                "Based on the provided text, generate exactly " + count + " flashcards. " +
                "Each flashcard must have a 'front' (a question, term, or concept) and a 'back' (the corresponding answer, definition, or explanation). " +
                "The 'front' should be concise and suitable for a flashcard. The 'back' should also be concise but comprehensive enough to be useful. " +
                "IMPORTANT: Respond ONLY with a valid JSON array of objects. Each object must have two keys: \"front\" and \"back\". Do not include any other text, explanations, or introductions in your response. " +
                "Example format: [{\"front\": \"What is photosynthesis?\", \"back\": \"The process by which green plants use sunlight, water, and carbon dioxide to create their own food.\"}, {\"front\": \"Capital of France?\", \"back\": \"Paris\"}]";
        this.userMessageContent = "Here is the text to generate flashcards from:\n\n" + noteContent;
        return this;
    }

    public Prompt build() {
        String effectiveSystemPrompt = systemMessageContent;
        if (contextBuilder.length() > 0) {
            effectiveSystemPrompt = "## Provided Context:\n" + contextBuilder.toString() + "\n## General Instructions for AI:\n" + effectiveSystemPrompt;
        }

        List<Message> messages = new ArrayList<>();
        if (effectiveSystemPrompt != null && !effectiveSystemPrompt.trim().isEmpty()) {
            messages.add(new SystemMessage(effectiveSystemPrompt));
        }

        messages.add(new UserMessage(userMessageContent != null ? userMessageContent : "Please provide a response based on the context."));

        return new Prompt(messages);
    }
}

