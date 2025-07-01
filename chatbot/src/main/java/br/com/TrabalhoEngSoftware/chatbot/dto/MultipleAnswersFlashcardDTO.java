package br.com.TrabalhoEngSoftware.chatbot.dto;

import java.util.List;

import br.com.TrabalhoEngSoftware.chatbot.entity.FlashcardEntity;

public class MultipleAnswersFlashcardDTO extends FlashcardDTO {
	private String question;
  private List<String> answerOptions;
	private List<Integer> correctAnswersIndex;

  public MultipleAnswersFlashcardDTO(FlashcardEntity flashcardEntity, String question, List<String> answerOptions, List<Integer> correctAnswersIndex) {
    super(flashcardEntity);
    this.question = question;
    this.answerOptions = answerOptions;
    this.correctAnswersIndex = correctAnswersIndex;
  }

  public MultipleAnswersFlashcardDTO() {
    super();
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
