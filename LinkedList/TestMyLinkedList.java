public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        // list.addFirst(10);
        // list.addFirst(20);
        // list.addFirst(30);

        // list.append(10);
        // list.append(20);
        // list.append(30);
        // list.append(45);
        // list.addFirst(22);
        
        // list.addAfter(33, 3);
        // list.addAfter(44, 6);
        // list.addAfter(34, 40);

        list.append(10);list.append(20);list.append(30);
        list.insert(25);
        list.insert(35);
        list.insert(5);
        list.insert(10);
        list.traverse(); 
        list.delete(25);
        list.traverse();
        
        System.out.println();
        System.out.println(list);
    }
}
