package br.com.TrabalhoEngSoftware.chatbot.controller;

import br.com.TrabalhoEngSoftware.chatbot.entity.UserEntity;
import br.com.TrabalhoEngSoftware.chatbot.service.AiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.util.List;

class CompletionRequest {
    private String systemPrompt;
    private String userPrompt;
    private Long noteId;
    private List<Long> sourceIds;
    private String provider;

    public String getSystemPrompt() { return systemPrompt; }
    public void setSystemPrompt(String systemPrompt) { this.systemPrompt = systemPrompt; }
    public String getUserPrompt() { return userPrompt; }
    public void setUserPrompt(String userPrompt) { this.userPrompt = userPrompt; }
    public Long getNoteId() { return noteId; }
    public void setNoteId(Long noteId) { this.noteId = noteId; }
    public List<Long> getSourceIds() { return sourceIds; }
    public void setSourceIds(List<Long> sourceIds) { this.sourceIds = sourceIds; }
    public String getProvider() { return provider; }
    public void setProvider(String provider) { this.provider = provider; }
}

@RestController
@RequestMapping("/api/ai")
public class AiController {

    private final AiService aiService;

    @Autowired
    public AiController(AiService aiService) {
        this.aiService = aiService;
    }

    @PostMapping("/complete")
    public String complete(@RequestBody CompletionRequest request, Authentication authentication) {
        UserEntity currentUser = (UserEntity) authentication.getPrincipal();
        return aiService.getCompletion(
            request.getSystemPrompt(),
            request.getUserPrompt(),
            request.getNoteId(),
            request.getSourceIds(),
            currentUser.getId(),
            request.getProvider()
        );
    }

    @PostMapping(value = "/complete-stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> completeStream(@RequestBody CompletionRequest request, Authentication authentication) {
        UserEntity currentUser = (UserEntity) authentication.getPrincipal();
        return aiService.getStreamCompletion(
            request.getSystemPrompt(),
            request.getUserPrompt(),
            request.getNoteId(),
            request.getSourceIds(),
            currentUser.getId(),
            request.getProvider()
        );
    }
}
