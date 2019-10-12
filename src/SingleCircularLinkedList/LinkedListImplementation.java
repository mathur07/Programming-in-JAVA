package SingleCircularLinkedList;

public class LinkedListImplementation {
    Node head;
    Node tail;
    int list_size = 0;

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
        list_size++;
    }

    // uses O(1) Time Complexity in adding element at End.
    public void insert_node_at_the_end_using_tail(int data) {
        Node newNode = create_node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            newNode.next = head;
        }
        list_size++;
    }

    public void insert_node_at_the_start(int data) {
        Node newNode = create_node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;

        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
            list_size++;
        }
    }

    // insert node at nth position
    public void insert_node_at_nth_position(int data, int position) {
        if (position > list_size + 1 || position < 1) {
            System.out.println("Position = " + position + " is an Invalid Position!");
        } else if (position == 1) {
            insert_node_at_the_start(data);
        } else if (position == list_size) {
            insert_node_at_the_end_using_tail(data);
        } else {
            Node newNode = create_node(data);
            Node tempNode = head;
            while (position - 2 != 0) {
                position--;
                tempNode = tempNode.next;
            }
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            list_size++;
        }
    }

    public void print_list() {
        Node tempNode = head;
        while (tempNode.next != null) {
            System.out.printf("->" + tempNode.data);
            tempNode = tempNode.next;
        }
        System.out.println("->" + tempNode.data);
        System.out.println("list_size = " + list_size);
    }
}

