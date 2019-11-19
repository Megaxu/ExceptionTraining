package exception;

public class IncorrectEmailException extends RuntimeException {

    public IncorrectEmailException(String message) {
        super("Wrong format email: " + message + ". Correct format: vasily.petrov@gmail.com");
    }
}
