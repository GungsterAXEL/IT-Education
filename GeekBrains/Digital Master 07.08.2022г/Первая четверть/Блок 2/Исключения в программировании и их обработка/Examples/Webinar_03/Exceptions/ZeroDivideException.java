package Examples.Webinar_03.Exceptions;

public class ZeroDivideException extends Exception {
    public ZeroDivideException() {
        super("Попытка деления на ноль.");
    }

    public ZeroDivideException(Throwable cause) {
        super("Попытка деления на ноль.", cause);
    }
}
