package Exceptions;

public class GreatherThanZeroException extends Exception {
    public GreatherThanZeroException() {
        super("");
    }

    public GreatherThanZeroException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
