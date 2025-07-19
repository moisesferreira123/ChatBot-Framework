package br.com.TrabalhoEngSoftwareFramework.framework.controller;

import br.com.TrabalhoEngSoftwareFramework.framework.dto.FlashcardDTO;
import br.com.TrabalhoEngSoftwareFramework.framework.entity.UserEntity;
import br.com.TrabalhoEngSoftwareFramework.framework.service.AiService;
import br.com.TrabalhoEngSoftwareFramework.framework.service.FlashcardService;
import br.com.TrabalhoEngSoftwareFramework.framework.service.prompt.PromptBuilder;

import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

class CompletionRequest {
    private List<String> userPrompts;
    private Long noteId;              
    private List<Long> sourceIds;

    public List<String> getUserPrompts() {
        return userPrompts;
    }

    public void setUserPrompt(List<String> userPrompts) {
        this.userPrompts = userPrompts;
    }

    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    public List<Long> getSourceIds() {
        return sourceIds;
    }

    public void setSourceIds(List<Long> sourceIds) {
        this.sourceIds = sourceIds;
    }
}

class GenerateFlashcardsRequest extends CompletionRequest {
    static final int DEFAULT_FLASHCARD_COUNT = 5;
    private int count = DEFAULT_FLASHCARD_COUNT;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

@RestController
@RequestMapping("/api/ai")
public class AiController {
    @Autowired
    private AiService aiService;
    @Autowired
    private FlashcardService flashcardService;
    @Autowired
    private PromptBuilder promptBuilder;

    @PostMapping("/complete/chat")
    public String chatCompletion(@RequestBody CompletionRequest request, Authentication authentication) {
        String sysprompt = "";
        UserEntity currentUser = (UserEntity) authentication.getPrincipal();
        // TODO: Permitir que o cliente customize o prompt de sistema

        Prompt prompt = promptBuilder.withSystemMessage(sysprompt)
                .withSourceContext(request.getSourceIds(), request.getNoteId(), currentUser.getId()).build();
        return aiService.getCompletion(prompt);
    }

    @PostMapping("/complete/note")
    public String noteCompletion(@RequestBody CompletionRequest request, Authentication authentication) {
        String sysprompt = "";
        UserEntity currentUser = (UserEntity) authentication.getPrincipal();
        // TODO: Permitir que o cliente customize o prompt de sistema

        Prompt prompt = promptBuilder.withSystemMessage(sysprompt)
                .withSourceContext(request.getSourceIds(), request.getNoteId(), currentUser.getId()).build();
        return aiService.getCompletion(prompt);
    }

    @PostMapping("/generate/flashcard/{deckId}")
    public ResponseEntity<List<FlashcardDTO>> generateFlashcards(@PathVariable Long deckId,
            @RequestBody GenerateFlashcardsRequest request, Authentication authentication) {
        String sysprompt = "";
        UserEntity currentUser = (UserEntity) authentication.getPrincipal();

        int count = (request != null) ? request.getCount() : GenerateFlashcardsRequest.DEFAULT_FLASHCARD_COUNT;

        Prompt prompt = promptBuilder.withSystemMessage(sysprompt)
                .withStructuredOutput(sysprompt, FlashcardDTO.class, count)
                .withSourceContext(request.getSourceIds(), request.getNoteId(), currentUser.getId()).build();
        List<FlashcardDTO> suggestions = aiService.getJsonCompletion(prompt, new ParameterizedTypeReference<List<FlashcardDTO>>(){});
        if (suggestions.isEmpty()) {
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ArrayList<>());
        }

        List<FlashcardDTO> createdFlashcards = flashcardService.createFlashcardsFromSuggestions(suggestions, deckId,
                currentUser.getId());
        return ResponseEntity.status(HttpStatus.CREATED).body(createdFlashcards);
    }

    @PostMapping(value = "/complete-stream/chat", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> chatStreamCompletion(@RequestBody CompletionRequest request, Authentication authentication) {
        String sysprompt = "";
        // TODO: Permitir que o cliente customize o prompt de sistema

        UserEntity currentUser = (UserEntity) authentication.getPrincipal();
        Prompt prompt = promptBuilder.withSystemMessage(sysprompt)
                .withSourceContext(request.getSourceIds(), request.getNoteId(), currentUser.getId()).build();
        return aiService.getStreamCompletion(prompt);
    }

    @PostMapping(value = "/complete-stream/note", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> noteStreamCompletion(@RequestBody CompletionRequest request, Authentication authentication) {
        String sysprompt = "";
        // TODO: Permitir que o cliente customize o prompt de sistema

        UserEntity currentUser = (UserEntity) authentication.getPrincipal();
        Prompt prompt = promptBuilder.withSystemMessage(sysprompt)
                .withSourceContext(request.getSourceIds(), request.getNoteId(), currentUser.getId()).build();
        return aiService.getStreamCompletion(prompt);
    }
}
