import java.util.EmptyStackException;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack s1 = new MyStack(5);
        s1.push(10);
        s1.push(20);
        s1.push(-1);

        int item;
        try {
            item = s1.pop();
            System.out.println("Top element: " + item);
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }
        
        try {
            item = s1.pop();
            System.out.println("Top element: " + item);
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }
        
        try {
            item = s1.pop();
            System.out.println("Top element: " + item);
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }

        try {
            item = s1.pop();
            System.out.println("Top element: " + item);
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }
    }    
}
