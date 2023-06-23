package Examples.Webinar_03.Homework.Exceptions;

public class WrongFormatException extends Exception {
    public WrongFormatException(String message) {
        super(message);
    }

    public WrongFormatException() {
    }
}