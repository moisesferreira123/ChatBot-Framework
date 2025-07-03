package br.com.TrabalhoEngSoftwareFramework.framework.exception;

public class IncorrectPasswordException extends RuntimeException {
  public IncorrectPasswordException(String message) {
    super(message);
  }
}
