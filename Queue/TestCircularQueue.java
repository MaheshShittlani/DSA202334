public class TestCircularQueue {
    public static void main(String[] args) throws Exception {
        MyCircularQueue q1 = new MyCircularQueue(5);

        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);

        q1.show();

        System.out.println("Popped from queue: "+ q1.dequeue());
        System.out.println("Popped from queue: "+ q1.dequeue());
        System.out.println("Popped from queue: "+ q1.dequeue());

        q1.enqueue(60);
        q1.enqueue(70);
        
        q1.show();

        System.out.println("Popped from queue: "+ q1.dequeue());
        System.out.println("Popped from queue: "+ q1.dequeue());

        q1.show();

        System.out.println("Popped from queue: "+ q1.dequeue());
        System.out.println("Popped from queue: "+ q1.dequeue());
        q1.show();

        System.out.println("Popped from queue: "+ q1.dequeue());
    }
}
