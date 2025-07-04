package br.com.TrabalhoEngSoftwareFramework.framework.service.provider;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.converter.BeanOutputConverter;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import org.springframework.ai.chat.messages.UserMessage;

@Service
public class AiProvider {

    public String getCompletion(Prompt prompt, ChatClient chatClient) {
        return chatClient.prompt(prompt).call().content();
    }

    public <T> T getJsonCompletion(Prompt prompt, Class<T> targetType, ChatClient chatClient) { //FIXME: Por enquanto só aceita output para uma classe, não aceita listas, maps, ou outros tipos que precisem de converters diferentes
        BeanOutputConverter<T> outputConverter = new BeanOutputConverter<>(targetType);
        String format = outputConverter.getFormat();

        String userTextWithFormat = prompt.getInstructions().get(0).getContent() + "\n" + format;
        Prompt newPrompt = new Prompt(new UserMessage(userTextWithFormat));

        ChatResponse response = chatClient.prompt(newPrompt).call().chatResponse();
        return outputConverter.convert(response.getResult().getOutput().getContent());
    }

    public Flux<String> getStreamCompletion(Prompt prompt, ChatClient chatClient) {
        return chatClient.prompt(prompt).stream().content();
    }
}
