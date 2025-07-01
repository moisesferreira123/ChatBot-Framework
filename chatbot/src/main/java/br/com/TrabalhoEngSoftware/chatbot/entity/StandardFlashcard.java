package br.com.TrabalhoEngSoftware.chatbot.entity;

import br.com.TrabalhoEngSoftware.chatbot.enums.FlashcardType;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("STANDARD")
public class StandardFlashcard extends FlashcardEntity {
  @Column(nullable = false)
	private String front;
	
	@Column(nullable = false)
	private String back;

  public StandardFlashcard() {
    this.type = FlashcardType.STANDARD;
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
