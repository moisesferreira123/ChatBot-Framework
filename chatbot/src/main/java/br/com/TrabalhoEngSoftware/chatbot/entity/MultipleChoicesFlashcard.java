package br.com.TrabalhoEngSoftware.chatbot.entity;

import java.util.List;

import br.com.TrabalhoEngSoftware.chatbot.enums.FlashcardType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;

@Entity
@DiscriminatorValue("MULTIPLE CHOICE")
public class MultipleChoicesFlashcard extends FlashcardEntity {
  @Column(nullable = false)
	private String question;

  @ElementCollection
  @CollectionTable(name = "multiple_choices_options", joinColumns = @JoinColumn(name = "flashcard_id"))
  @Column(nullable = false)
  private List<String> answerOptions;

  @Column(nullable = false)
	private int correctAnswerIndex;

  public MultipleChoicesFlashcard() {
    this.type = FlashcardType.MULTIPLE_CHOICES;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public List<String> getAnswerOptions() {
    return answerOptions;
  }

  public void setAnswerOptions(List<String> answerOptions) {
    this.answerOptions = answerOptions;
  }

  public int getCorrectAnswerIndex() {
    return correctAnswerIndex;
  }

  public void setCorrectAnswerIndex(int correctAnswerIndex) {
    this.correctAnswerIndex = correctAnswerIndex;
  }
}
