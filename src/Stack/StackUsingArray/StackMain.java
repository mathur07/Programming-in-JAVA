package Stack.StackUsingArray;

public class StackMain {

    static int stack_size = 5;

    public static void main(String[] args) {
        StackImplementation s = new StackImplementation();

        s.create_stack(stack_size);
        s.print_stack();
        s.pop();
        s.push(1);
        s.push(2);
        s.push(3);
        s.peek();
        s.push(4);
        s.push(5);
        s.push(6);
        s.print_stack();
        s.pop();
        s.print_stack();
        s.pop();
        s.pop();
        s.peek();
        s.print_stack();
        s.push(3);
        s.print_stack();
        s.push(4);
        s.print_stack();
        s.push(5);
        s.print_stack();
        s.push(6);
        s.print_stack();
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

