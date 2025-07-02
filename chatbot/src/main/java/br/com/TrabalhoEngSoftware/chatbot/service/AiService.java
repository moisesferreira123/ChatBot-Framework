package br.com.TrabalhoEngSoftware.chatbot.service;

import br.com.TrabalhoEngSoftware.chatbot.dto.FlashcardDTO;
import br.com.TrabalhoEngSoftware.chatbot.service.provider.AiProvider;
import br.com.TrabalhoEngSoftware.chatbot.service.prompt.PromptBuilder;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Map;

@Service
public class AiService {

    private final AiProvider aiProvider;
    private final ObjectProvider<PromptBuilder> promptBuilderProvider;
    private final Map<String, ChatClient> chatClients;

    public AiService(AiProvider aiProvider, ObjectProvider<PromptBuilder> promptBuilderProvider, Map<String, ChatClient> chatClients) {
        this.aiProvider = aiProvider;
        this.promptBuilderProvider = promptBuilderProvider;
        this.chatClients = chatClients;
    }

    public String getCompletion(String systemPrompt, String userPrompt, Long noteId, List<Long> sourceIds, Long userId, String provider) {
        ChatClient chatClient = chatClients.get(provider);
        Prompt prompt = promptBuilderProvider.getObject()
                .withSystemMessage(systemPrompt)
                .withUserMessage(userPrompt)
                .withNoteContext(noteId, userId)
                .withSourceContext(sourceIds, noteId, userId)
                .build();
        return aiProvider.getCompletion(prompt, chatClient);
    }

    public List<FlashcardDTO> generateFlashcardSuggestions(String noteContent, Long userId, int count, String provider) {
        ChatClient chatClient = chatClients.get(provider);
        Prompt prompt = promptBuilderProvider.getObject()
                .forFlashcardGeneration(noteContent, count)
                .build();
        return aiProvider.getJsonCompletion(prompt, List.class, chatClient);
    }

    public Flux<String> getStreamCompletion(String systemPrompt, String userPrompt, Long noteId, List<Long> sourceIds, Long userId, String provider) {
        ChatClient chatClient = chatClients.get(provider);
        Prompt prompt = promptBuilderProvider.getObject()
                .withSystemMessage(systemPrompt)
                .withUserMessage(userPrompt)
                .withNoteContext(noteId, userId)
                .withSourceContext(sourceIds, noteId, userId)
                .build();
        return aiProvider.getStreamCompletion(prompt, chatClient);
    }
}
