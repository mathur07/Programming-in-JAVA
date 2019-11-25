package LeetCode.Easy.MergeTwoSortedLists;

public class MergeTwoSortedListsMain {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result_head;
        ListNode temp = null;
        result_head = temp;

        while (l1.next != null && l2.next != null) {
            if (l1.val < l2.val) {
                ListNode node = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                ListNode node = new ListNode(l2.val);
                l2 = l2.next;
            }

        }

        if (l1.next != null) {

        }
        if (l2.next != null) {

        }


        return result_head;
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
