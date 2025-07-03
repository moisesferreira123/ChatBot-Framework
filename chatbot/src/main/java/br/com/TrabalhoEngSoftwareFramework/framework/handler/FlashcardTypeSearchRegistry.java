package br.com.TrabalhoEngSoftwareFramework.framework.handler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class FlashcardTypeSearchRegistry {
  private final Map<String, FlashcardTypeSearchHandler> handlers = new HashMap<>();
  // O Spring injetará automaticamente uma lista de todos os beans que implementam FlashcardTypeSearchHandler
  private final List<FlashcardTypeSearchHandler> injectedHandlers;
  
  public FlashcardTypeSearchRegistry(List<FlashcardTypeSearchHandler> injectedHandlers) {
      this.injectedHandlers = injectedHandlers;
  }

  @PostConstruct // Este método é executado após a injeção de dependências
  public void init() {
      for (FlashcardTypeSearchHandler handler : injectedHandlers) {
          handlers.put(handler.supportsType(), handler);
          System.out.println("Registrando FlashcardTypeSearchHandler para tipo: " + handler.supportsType());
      }
  }

  /**
   * Recupera o handler de busca para um determinado tipo de flashcard.
   *
   * @param type A string do tipo de flashcard (ex: "TEXT", "MULTIPLE_CHOICE").
   * @return Um Optional contendo o handler se encontrado, ou vazio caso contrário.
   */
  public Optional<FlashcardTypeSearchHandler> getHandler(String type) {
      return Optional.ofNullable(handlers.get(type));
  }
}
