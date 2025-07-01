package br.com.TrabalhoEngSoftware.chatbot.dto;

import java.util.List;

import br.com.TrabalhoEngSoftware.chatbot.entity.FlashcardEntity;

public class MultipleChoiceFlashcardDTO extends FlashcardDTO {
  private String question;
  private List<String> answerOptions;
  private int correctAnswerIndex;

  public MultipleChoiceFlashcardDTO(FlashcardEntity flashcardEntity, String question, List<String> answerOptions, int correctAnswerIndex) {
    super(flashcardEntity);
    this.question = question;
    this.answerOptions = answerOptions;
    this.correctAnswerIndex = correctAnswerIndex;
  }

  public MultipleChoiceFlashcardDTO() {
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

  public int getCorrectAnswerIndex() {
    return correctAnswerIndex;
  }

  public void setCorrectAnswerIndex(int correctAnswerIndex) {
    this.correctAnswerIndex = correctAnswerIndex;
  }  
}
