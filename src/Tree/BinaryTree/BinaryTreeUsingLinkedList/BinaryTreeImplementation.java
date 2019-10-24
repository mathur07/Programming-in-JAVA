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

    public void level_order_traversal() {
        for (int i = 0; i <= lastUsedIndex; i++) {
            System.out.printf(queue[i].data + " ");
        }
        System.out.println();

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
