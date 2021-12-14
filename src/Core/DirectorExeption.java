package Core;

public class DirectorExeption extends RuntimeException {
    public DirectorExeption() {
    }

    public DirectorExeption(String message) {
        super(message);
    }

    public DirectorExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public DirectorExeption(Throwable cause) {
        super(cause);
    }

    public DirectorExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
