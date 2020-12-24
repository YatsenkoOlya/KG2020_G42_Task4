package models;

public class LinePlaneParallelException extends Exception {
    public LinePlaneParallelException() {
        super();
    }

    public LinePlaneParallelException(String message) {
        super(message);
    }

    public LinePlaneParallelException(String message, Throwable cause) {
        super(message, cause);
    }

    public LinePlaneParallelException(Throwable cause) {
        super(cause);
    }

    protected LinePlaneParallelException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
