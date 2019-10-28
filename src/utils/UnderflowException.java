package utils;

public class UnderflowException extends RuntimeException {
    /**
     * Constructs a UnderflowException with no detail message.
     */
    public UnderflowException() {
    }

    /*
     * Constructs a UnderflowException with a detail message.
     * @param msg the detail mesage pertaining to this exception.
     */
    public UnderflowException(String msg) {
        super(msg);
    }
}