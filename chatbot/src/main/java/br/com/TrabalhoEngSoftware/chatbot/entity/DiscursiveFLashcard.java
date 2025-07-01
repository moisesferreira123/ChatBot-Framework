package br.com.TrabalhoEngSoftware.chatbot.entity;

import br.com.TrabalhoEngSoftware.chatbot.enums.FlashcardType;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("DISCURSIVE")
public class DiscursiveFLashcard extends FlashcardEntity{
  @Column(nullable = false)
	private String question;

  @Column(nullable = false)
	private String userAnswer;

  @Column(nullable = false)
	private String exampleCorrectAnswer;

  public DiscursiveFLashcard() {
    this.type = FlashcardType.DISCURSIVE;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public String getUserAnswer() {
    return userAnswer;
  }

  public void setUserAnswer(String userAnswer) {
    this.userAnswer = userAnswer;
  }

  public String getExampleCorrectAnswer() {
    return exampleCorrectAnswer;
  }

  public void setExampleCorrectAnswer(String exampleCorrectAnswer) {
    this.exampleCorrectAnswer = exampleCorrectAnswer;
  }
}
