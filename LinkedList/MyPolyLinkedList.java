public class MyPolyLinkedList {
    private PolyNode start;

    public MyPolyLinkedList() {
        start = null;
    }

    public void traverse() {
        PolyNode ptr = start;

        while(ptr != null) {
            System.out.print("{" + ptr.getCoff()+", " + ptr.getPow() + "}");
            ptr = ptr.getLink();
        }

        System.out.println();
    }

    public void append(int coff, int pow) {
        PolyNode newNode = new PolyNode(coff, pow);

        if(start == null) {
            start = newNode;
        } else {
            PolyNode ptr = start;
            while(ptr.getLink() != null) {
                ptr = ptr.getLink();
            }
            ptr.setLink(newNode);
        }
    }

    public MyPolyLinkedList addPoly(MyPolyLinkedList list) {
        MyPolyLinkedList result = new MyPolyLinkedList();

        // Merge

        return result;
    }
}
