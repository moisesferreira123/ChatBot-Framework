package br.com.TrabalhoEngSoftwareFramework.framework.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

@Service
public class AiService {
    private final ChatClient chatClient;

    public AiService(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    public String getCompletion(Prompt prompt) {
        return chatClient.prompt(prompt).call().content();
    }
    
    public Flux<String> getStreamCompletion(Prompt prompt) {
        return chatClient.prompt(prompt).stream().content();
    }

    public <T> T getJsonCompletion(Prompt prompt, ParameterizedTypeReference<T> targetTypeRef) {
        return chatClient.prompt(prompt).call().entity(targetTypeRef);
    }

}
