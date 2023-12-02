public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue q1 = new MyQueue(5);
        
        try {
            q1.enqueue(10);
            q1.enqueue(20);
            q1.enqueue(30);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int item;

        try {
            item = q1.dequeue();
            System.out.println("Item: " + item);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            item = q1.dequeue();
            System.out.println("Item: " + item);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            item = q1.dequeue();
            System.out.println("Item: " + item);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            item = q1.dequeue();
            System.out.println("Item: " + item);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }    
}
