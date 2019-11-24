package LeetCode.Easy.MergeTwoSortedLists;

import java.util.LinkedList;

public class MergeTwoSortedListsMain {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {



        return new ListNode(2);
    }

    public static void main(String[] args) {
        ListNode head1, head2;
        ListNode node_a_1 = new ListNode(2);
        head1 = node_a_1;
        ListNode node_a_2 = new ListNode(3);
        node_a_1.next = node_a_2;
        ListNode node_a_3 = new ListNode(4);
        node_a_2.next = node_a_3;

        ListNode node_b_1 = new ListNode(7);
        head2 = node_b_1;
        ListNode node_b_2 = new ListNode(0);
        node_b_1.next = node_b_2;
        ListNode node_b_3 = new ListNode(8);
        node_b_2.next = node_b_3;

        ListNode head = mergeTwoLists(head1, head2);

        while (head.next != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.print(head.val);

    }


}
