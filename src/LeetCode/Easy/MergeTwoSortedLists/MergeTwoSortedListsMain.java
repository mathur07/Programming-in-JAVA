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
        ListNode temp = new ListNode(-1);
        result_head = temp;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next= l1;
                l1 = l1.next;
            } else {
                temp.next= l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        if (l1 != null) {
            temp.next = l1;

        }
        if (l2 != null) {
            temp.next = l2;

        }


        return result_head.next;
    }

    public static void main(String[] args) {
        ListNode head1, head2;
        ListNode node_a_1 = new ListNode(1);
        head1 = node_a_1;
        ListNode node_a_2 = new ListNode(2);
        node_a_1.next = node_a_2;
        ListNode node_a_3 = new ListNode(4);
        node_a_2.next = node_a_3;

        ListNode node_b_1 = new ListNode(1);
        head2 = node_b_1;
        ListNode node_b_2 = new ListNode(3);
        node_b_1.next = node_b_2;
        ListNode node_b_3 = new ListNode(4);
        node_b_2.next = node_b_3;

        ListNode head = mergeTwoLists(head1, head2);

        while (head.next != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.print(head.val);

    }


}
