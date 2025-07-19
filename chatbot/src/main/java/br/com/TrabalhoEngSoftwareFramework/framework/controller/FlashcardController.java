package br.com.TrabalhoEngSoftwareFramework.framework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.TrabalhoEngSoftwareFramework.framework.dto.UserAnswerDTO;
import br.com.TrabalhoEngSoftwareFramework.framework.dto.FlashcardDTO;
import br.com.TrabalhoEngSoftwareFramework.framework.entity.UserEntity;
import br.com.TrabalhoEngSoftwareFramework.framework.service.FlashcardService;

@RestController
@RequestMapping("api/flashcards")
public abstract class FlashcardController {

  @Autowired
  private FlashcardService flashcardService;

  @GetMapping
  public Page<FlashcardDTO> listFlashcards(
      @RequestParam(required = false) String word,
      @RequestParam(required = false) String flashcardFilter,
      @RequestParam(defaultValue = "lastReviewedAtDesc") String sortType,
      @RequestParam(required = true) Long deckId,
      Pageable pageable,
      Authentication authentication) {
    UserEntity user = (UserEntity) authentication.getPrincipal();
    return flashcardService.listFlashcards(word, flashcardFilter, user.getId(), deckId, sortType, pageable);
  }

  @PostMapping("/{deckId}")
  public void createFlashcard(@RequestBody FlashcardDTO flashcardDTO, @PathVariable Long deckId) {
    flashcardService.createFlashcard(flashcardDTO, deckId);
  }

  @PutMapping("/{flashcardId}")
  public void updateFlashcard(
      @PathVariable Long flashcardId,
      @RequestBody FlashcardDTO flashcardDTO,
      Authentication authentication) {
    UserEntity user = (UserEntity) authentication.getPrincipal();
    flashcardService.updateFlashcard(flashcardId, flashcardDTO, user.getId());
  }

  @DeleteMapping("/{flashcardId}")
  public void deleteFlashcard(@PathVariable Long flashcardId, Authentication authentication) {
    UserEntity user = (UserEntity) authentication.getPrincipal();
    flashcardService.deleteFlashcard(flashcardId, user.getId());
  }

  @GetMapping("/{flashcardId}")
  public FlashcardDTO getFlashcardById(@PathVariable Long flashcardId, Authentication authentication) {
    UserEntity user = (UserEntity) authentication.getPrincipal();
    return flashcardService.getFlashcardById(flashcardId, user.getId());
  }

  @PutMapping("/evaluate-answer/{flashcardId}")
  public void evaluateAnswer(@PathVariable Long flashcardId, @RequestBody UserAnswerDTO answer,
      Authentication authentication) {
    UserEntity user = (UserEntity) authentication.getPrincipal();
    flashcardService.evaluateAnswer(flashcardId, answer, user.getId());
  }
}
