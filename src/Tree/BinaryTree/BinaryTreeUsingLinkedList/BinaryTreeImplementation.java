package Tree.BinaryTree.BinaryTreeUsingLinkedList;

public class BinaryTreeImplementation {

    Node root;
    Node[] queue = new Node[20];
    int pointerIndex = 0;
    int lastUsedIndex = 0;

    public void create_tree() {
        root = null;
    }

    public Node create_node(int data) {
        Node newNode = new Node();
        newNode.data = data;
        return newNode;
    }

    public void insert_node(int data) {
        Node newNode = create_node(data);
        if (is_empty()) {
            root = newNode;
            queue[pointerIndex] = newNode;
        } else {
            while (true) {
                if (queue[pointerIndex].leftSubTree == null) {
                    queue[pointerIndex].leftSubTree = newNode;
                    lastUsedIndex++;
                    queue[lastUsedIndex] = newNode;
                    break;
                } else if (queue[pointerIndex].rightSubTree == null) {
                    queue[pointerIndex].rightSubTree = newNode;
                    lastUsedIndex++;
                    queue[lastUsedIndex] = newNode;
                    break;
                }
                pointerIndex++;
            }
        }
    }

    public void pre_order_traversal(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.printf(root.data + " ");
            pre_order_traversal(root.leftSubTree);
            pre_order_traversal(root.rightSubTree);
        }
    }

    public void in_order_traversal(Node root) {
        if (root == null) {
            return;
        } else {
            in_order_traversal(root.leftSubTree);
            System.out.printf(root.data + " ");
            in_order_traversal(root.rightSubTree);
        }
    }

    public void post_order_traversal(Node root) {
        if (root == null) {
            return;
        } else {
            post_order_traversal(root.leftSubTree);
            post_order_traversal(root.rightSubTree);
            System.out.printf(root.data + " ");
        }
    }

    public void level_order_traversal() {
        if (is_empty()) {
            System.out.println("Tree Is Empty! Nothing to Traverse!");
        } else {
            for (int i = 0; i <= lastUsedIndex; i++) {
                System.out.printf(queue[i].data + " ");
            }
            System.out.println();
        }
//        Stream.of(queue).forEach(x -> {
//            System.out.printf(x.data + " ");
//        });
    }

    public boolean is_empty() {
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

}
