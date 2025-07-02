package br.com.TrabalhoEngSoftware.chatbot.handler;

import br.com.TrabalhoEngSoftware.chatbot.dto.FlashcardDTO;
import br.com.TrabalhoEngSoftware.chatbot.dto.UserAnswerDTO;
import br.com.TrabalhoEngSoftware.chatbot.entity.FlashcardEntity;

public interface FlashcardTypeHandler<D extends FlashcardDTO, E extends FlashcardEntity, U extends UserAnswerDTO> {
  String supportsType(); // Retorna o  tipo de flashcard que este handler consegue processar
  E createFlashcard(D dto);
  void updateFlashcard(E flashcard, D dto);
  int evaluateAnswer(E flashcard, U answer);
  D entityToDTO(E flashcard);
}
