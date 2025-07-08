package br.com.TrabalhoEngSoftwareFramework.framework.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
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
import br.com.TrabalhoEngSoftwareFramework.framework.specification.FlashcardSpecificationBuilder;

@Service
public abstract class FlashcardService {
  
  @Autowired
  protected FlashcardRepository flashcardRepository;
  @Autowired
  protected DeckRepository deckRepository;
  @Autowired
  protected FlashcardTypeHandlerRegistry handlerRegistry;
  @Autowired
  protected FlashcardSpecificationBuilder flashcardSpecificationBuilder;

  public FlashcardService() {

  }

  @Transactional
  public void createFlashcard(FlashcardDTO flashcardDTO, Long deckId) {
    if (flashcardDTO.getFlashcardType() == null || flashcardDTO.getFlashcardType().trim().isEmpty()) {
      throw new InvalidObjectDataException("Flashcard type is required for create.");
    }
    
    DeckEntity deck = deckRepository.findById(deckId).orElseThrow(() -> new ObjectNotFoundException("Flashcard deck not found"));
    FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO> handler = handlerRegistry.getHandler(flashcardDTO.getFlashcardType());
    
    FlashcardEntity flashcard = handler.createFlashcard(flashcardDTO);
    
    // flashcard.setType(flashcardDTO.getFlashcardType());
    flashcard.setDeckEntity(deck);
    
    flashcard.getDeckEntity().getFlashcards().add(flashcard);
  }

  public Page<FlashcardDTO> listFlashcards(String word, String flashcardFilter, Long userId, Long deckId, String sortType, Pageable pageable) {
    flashcardSpecificationBuilder.addWordFilter(word);

    if(flashcardFilter != null && !flashcardFilter.trim().isEmpty()) {
      flashcardSpecificationBuilder.addSpecification(flashcardFilter); // Adiciona o filtro nomeado
    }

    if(sortType != null && !sortType.trim().isEmpty()) {
      flashcardSpecificationBuilder.addSpecification(sortType); // Adiciona a ordenação nomeada
    }

    Specification<FlashcardEntity> specification = flashcardSpecificationBuilder.build(deckId, "deckEntity");
    
    return flashcardRepository.findAll(specification, pageable).map(flashcardEntity -> {
      FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO> handler = handlerRegistry.getHandler(flashcardEntity.getFlashcardType());
      return handler.entityToDTO(flashcardEntity);
    });
  }

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

    FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO> handler = handlerRegistry.getHandler(flashcardDTO.getFlashcardType());
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

  @Transactional
  public FlashcardDTO getFlashcardById(Long flashcardId, Long userId) {
    FlashcardEntity flashcard = flashcardRepository.findById(flashcardId).orElseThrow(() -> new ObjectNotFoundException("Flashcard not found"));
    
    if(!flashcard.getDeckEntity().getUserEntity().getId().equals(userId)) {
      throw new UnauthorizedObjectAccessException("Unauthorized to get this flashcard");
    }

    FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO> handler = handlerRegistry.getHandler(flashcard.getFlashcardType());

    return handler.entityToDTO(flashcard);
  }

  @Transactional
  public int evaluateAnswer(Long flashcardId, UserAnswerDTO answer, Long userId) {
    FlashcardEntity flashcard = flashcardRepository.findById(flashcardId).orElseThrow(() -> new ObjectNotFoundException("Flashcard not found"));
    if(!flashcard.getDeckEntity().getUserEntity().getId().equals(userId)) {
      throw new UnauthorizedObjectAccessException("Unauthorized to review this flashcard");
    }
    FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO> handler = handlerRegistry.getHandler(flashcard.getFlashcardType());
    return handler.evaluateAnswer(flashcard, answer);
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
