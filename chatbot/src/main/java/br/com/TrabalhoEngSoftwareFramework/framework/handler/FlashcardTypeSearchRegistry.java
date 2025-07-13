package br.com.TrabalhoEngSoftwareFramework.framework.handler;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import br.com.TrabalhoEngSoftwareFramework.framework.exception.InvalidObjectDataException;

@Component
public class FlashcardTypeSearchRegistry {
  private Map<String, FlashcardTypeSearchHandler<?>> handlers;
  
  public FlashcardTypeSearchRegistry(List<FlashcardTypeSearchHandler<?>> injectedHandlers) {
      this.handlers = injectedHandlers.stream().collect(Collectors.toMap(FlashcardTypeSearchHandler::supportsType, Function.identity()));
  }

  public Map<String, FlashcardTypeSearchHandler<?>> getHandlers() {
    return handlers;
  }

  /**
   * Recupera o handler de busca para um determinado tipo de flashcard.
   *
   * @param type A string do tipo de flashcard.
   * @return Um Optional contendo o handler se encontrado, ou vazio caso contrário.
   */
  public FlashcardTypeSearchHandler<?> getHandler(String type) {
    FlashcardTypeSearchHandler<?> handler = handlers.get(type);
    if (handler == null) {
        throw new InvalidObjectDataException(
            "No Search handler found for flashcard type: '" + type + "'. " +
            "Please ensure an implementation of FlashcardTypeHandler " +
            "for this type is provided by your application and is discoverable by Spring."
        );
    }
    return handler;
  }
}
