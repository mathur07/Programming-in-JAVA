package Tree.BinaryTree.BinarySearchTree;

public class BinarySearchTreeMain {
    public static void main(String[] args) {
        BinarySearchTreeImplementation bst = new BinarySearchTreeImplementation();

        bst.create_tree();
        bst.insert_element(10);
        bst.insert_element(7);
        bst.insert_element(8);
        bst.insert_element(30);
        bst.insert_element(35);
        bst.insert_element(5);
        bst.insert_element(25);
        bst.insert_element(26);
//        bst.in_order_traversal(bst.root);
        bst.level_order_traversal();

        System.out.println();
        bst.delete_element(5);
    }
}
