package br.com.TrabalhoEngSoftwareFramework.framework.infra.provider;

import org.springframework.ai.anthropic.AnthropicChatModel;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.vertexai.gemini.VertexAiGeminiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AiProviderConfig {

    @Bean
    @Primary
    public ChatClient openAiChatClient(OpenAiChatModel openAiChatModel) { 
        // OBS: Funciona com qualquer API compatível com a da OpenAI (incluindo a do Gemini que é bem mais fácil de usar dessa forma do que via vertex)
        return ChatClient.create(openAiChatModel);
    }

    @Bean
    public ChatClient anthropicChatClient(AnthropicChatModel anthropicChatModel) {
        return ChatClient.create(anthropicChatModel);
    }

    @Bean
    public ChatClient vertexAiChatClient(VertexAiGeminiChatModel vertexAiGeminiChatModel) {
        return ChatClient.create(vertexAiGeminiChatModel);
    }
}
