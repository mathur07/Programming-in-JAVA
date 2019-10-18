package Stack.StackUsingArray;

import java.util.Arrays;

public class StackImplementation {

    int[] stack;
    int top_of_stack = -1;
    
    // create a stack of capacity size_of_stack
    public void create_stack(int size_of_stack) {
        stack = new int[size_of_stack];
        Arrays.fill(stack, Integer.MIN_VALUE);
    }

    // add an element to the top of the stack
    public void push(int data) {
        if (is_full()) {
            System.out.println("Stack is Full, cannot push! " + data);
        } else {
            top_of_stack++;
            stack[top_of_stack] = data;
        }
    }
    
    //remove an element from the top of the stack
    public void pop() {
        if (is_empty()) {
            System.out.println("Stack is Empty, cannot pop!");
        } else {
            stack[top_of_stack] = Integer.MIN_VALUE;
            top_of_stack--;
        }
    }
    
    // check if stack is empty or not
    public boolean is_empty() {
        if (top_of_stack == -1) {
            return true;
        } else {
            return false;
        }
    }

    //check if stack is full
    public boolean is_full() {
        if (top_of_stack == stack.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    // print the topmost element of the stack
    public void peek() {
        System.out.println("Stack Top Element is = " + stack[top_of_stack]);
    }

    // print all the elements in the stack 
    public void print_stack() {
        for (int i = 0; i < stack.length; i++) {
            System.out.printf(stack[i] + " | ");
        }
        System.out.println();
    }

}
