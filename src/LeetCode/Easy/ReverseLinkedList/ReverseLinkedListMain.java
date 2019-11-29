package LeetCode.Easy.ReverseLinkedList;

public class ReverseLinkedListMain {
    private static class ListNode {
        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }


    private static ListNode reverseList(ListNode head) {
        ListNode temp;
        ListNode temp2;
        temp = head.next;
        while (head.next != null && temp.next != null) {
            temp2 = temp.next;
            temp.next = head;
            head = temp;
            temp = temp2;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head1;
        ListNode node_a_1 = new ListNode(2);
        head1 = node_a_1;
        ListNode node_a_2 = new ListNode(3);
        node_a_1.next = node_a_2;
        ListNode node_a_3 = new ListNode(4);
        node_a_2.next = node_a_3;

        ListNode head = reverseList(head1);
        System.out.print("hi");
        while (head.next != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.print(head.val);

    }

}
