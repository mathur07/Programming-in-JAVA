package LinkedList;

public class LinkedListImplementation {
    Node head;
    Node tail;

    public Node create_node(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        return node;
    }

    public void insert_node_at_the_end(int data) {
        Node newNode = create_node(data);
        Node tempNode = head;
        if (head == null) {
            head = newNode;
        } else {
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
        print_list();
    }

    // uses O(1) Time Complexity in adding element at End.
    public void insert_node_at_the_end_using_tail(int data) {
        Node newNode = create_node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next=newNode;
            tail = newNode;
        }
        print_list();
    }

    public void insert_node_at_the_start(int data) {
        Node newNode = create_node(data);
        Node tempNode = head;
        newNode.next = head;
        head = newNode;
        print_list();

    }

    public void print_list() {
        Node tempNode = head;
        while (tempNode.next != null) {
            System.out.printf("->" + tempNode.data);
            tempNode = tempNode.next;
        }
        System.out.println("->" + tempNode.data);
    }
}
