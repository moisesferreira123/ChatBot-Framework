package br.com.TrabalhoEngSoftware.chatbot.dto;

import br.com.TrabalhoEngSoftware.chatbot.entity.FlashcardEntity;

public class TrueFalseFlashcardDTO extends FlashcardDTO {
  private String question;
  private boolean isTrue;

  public TrueFalseFlashcardDTO(FlashcardEntity flashcardEntity, String question, boolean isTrue) {
    super(flashcardEntity);
    this.question = question;
    this.isTrue = isTrue;
  }

  public TrueFalseFlashcardDTO() {
    super();
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public boolean isTrue() {
    return isTrue;
  }

  public void setTrue(boolean isTrue) {
    this.isTrue = isTrue;
  }
}
