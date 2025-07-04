package br.com.TrabalhoEngSoftwareFramework.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// ❗ Import the class to be excluded
import org.springframework.cloud.function.context.config.ContextFunctionCatalogAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
// ❗ Exclude the problematic auto-configuration
@SpringBootApplication(exclude = {ContextFunctionCatalogAutoConfiguration.class})
public class ChatbotApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatbotApplication.class, args);
	}

}