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
}
