package homework.two;

public class NullStringException extends Exception{
    public NullStringException() {

    }

    public NullStringException(String message) {
        super(message);
    }

    public NullStringException(Throwable cause) {
        super(cause);
    }

    public NullStringException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullStringException(String message, Throwable cause, boolean enableSuppression,
                                      boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
