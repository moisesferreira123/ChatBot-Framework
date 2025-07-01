package br.com.TrabalhoEngSoftware.chatbot.dto;

import br.com.TrabalhoEngSoftware.chatbot.entity.FlashcardEntity;

public class StandardFlashcardDTO extends FlashcardDTO {
  private String front;
  private String back;

  public StandardFlashcardDTO(FlashcardEntity flashcardEntity, String front, String back) {
    super(flashcardEntity);
    this.front = front;
    this.back = back;
  }

  public StandardFlashcardDTO() {
    super();
  }

  public String getFront() {
    return front;
  }

  public void setFront(String front) {
    this.front = front;
  }

  public String getBack() {
    return back;
  }

  public void setBack(String back) {
    this.back = back;
  }
}
