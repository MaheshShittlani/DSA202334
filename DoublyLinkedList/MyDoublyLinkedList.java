public class MyDoublyLinkedList {
    private Node first;
    private Node last;

    public MyDoublyLinkedList() {
        first = null;
        last = null;
    }

    public void traverse() {
        Node ptr = first;
        while(ptr != null) {
            System.out.print(ptr.getData()+ " ");
            ptr = ptr.getNext();
        }
        System.out.println();
    }

    public void reverseTraverse() {
        Node ptr = last;

        while(ptr != null) {
            System.out.print(ptr.getData()+ " ");
            ptr = ptr.getPrev();
        }
        System.out.println();
    }

    public void addFirst(int item) {
        Node newNode = new Node(item);

        if(first == null) {
            first = last = newNode;
        } else {
            newNode.setNext(first);
            first.setPrev(newNode);
            first = newNode;
        }
    }

    public void append(int item) {
        Node newNode = new Node(item);

        if(first == null) { // List is empty
            first = last = newNode;
        } else { // List is not empty
            last.setNext(newNode);
            newNode.setPrev(last);
            last = newNode;
        }
    }

    public void insert(int item) {
        Node newNode = new Node(item);

        // If list is empty
        if(first == null) {
            first = last = newNode;
            return;
        }

        // Item < first.data
        if(item < first.getData()) {
            newNode.setNext(first);
            first.setPrev(newNode);
            first = newNode;
            return;
        }

        Node save = first;
        Node ptr = first.getNext();

        while(ptr != null) {
            if(item < ptr.getData()) {
                save.setNext(newNode);
                newNode.setPrev(save);

                newNode.setNext(ptr);
                ptr.setPrev(newNode);
                return;
            }

            save = ptr;
            ptr = ptr.getNext();
        }

        // Item insert at the last
        save.setNext(newNode);
        newNode.setPrev(save);
        last = newNode;
    }

    public void delete(int item) {
        
    }
}
