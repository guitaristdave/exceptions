package homework.three.Exceptions;

public class IncorrectPhoneException extends Exception{
    public IncorrectPhoneException() {
    }

    public IncorrectPhoneException(String message) {
        super(message);
    }

    public IncorrectPhoneException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectPhoneException(Throwable cause) {
        super(cause);
    }

    public IncorrectPhoneException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
