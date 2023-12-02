public class MyQueue {
    private int[] data;
    private int front, rear;
    private int size;

    public MyQueue(int size) {
        this.size = size;
        data = new int[size];
        front = -1;
        rear = -1;
    }

    public MyQueue() {
        this(16);
    }

    public boolean isFull() {
        return rear == size - 1;
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
        if(front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
        return item;
    }
}
