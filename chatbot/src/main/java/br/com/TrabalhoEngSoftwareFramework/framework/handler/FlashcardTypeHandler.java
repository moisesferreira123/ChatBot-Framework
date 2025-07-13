package br.com.TrabalhoEngSoftwareFramework.framework.handler;

import br.com.TrabalhoEngSoftwareFramework.framework.dto.FlashcardDTO;
import br.com.TrabalhoEngSoftwareFramework.framework.dto.UserAnswerDTO;
import br.com.TrabalhoEngSoftwareFramework.framework.entity.FlashcardEntity;

public interface FlashcardTypeHandler<D extends FlashcardDTO, E extends FlashcardEntity, U extends UserAnswerDTO> {
  String supportsType(); // Retorna o  tipo de flashcard que este handler consegue processar
  E createFlashcard(D dto);
  void updateFlashcard(E flashcard, D dto);
  void evaluateAnswer(E flashcard, U answer);
  D entityToDTO(E flashcard);
}
