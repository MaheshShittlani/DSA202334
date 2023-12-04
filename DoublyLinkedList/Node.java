public class Node {
    private int data;
    private Node prev;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }    

    /**
     * @return int return the data
     */
    public int getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * @return Node return the prev
     */
    public Node getPrev() {
        return prev;
    }

    /**
     * @param prev the prev to set
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     * @return Node return the next
     */
    public Node getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node next) {
        this.next = next;
    }

}