package br.com.TrabalhoEngSoftware.chatbot.entity;

import br.com.TrabalhoEngSoftware.chatbot.enums.FlashcardType;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("TRUE OR FALSE")
public class TrueFalseFlashcard extends FlashcardEntity {
  @Column(nullable = false)
  private String question;

  @Column(nullable = false)
  private boolean isTrue;

  public TrueFalseFlashcard() {
    this.type = FlashcardType.TRUE_FALSE;
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
