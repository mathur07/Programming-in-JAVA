package LinkedList;

import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedListImplementation ll = new LinkedListImplementation();

//        System.out.printf("Enter the element : ");
//        while (scan.hasNextInt()) {
//            ll.insert_node_at_the_end_using_tail(scan.nextInt());
//            System.out.printf("Enter the element : ");
//        }
        ll.insert_node_at_the_end_using_tail(1);
        ll.insert_node_at_the_end_using_tail(2);
        ll.insert_node_at_the_end_using_tail(3);
        ll.insert_node_at_the_end_using_tail(4);
        ll.insert_node_at_the_end_using_tail(5);
        ll.insert_node_at_the_end_using_tail(6);
        ll.insert_node_at_nth_position(10001,-1);
    }
}
