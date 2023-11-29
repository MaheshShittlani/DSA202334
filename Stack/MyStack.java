import java.util.EmptyStackException;

public class MyStack {
    private int[] stk;
    private int top; 
    private int size;

    public MyStack(int size) {
        this.size = size;
        top = -1;
        stk = new int[size];
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

    public void push(int item) {
        if(isFull()) {
            System.out.println("Stack is Full");
            return;
        }

        ++top;
        stk[top] = item;
    }

    public int pop() throws EmptyStackException {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        int item = stk[top];
        top--;
        return item;
    }

    public int peep() throws EmptyStackException {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        int item = stk[top];
        return item;
    }

}
