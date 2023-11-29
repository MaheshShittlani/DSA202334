public class UnderflowException extends Exception {
    public UnderflowException(String msg) {
        super(msg);
    }

    public UnderflowException() {
        super("Stack is empty");
    }
}
