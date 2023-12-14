public class TestBST {
    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(10);
        tree.insert(20);
        tree.insert(5);

        tree.inorderTraverse();
    }    
}
