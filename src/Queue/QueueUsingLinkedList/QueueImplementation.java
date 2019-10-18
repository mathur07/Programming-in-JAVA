package Queue.QueueUsingLinkedList;

public class QueueImplementation {
    Node head;
    Node tail;

    public void create_queue() {
        head = null;
        tail = null;
    }

    public Node create_node(int data) {
        Node newNode = new Node();
        newNode.data = data;
        return newNode;
    }

    public void en_queue(int data) {
        Node newNode = create_node(data);
        if (is_empty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void de_queue() {
        if (is_empty()) {
            System.out.println("Queue is Empty!, Cannot DeQueue!");
        } else if (head==tail) {
            head=tail=null;
        } else {
            head = head.next;

        }
    }

    public boolean is_empty() {
        if (head == null && tail == null) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (is_empty()){
            System.out.println("queue_start_value = " + null);
            System.out.println("queue_end_value = " + null);
        } else {
            System.out.println("queue_start_value = " + head.data);
            System.out.println("queue_end_value = " + tail.data);
        }

    }

    public void print_queue() {
        Node tempNode = head;
        if (!is_empty()) {
            while (tempNode.next != null) {
                System.out.printf("-> " + tempNode.data);
                tempNode = tempNode.next;
            }
            System.out.println("-> " + tempNode.data);
        } else {
            System.out.println("'NULL', Nothing to Print");
        }
    }
}
