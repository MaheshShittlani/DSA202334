import java.util.EmptyStackException;

public class MyLinkedList {
    private Node start;

    public MyLinkedList() {
        start = null;
    }

    public void addFirst(int item) {
        Node newNode = new Node(item);

        newNode.setLink(start); // newNode.link = start;
        start = newNode;
    }

    public void append(int item) {
        Node newNode = new Node(item);

        if(start == null) {
            start = newNode;
        } else {
            Node ptr = start;
            while(ptr.getLink() != null) {
                ptr = ptr.getLink();
            }
            ptr.setLink(newNode);
        }
    }

    /**
     * This method is used to insert an item into a list after given position.
     * @param item
     * @param position
     */
    public void addAfter(int item, int position) {
        Node ptr = start;

        for(int i = 1; ptr != null && i < position; i++) {
            ptr = ptr.getLink();
        }

        if(ptr == null) {
            System.out.println("Such position doesn't exists");
            return;
        }

        Node newNode = new Node(item);
        newNode.setLink(ptr.getLink());
        ptr.setLink(newNode);

    }

     /**
     * This method is used to insert an item into a list before given position.
     * @param item
     * @param position
     */
    public void addBefore(int item, int position) {

    }

    /**
     * This algorithm insert an item into sorted list.
     * @param item
     */
    public void insert(int item) {
        Node newNode = new Node(item);
        if(item < start.getData()) {
            newNode.setLink(start);
            start = newNode;
        } else {
            Node prev = start;
            Node ptr = start.getLink();
            while(ptr != null) {
                if(ptr.getData() >= item) {
                    break;
                }
                prev = ptr;
                ptr = ptr.getLink();
            }

            newNode.setLink(ptr);
            prev.setLink(newNode);
        }
    }

    /**
     * This algorithm deletes the item from the list.
     * @param item
     */
    public void delete(int item) {
        if(item == start.getData()) {
            Node ptr = start;
            start = start.getLink();
            ptr.setLink(null);
        } else {
            Node prev = start;
            Node ptr = start.getLink();

            while(ptr != null) {
                if(item == ptr.getData()) {
                    prev.setLink(ptr.getLink());
                    ptr.setLink(null);
                    return;
                }
                prev = ptr;
                ptr = ptr.getLink();
            }

            System.out.println("Item not found");
        }
    }

    public void traverse() {
        Node ptr = start;

        while(ptr != null) {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getLink();
        }

        System.out.println();
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("[");
        Node ptr = start;
        while(ptr != null) {
            if(ptr != start) {
                output.append(", ");
            }
            output.append("{"+ ptr.getData()+", "+ ptr.getLink() +"}");
            ptr = ptr.getLink();
        }
        output.append("]");
        return output.toString();
    }

    public void push(int item) {
        addFirst(item);
    }

    public int pop() throws EmptyStackException {
        if(start == null) {
            throw new EmptyStackException();
        }

        Node ptr = start; 
        start = start.getLink();
        ptr.setLink(null);
        return ptr.getData();
    }
}
