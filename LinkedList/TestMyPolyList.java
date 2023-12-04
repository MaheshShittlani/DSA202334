public class TestMyPolyList {
    public static void main(String[] args) {
        MyPolyLinkedList l1 = new MyPolyLinkedList();
        MyPolyLinkedList l2 = new MyPolyLinkedList();

        l1.append(2, 2); l1.append(5, 1); l1.append(3, 0);

        l2.append(4, 3); l2.append(3, 2); l2.append(5, 1);

        l1.addPoly(l2);
    }
}
