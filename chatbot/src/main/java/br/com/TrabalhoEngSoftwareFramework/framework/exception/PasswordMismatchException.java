package br.com.TrabalhoEngSoftwareFramework.framework.exception;

public class PasswordMismatchException extends RuntimeException {
  public PasswordMismatchException(String message) {
    super(message);
  }
}
