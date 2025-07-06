package br.com.TrabalhoEngSoftwareFramework.framework.dto;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "flashcardType",
    visible = true
)
public abstract class UserAnswerDTO {

    // Identificador único do flashcard ao qual esta resposta se refere
    protected Long flashcardId; 
    
    // O tipo do flashcard, essencial para o roteamento correto no backend
    protected String flashcardType; 
  
    public UserAnswerDTO() {
        // Inicialização padrão ou vazia
    }

    public UserAnswerDTO(Long flashcardId, String flashcardType) {
        this.flashcardId = flashcardId;
        this.flashcardType = flashcardType;
    }

    // --- Getters e Setters ---

    public Long getFlashcardId() {
        return flashcardId;
    }

    public void setFlashcardId(Long flashcardId) {
        this.flashcardId = flashcardId;
    }

    public String getFlashcardType() {
        return flashcardType;
    }

    public void setFlashcardType(String flashcardType) {
        this.flashcardType = flashcardType;
    }
}