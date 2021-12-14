package Core;

public class PoetExeption extends  Exception{
    public PoetExeption() {
    }

    public PoetExeption(String message) {
        super(message);
    }

    public PoetExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public PoetExeption(Throwable cause) {
        super(cause);
    }

    public PoetExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
