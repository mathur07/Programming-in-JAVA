package LinkedList;

import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedListImplementation ll = new LinkedListImplementation();

        System.out.printf("Enter the element : ");
        while (scan.hasNextInt()) {
            ll.insert_node_at_the_end_using_tail(scan.nextInt());
            System.out.printf("Enter the element : ");
        }
    }
}
