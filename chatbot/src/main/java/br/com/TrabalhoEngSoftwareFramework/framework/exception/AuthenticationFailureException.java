package br.com.TrabalhoEngSoftwareFramework.framework.exception;

public class AuthenticationFailureException extends RuntimeException {
  public AuthenticationFailureException(String message) {
    super(message);
  }
}
