 package StackUsingLinkedList;

public class StackImplementation {
    Node head;

    //create a stack
    public void create_stack() {
        this.head = null;
    }
    //add an element to the top of the stack
    public void push(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }
    
    //remove an element from the top of the stack
    public void pop(){
        if (is_empty()) {
            System.out.println("Stack Is Empty!, Cannot pop!");
        } else {
            head = head.next;
        }
    }

    //prints the element in the top of the stack
    public void peek() {
        System.out.println("Top Element In Stack Is = " + head.data);
    }

    //determines if the stack is empty
    public boolean is_empty() {
        return head == null;
    }

    //outputs all of the elements of the stack
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
