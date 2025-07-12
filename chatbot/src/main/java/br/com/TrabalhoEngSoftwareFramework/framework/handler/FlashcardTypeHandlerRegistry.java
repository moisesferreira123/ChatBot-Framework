package br.com.TrabalhoEngSoftwareFramework.framework.handler;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import br.com.TrabalhoEngSoftwareFramework.framework.exception.InvalidObjectDataException;

@Component
public class FlashcardTypeHandlerRegistry {
  private Map<String, FlashcardTypeHandler<?, ?, ?>> handlersMap;

  public FlashcardTypeHandlerRegistry(List<FlashcardTypeHandler<?, ?, ?>> handlers) {
    this.handlersMap = handlers.stream().collect(Collectors.toMap(FlashcardTypeHandler::supportsType, Function.identity()));
  }

  public FlashcardTypeHandler<?, ?, ?> getHandler(String type) {
    FlashcardTypeHandler<?, ?, ?> handler = handlersMap.get(type);
    if (handler == null) {
        throw new InvalidObjectDataException(
            "No handler found for flashcard type: '" + type + "'. " +
            "Please ensure an implementation of FlashcardTypeHandler " +
            "for this type is provided by your application and is discoverable by Spring."
        );
    }
    return handler;
  }
}
