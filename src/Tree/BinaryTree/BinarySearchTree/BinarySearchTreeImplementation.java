package Tree.BinaryTree.BinarySearchTree;

public class BinarySearchTreeImplementation {

    Node root;

    void create_tree() {
        root = null;
    }

    private Node create_node(int data) {
        Node newNode = new Node();
        newNode.data = data;
        return newNode;
    }

    void insert_element(int data) {
        Node newNode = create_node(data);
        root = insert_element_recursively(root, newNode);
    }

    private Node insert_element_recursively(Node root, Node newNode) {
        if (root == null) {
            root = newNode;
        } else if (newNode.data <= root.data) {
            root.leftSubTree = insert_element_recursively(root.leftSubTree, newNode);
        } else {
            root.rightSubTree = insert_element_recursively(root.rightSubTree, newNode);
        }
        return root;
    }

    public void level_order_traversal() {
        Node[] queue = new Node[20];
        int pointerIndex = 0, lastUsedIndex = 0;
        queue[pointerIndex] = root;
        while (pointerIndex <= lastUsedIndex) {
            if (queue[pointerIndex].leftSubTree != null) {
                lastUsedIndex++;
                queue[lastUsedIndex] = queue[pointerIndex].leftSubTree;
            }
            if (queue[pointerIndex].rightSubTree != null) {
                lastUsedIndex++;
                queue[lastUsedIndex] = queue[pointerIndex].rightSubTree;
            }
            System.out.print(queue[pointerIndex].data + " ");
            pointerIndex++;
        }

    }

    void in_order_traversal(Node root) {
        if (root != null) {
            in_order_traversal(root.leftSubTree);
            System.out.print(root.data + " ");
            in_order_traversal(root.rightSubTree);
        }
    }

}



