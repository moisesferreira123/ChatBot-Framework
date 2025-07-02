package br.com.TrabalhoEngSoftware.chatbot.service.provider;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import reactor.core.publisher.Flux;

public interface AiProvider {
    String getCompletion(Prompt prompt, ChatClient chatClient);
    <T> T getJsonCompletion(Prompt prompt, Class<T> targetType, ChatClient chatClient);
    Flux<String> getStreamCompletion(Prompt prompt, ChatClient chatClient);
}
