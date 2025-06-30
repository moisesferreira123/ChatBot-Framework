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
@DiscriminatorValue("MULTIPLE ANSWERS")
public class MultipleAnswersFlashcard extends FlashcardEntity {
  @Column(nullable = false)
	private String question;

  @ElementCollection
  @CollectionTable(name = "multiple_answers_options", joinColumns = @JoinColumn(name = "flashcard_id"))
  @Column(nullable = false)
  private List<String> answerOptions;

  @ElementCollection
  @CollectionTable(name = "multiple_answers_options", joinColumns = @JoinColumn(name = "flashcard_id"))
  @Column(nullable = false)
	private List<Integer> correctAnswersIndex;

  public MultipleAnswersFlashcard() {
    this.type = FlashcardType.MULTIPLE_ANSWERS;
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

  public List<Integer> getCorrectAnswersIndex() {
    return correctAnswersIndex;
  }

  public void setCorrectAnswersIndex(List<Integer> correctAnswersIndex) {
    this.correctAnswersIndex = correctAnswersIndex;
  }
}
