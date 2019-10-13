package Stack.StackUsingArray;

import java.util.Arrays;

public class StackImplementation {

    int[] stack;
    int top_of_stack = -1;

    public void create_stack(int size_of_stack) {
        stack = new int[size_of_stack];
        Arrays.fill(stack, Integer.MIN_VALUE);
    }

    public void push(int data) {
        if (is_full()) {
            System.out.println("Stack is Full, cannot push! " + data);
        } else {
            top_of_stack++;
            stack[top_of_stack] = data;
        }
    }

    public void pop() {
        if (is_empty()) {
            System.out.println("Stack is Empty, cannot pop!");
        } else {
            stack[top_of_stack] = Integer.MIN_VALUE;
            top_of_stack--;
        }
    }

    public boolean is_empty() {
        if (top_of_stack == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean is_full() {
        if (top_of_stack == stack.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        System.out.println("Stack Top Element is = " + stack[top_of_stack]);
    }

    public void print_stack() {
        for (int i = 0; i < stack.length; i++) {
            System.out.printf(stack[i] + " | ");
        }
        System.out.println();
    }

}
