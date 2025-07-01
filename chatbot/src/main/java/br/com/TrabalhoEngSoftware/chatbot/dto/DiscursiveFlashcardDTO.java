package br.com.TrabalhoEngSoftware.chatbot.dto;

import br.com.TrabalhoEngSoftware.chatbot.entity.FlashcardEntity;

public class DiscursiveFlashcardDTO extends FlashcardDTO {
	private String question;
	private String userAnswer;
	private String exampleCorrectAnswer;

  public DiscursiveFlashcardDTO(FlashcardEntity flashcardEntity, String question, String userAnswer, String exampleCorrectAnswer) {
    super(flashcardEntity);
    this.question = question;
    this.userAnswer = userAnswer;
    this.exampleCorrectAnswer = exampleCorrectAnswer;
  }

  public DiscursiveFlashcardDTO() {
    super();
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
