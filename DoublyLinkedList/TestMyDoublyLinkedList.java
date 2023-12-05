public class TestMyDoublyLinkedList {
    public static void main(String[] args) {
        MyDoublyLinkedList list = new MyDoublyLinkedList();
        // list.addFirst(10); // first,last
        // list.addFirst(20); // first
        // list.addFirst(30);//first

        list.append(10); // first, last
        list.append(20); // last
        list.append(30); // last
        list.insert(25);
        list.insert(40);


        list.traverse();
        list.reverseTraverse();
    }   
}
