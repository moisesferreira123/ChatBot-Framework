package br.com.TrabalhoEngSoftwareFramework.framework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.TrabalhoEngSoftwareFramework.framework.dto.DeckDTO;
import br.com.TrabalhoEngSoftwareFramework.framework.dto.DeckSummaryDTO;
import br.com.TrabalhoEngSoftwareFramework.framework.entity.DeckEntity;
import br.com.TrabalhoEngSoftwareFramework.framework.entity.UserEntity;
import br.com.TrabalhoEngSoftwareFramework.framework.exception.InvalidObjectDataException;
import br.com.TrabalhoEngSoftwareFramework.framework.exception.ObjectNotFoundException;
import br.com.TrabalhoEngSoftwareFramework.framework.exception.UnauthorizedObjectAccessException;
import br.com.TrabalhoEngSoftwareFramework.framework.repository.DeckRepository;
import br.com.TrabalhoEngSoftwareFramework.framework.specification.DeckSpecificationBuilder;

@Service
public abstract class DeckService {
  
  @Autowired
  protected DeckRepository deckRepository;

  @Autowired
  protected TopicService topics;

  public DeckService (DeckRepository deckRepository) {
    this.deckRepository = deckRepository;
  }

  @Transactional
  public void createDeck(DeckDTO deckDTO, Long userId) {
    topics.addTopic(deckDTO.getTopic().trim());
    DeckEntity deck = new DeckEntity();
    if(deckDTO.getTitle() == null || deckDTO.getTitle().trim().isEmpty()) {
      throw new InvalidObjectDataException("Deck title can't be empty");
    }
    deck.setTitle(deckDTO.getTitle().trim());
    deck.setTopic(deckDTO.getTopic().trim());
    deck.setUserEntity(new UserEntity(userId));
    deckRepository.save(deck);
  }

  public Page<DeckSummaryDTO> listDecks(String title, String topic, Long userId, String sortType, Pageable pageable) {
    DeckSpecificationBuilder builder = new DeckSpecificationBuilder(title, topic);
    builder.addSpecification("filterByTitle");
    builder.addSpecification("filterByTopic");

    if(sortType != null && !sortType.trim().isEmpty()) {
      builder.addSpecification(sortType); // Adiciona a ordenação nomeada
    }

    Specification<DeckEntity> specification = builder.build(userId, "userEntity");
    return deckRepository.findAll(specification, pageable).map(DeckSummaryDTO::new);
  }

  @Transactional 
  public DeckSummaryDTO updateDeck(Long deckId, DeckSummaryDTO deckSummaryDTO, Long userId) {
    DeckEntity deck = deckRepository.findById(deckId).orElseThrow(() -> new ObjectNotFoundException("Deck not found"));
    
    topics.updateTopic(deck.getTopic(), deckSummaryDTO.getTopic());

    if(!deck.getUserEntity().getId().equals(userId)) {
      throw new UnauthorizedObjectAccessException("Unauthorized to edit this deck");
    }
    
    if(deckSummaryDTO.getTitle() != null) {
      if(deckSummaryDTO.getTitle().trim().isEmpty()) {
        throw new InvalidObjectDataException("Title deck can't be empty");
			}
	    deck.setTitle(deckSummaryDTO.getTitle());
    }

    if(deckSummaryDTO.getTopic() != null){
      deck.setTopic(deckSummaryDTO.getTopic());
    }

    return new DeckSummaryDTO(deckRepository.save(deck));
  }

  @Transactional
  public void deleteDeck(Long deckId, Long userId) {
		DeckEntity deck = deckRepository.findById(deckId).orElseThrow(() -> new ObjectNotFoundException("Deck not found"));
    topics.removeTopic(deck.getTopic().trim());
		if(!deck.getUserEntity().getId().equals(userId)) {
			throw new UnauthorizedObjectAccessException("Unauthorized to delete this deck");
		}
		deckRepository.delete(deck);
  }

  public long getFlashcardsTotal(Long deckId, Long userId) {
    DeckEntity deck = deckRepository.findById(deckId).orElseThrow(() -> new ObjectNotFoundException("Deck not found"));
    if(!deck.getUserEntity().getId().equals(userId)) {
			throw new UnauthorizedObjectAccessException("Unauthorized to see due flashcards total this deck");
		}
    long flashcardsTotal = deck.getFlashcards().size();
    return flashcardsTotal;
  }
}
