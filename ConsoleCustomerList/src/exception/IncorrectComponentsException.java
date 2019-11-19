package exception;

public class IncorrectComponentsException extends RuntimeException {

  public IncorrectComponentsException(String message) {
    super("Wrong format: " + message + ". Correct format: Василий Петров " +
        "vasily.petrov@gmail.com +79215637722");
  }
}
