package Stack.StackUsingArray;

import java.util.Arrays;

public class StackImplementation {

    int[] stack;
    int current_size = -1;

    public void create_stack(int size_of_stack) {
        stack = new int[size_of_stack];
        Arrays.fill(stack, Integer.MIN_VALUE);
    }

    public void push(int data) {
        if (is_full()) {
            System.out.println("Stack is Full, cannot push! " + data);
        } else {
            current_size++;
            stack[current_size] = data;
        }
    }

    public void pop() {
        if (is_empty()) {
            System.out.println("Stack is Empty, cannot pop!");
        } else {
            stack[current_size] = Integer.MIN_VALUE;
            current_size--;
        }
    }

    public boolean is_empty() {
        if (current_size == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean is_full() {
        if (current_size == stack.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        System.out.println("Stack Top Element is = " + stack[current_size]);
    }

    public void print_stack() {
        for (int i = 0; i < stack.length; i++) {
            System.out.printf(stack[i] + " | ");
        }
        System.out.println();
    }

}
