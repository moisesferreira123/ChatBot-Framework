// src/main/java/br/com/TrabalhoEngSoftware/chatbot/dto/UserAnswerDTO.java
package br.com.TrabalhoEngSoftware.chatbot.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "flashcardType",
    visible = true
)
@JsonSubTypes({
    // IMPORTANTÍSSIMO: Como um Framework, você NÃO lista os subtipos aqui.
    // Esta lista seria mantida pelo PROJETO CLIENTE, caso eles precisem
    // de anotações explícitas de Jackson para seus subtipos específicos.
    // Exemplo de como o CLIENTE *poderia* adicionar (em sua própria cópia deste DTO ou via módulo Jackson):
    // @JsonSubTypes.Type(value = com.cliente.app.dto.StandardUserAnswerDTO.class, name = "STANDARD"),
    // @JsonSubTypes.Type(value = com.cliente.app.dto.MultipleChoiceUserAnswerDTO.class, name = "MULTIPLE_CHOICE")
})
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