package Stack.StackUsingLinkedList;

public class StackMain {
    public static void main(String[] args) {

        StackImplementation s = new StackImplementation();

        s.create_stack();
        s.print_stack();
        s.pop();
        s.push(1);
        s.push(2);
        s.push(3);
        s.peek();
        s.print_stack();
        s.push(4);
        s.push(5);
        s.push(6);
        s.peek();
        s.print_stack();
        s.pop();
        s.print_stack();
        s.pop();
        s.pop();
        s.peek();
        s.print_stack();
        s.push(4);
        s.print_stack();
        s.push(5);
        s.print_stack();
        s.push(6);
        s.print_stack();
        s.push(7);
        s.print_stack();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.print_stack();

    }
}
