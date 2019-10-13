package Stack.StackUsingLinkedList;

public class StackImplementation {
    Node head;

    public void create_stack() {
        this.head = null;
    }

    public void push(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    public void pop() {
        if (is_empty()) {
            System.out.println("Stack Is Empty!, Cannot pop!");
        } else {
            head = head.next;
        }
    }

    public void peek() {
        System.out.println("Top Element In Stack Is = " + head.data);
    }

    public boolean is_empty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void print_stack() {
        if (is_empty()) {
            System.out.println("Stack Is Empty!, Nothing To Print!");
        } else {
            Node tempNode = head;
            while (tempNode.next != null) {
                System.out.printf(tempNode.data + " | ");
                tempNode = tempNode.next;
            }
            System.out.println(tempNode.data + " | ");
        }
    }
}
