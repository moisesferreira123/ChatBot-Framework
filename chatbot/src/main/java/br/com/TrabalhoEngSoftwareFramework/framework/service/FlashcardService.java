package br.com.TrabalhoEngSoftwareFramework.framework.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.TrabalhoEngSoftwareFramework.framework.dto.FlashcardDTO;
import br.com.TrabalhoEngSoftwareFramework.framework.dto.UserAnswerDTO;
import br.com.TrabalhoEngSoftwareFramework.framework.entity.DeckEntity;
import br.com.TrabalhoEngSoftwareFramework.framework.entity.FlashcardEntity;
import br.com.TrabalhoEngSoftwareFramework.framework.exception.InvalidObjectDataException;
import br.com.TrabalhoEngSoftwareFramework.framework.exception.ObjectNotFoundException;
import br.com.TrabalhoEngSoftwareFramework.framework.exception.UnauthorizedObjectAccessException;
import br.com.TrabalhoEngSoftwareFramework.framework.handler.FlashcardTypeHandler;
import br.com.TrabalhoEngSoftwareFramework.framework.handler.FlashcardTypeHandlerRegistry;
import br.com.TrabalhoEngSoftwareFramework.framework.repository.DeckRepository;
import br.com.TrabalhoEngSoftwareFramework.framework.repository.FlashcardRepository;

@Service
public abstract class FlashcardService {
  
  @Autowired
  protected FlashcardRepository flashcardRepository;
  @Autowired
  protected DeckRepository deckRepository;
  @Autowired
  protected FlashcardTypeHandlerRegistry handlerRegistry;

  public FlashcardService() {

  }

  @SuppressWarnings("unchecked")
  @Transactional
  public void createFlashcard(FlashcardDTO flashcardDTO, Long deckId) {
    if (flashcardDTO.getFlashcardType() == null || flashcardDTO.getFlashcardType().trim().isEmpty()) {
      throw new InvalidObjectDataException("Flashcard type is required for create.");
    }
    
    DeckEntity deck = deckRepository.findById(deckId).orElseThrow(() -> new ObjectNotFoundException("Flashcard deck not found"));
    FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO> handler = (FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO>) handlerRegistry.getHandler(flashcardDTO.getFlashcardType());
    
    FlashcardEntity flashcard = handler.createFlashcard(flashcardDTO);
    
    flashcard.setDeckEntity(deck);
    
    flashcard.getDeckEntity().getFlashcards().add(flashcard);
  }

  public abstract Page<FlashcardDTO> listFlashcards(String word, String flashcardFilter, Long userId, Long deckId, String sortType, Pageable pageable);

  @SuppressWarnings("unchecked")
  @Transactional
  public void updateFlashcard(Long flashcardId, FlashcardDTO flashcardDTO, Long userId) {
    FlashcardEntity flashcard = flashcardRepository.findById(flashcardId).orElseThrow(() -> new ObjectNotFoundException("Flashcard not found"));

    if(!flashcard.getDeckEntity().getUserEntity().getId().equals(userId)) {
      throw new UnauthorizedObjectAccessException("Unauthorized to edit this flashcard");
    }

    if (flashcardDTO.getFlashcardType() == null || flashcardDTO.getFlashcardType().trim().isEmpty()) {
      throw new InvalidObjectDataException("Flashcard type is required for update.");
    }

    if (!flashcardDTO.getFlashcardType().equals(flashcard.getFlashcardType())) {
      throw new InvalidObjectDataException("Cannot change flashcard type during update. Existing type: " + flashcard.getFlashcardType() + ", Provided type: " + flashcardDTO.getFlashcardType());
    }

    FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO> handler = (FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO>) handlerRegistry.getHandler(flashcardDTO.getFlashcardType());
    handler.updateFlashcard(flashcard, flashcardDTO);
  }

  @Transactional
  public void deleteFlashcard(Long flashcardId, Long userId) {
    FlashcardEntity flashcard = flashcardRepository.findById(flashcardId).orElseThrow(() -> new ObjectNotFoundException("Flashcard not found"));
    
    if(!flashcard.getDeckEntity().getUserEntity().getId().equals(userId)) {
      throw new UnauthorizedObjectAccessException("Unauthorized to edit this flashcard");
    }
    
    flashcard.getDeckEntity().getFlashcards().remove(flashcard);
  }

  @SuppressWarnings("unchecked")
  @Transactional
  public FlashcardDTO getFlashcardById(Long flashcardId, Long userId) {
    FlashcardEntity flashcard = flashcardRepository.findById(flashcardId).orElseThrow(() -> new ObjectNotFoundException("Flashcard not found"));
    
    if(!flashcard.getDeckEntity().getUserEntity().getId().equals(userId)) {
      throw new UnauthorizedObjectAccessException("Unauthorized to get this flashcard");
    }

    FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO> handler = (FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO>) handlerRegistry.getHandler(flashcard.getFlashcardType());

    return handler.entityToDTO(flashcard);
  }

  @SuppressWarnings("unchecked")
  @Transactional
  public void evaluateAnswer(Long flashcardId, UserAnswerDTO answer, Long userId) {
    FlashcardEntity flashcard = flashcardRepository.findById(flashcardId).orElseThrow(() -> new ObjectNotFoundException("Flashcard not found"));
    if(!flashcard.getDeckEntity().getUserEntity().getId().equals(userId)) {
      throw new UnauthorizedObjectAccessException("Unauthorized to review this flashcard");
    }
    FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO> handler = (FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO>) handlerRegistry.getHandler(flashcard.getFlashcardType());
    handler.evaluateAnswer(flashcard, answer);
    flashcardRepository.save(flashcard);
  }

  @Transactional
  public List<FlashcardDTO> createFlashcardsFromSuggestions(List<FlashcardDTO> suggestions, Long deckId, Long userId) {
    DeckEntity deck = deckRepository.findById(deckId)
            .orElseThrow(() -> new ObjectNotFoundException("Deck not found with ID: " + deckId));

    if (!deck.getUserEntity().getId().equals(userId)) {
        throw new UnauthorizedObjectAccessException("Unauthorized: Deck does not belong to user " + userId);
    }
  
    List<FlashcardDTO> createdFlashcards = new ArrayList<>();
    for (FlashcardDTO suggestion : suggestions) {
      createFlashcard(suggestion, deckId);
      createdFlashcards.add(suggestion);
    }
    return createdFlashcards;
  }
}
