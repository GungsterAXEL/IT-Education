package Examples.Webinar_03.Exceptions;

public class FileNotExistException extends Exception{
    public FileNotExistException(String message) {
        super(message);
    }

    public FileNotExistException() {
    }
}
