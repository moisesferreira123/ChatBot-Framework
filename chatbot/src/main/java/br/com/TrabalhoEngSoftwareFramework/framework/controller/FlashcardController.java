package br.com.TrabalhoEngSoftwareFramework.framework.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
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
import org.springframework.web.server.ResponseStatusException;

import br.com.TrabalhoEngSoftwareFramework.framework.dto.NoteDTO;
import br.com.TrabalhoEngSoftwareFramework.framework.dto.UserAnswerDTO;
import br.com.TrabalhoEngSoftwareFramework.framework.dto.FlashcardDTO;
import br.com.TrabalhoEngSoftwareFramework.framework.entity.UserEntity;
import br.com.TrabalhoEngSoftwareFramework.framework.service.FlashcardService;
import br.com.TrabalhoEngSoftwareFramework.framework.service.AiService;
import br.com.TrabalhoEngSoftwareFramework.framework.service.NoteService;

@RestController
@RequestMapping("api/flashcards")
public class FlashcardController {

  @Autowired
  private FlashcardService flashcardService;
  @Autowired
  private AiService aiService;
  @Autowired
  private NoteService noteService;

  public static class GenerateFlashcardsRequest {
    private int count = 5; // Default count
    private String provider;

    public int getCount() {
      return count;
    }

    public void setCount(int count) {
      this.count = count;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
  }

  @GetMapping
  public Page<FlashcardDTO> listFlashcards(
    @RequestParam(required = false) String word,
    @RequestParam(required = false) String flashcardFilter,
    @RequestParam(defaultValue = "lastReviewedAtDesc") String sortType,
    @RequestParam(required = true) Long deckId,
    Pageable pageable,
    Authentication authentication
  ) {
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
  public void evaluateAnswer(@PathVariable Long flashcardId, @RequestBody UserAnswerDTO answer, Authentication authentication) {
    UserEntity user = (UserEntity) authentication.getPrincipal();
    flashcardService.evaluateAnswer(flashcardId, answer, user.getId());
  }

  @PostMapping("/generate-from-note/{noteId}/deck/{deckId}")
  public ResponseEntity<List<FlashcardDTO>> generateFlashcardsFromNote(
      @PathVariable Long noteId,
      @PathVariable Long deckId,
      @RequestBody(required = false) GenerateFlashcardsRequest request,
      Authentication authentication) {
    UserEntity currentUser = (UserEntity) authentication.getPrincipal();

    NoteDTO note = noteService.getNoteById(noteId, currentUser.getId());
    if (note.getContent() == null || note.getContent().trim().isEmpty()) {
      // TODO: Colocar a exceção da nota
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Note content is empty, cannot generate flashcards.");
    }

    int count = (request != null) ? request.getCount() : 5;
    String provider = (request != null) ? request.getProvider() : "openAiChatClient";

    List<FlashcardDTO> suggestions = aiService.generateFlashcardSuggestions(note.getContent(),
        currentUser.getId(), count, provider);

    if (suggestions.isEmpty()) {
      return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ArrayList<>());
    }

    List<FlashcardDTO> createdFlashcards = flashcardService.createFlashcardsFromSuggestions(suggestions, deckId,
        currentUser.getId());
    return ResponseEntity.status(HttpStatus.CREATED).body(createdFlashcards);
  }
}
