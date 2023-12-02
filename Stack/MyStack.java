import java.util.EmptyStackException;

public class MyStack {
    private char[] stk;
    private int top; 
    private int size;

    public MyStack(int size) {
        this.size = size;
        top = -1;
        stk = new char[size];
    }

    public MyStack() {
        this(16);
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(char item) {
        if(isFull()) {
            System.out.println("Stack is Full");
            return;
        }

        ++top;
        stk[top] = item;
    }

    public char pop() throws EmptyStackException {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        char item = stk[top];
        top--;
        return item;
    }

    public char peep() throws EmptyStackException {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        char item = stk[top];
        return item;
    }

}
