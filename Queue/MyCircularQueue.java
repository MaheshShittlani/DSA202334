import java.util.Arrays;

public class MyCircularQueue {
    private int[] data;
    private int front, rear;
    private int size;

    public MyCircularQueue(int size) {
        this.size = size;
        data = new int[size];
        front = -1;
        rear = -1;
    }

    public MyCircularQueue() {
        this(16);
    }

    public boolean isFull() {
        return (front == 0 && rear == size - 1) || (front == rear + 1) ;
    }

    public boolean isEmpty() {
        return front == - 1;
    }

    public void enqueue(int item) throws Exception {
        if( isFull() ) {
            throw new Exception("Queue is full");
        }

        if(front == -1) {
            front = rear = 0;
        } else if(rear == size - 1) {
            rear = 0;  
        } else {
            rear++;
        }
        data[rear] = item;
    }

    public int dequeue() throws Exception {
        if( isEmpty() ) {
            throw new Exception("Queue is empty");
        }

        int item = data[front];
        data[front] = 0;
        if(front == rear) {
            front = rear = -1;
        } else if(front == size - 1) {
            front = 0;
        } else {
            front++;
        }
        return item;
    }

    public void show() {
        System.out.println(Arrays.toString(data));
    }
}
