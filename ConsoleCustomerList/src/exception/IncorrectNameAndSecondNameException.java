package exception;

public class IncorrectNameAndSecondNameException extends RuntimeException {

  public IncorrectNameAndSecondNameException(String message) {
    super("Wrong format: " + message + ". Correct format: Василий Петров");
  }
}
