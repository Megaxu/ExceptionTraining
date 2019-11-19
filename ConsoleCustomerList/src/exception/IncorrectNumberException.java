package exception;

public class IncorrectNumberException extends RuntimeException {

  public IncorrectNumberException(String message) {
    super("Wrong format telephone number: " + message + ". Correct format: +79215637722");
  }
}
