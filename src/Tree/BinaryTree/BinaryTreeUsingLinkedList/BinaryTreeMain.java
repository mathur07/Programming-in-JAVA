package Tree.BinaryTree.BinaryTreeUsingLinkedList;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTreeImplementation bt = new BinaryTreeImplementation();

        bt.create_tree();
        bt.level_order_traversal();
        bt.insert_node(1);
        bt.level_order_traversal();
        bt.insert_node(2);
        bt.level_order_traversal();
        bt.insert_node(3);
        bt.level_order_traversal();
        bt.insert_node(4);
        bt.level_order_traversal();
        bt.insert_node(5);
        bt.level_order_traversal();
        bt.insert_node(6);
        bt.level_order_traversal();
        bt.insert_node(7);
        System.out.println("Level Order Traversal : ");
        bt.level_order_traversal();
        System.out.println("Pre Order Traversal : ");
        bt.pre_order_traversal(bt.root);
        System.out.println();
        System.out.println("In Order Traversal : ");
        bt.in_order_traversal(bt.root);
        System.out.println();
        System.out.println("Post Order Traversal : ");
        bt.post_order_traversal(bt.root);
    }
}
