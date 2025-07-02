package br.com.TrabalhoEngSoftware.chatbot.service.provider;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.converter.BeanOutputConverter;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import org.springframework.ai.chat.messages.UserMessage;

@Service
public class SpringAiProvider implements AiProvider {

    @Override
    public String getCompletion(Prompt prompt, ChatClient chatClient) {
        return chatClient.prompt(prompt).call().content();
    }

    @Override
    public <T> T getJsonCompletion(Prompt prompt, Class<T> targetType, ChatClient chatClient) {
        BeanOutputConverter<T> outputConverter = new BeanOutputConverter<>(targetType);
        String format = outputConverter.getFormat();

        String userTextWithFormat = prompt.getInstructions().get(0).getContent() + "\n" + format;
        Prompt newPrompt = new Prompt(new UserMessage(userTextWithFormat));

        ChatResponse response = chatClient.prompt(newPrompt).call().chatResponse();
        return outputConverter.parse(response.getResult().getOutput().getContent());
    }

    @Override
    public Flux<String> getStreamCompletion(Prompt prompt, ChatClient chatClient) {
        return chatClient.prompt(prompt).stream().content();
    }
}
