package br.com.TrabalhoEngSoftware.chatbot.handler;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import br.com.TrabalhoEngSoftware.chatbot.dto.FlashcardDTO;
import br.com.TrabalhoEngSoftware.chatbot.dto.UserAnswerDTO;
import br.com.TrabalhoEngSoftware.chatbot.entity.FlashcardEntity;
import br.com.TrabalhoEngSoftware.chatbot.exception.InvalidObjectDataException;

@Component
public class FlashcardTypeHandlerRegistry {
  private Map<String, FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO>> handlersMap;

  public FlashcardTypeHandlerRegistry(List<FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO>> handlers) {
    this.handlersMap = handlers.stream().collect(Collectors.toMap(FlashcardTypeHandler::supportsType, Function.identity()));
  }

  public FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO> getHandler(String type) {
    FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO> handler = handlersMap.get(type);
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
