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
        if (head != null) {
            ListNode temp;
            ListNode temp2;
            temp = head;
            temp = temp.next;
            head.next = null;
            while (temp != null) {
                temp2 = temp.next;
                temp.next = head;
                head = temp;
                temp = temp2;
                if (temp == null) {
                    temp = head;
                    head = temp;
                    break;
                }
            }
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head;
        ListNode node_a_1 = new ListNode(2);
        head = node_a_1;
        ListNode node_a_2 = new ListNode(3);
        node_a_1.next = node_a_2;
        ListNode node_a_3 = new ListNode(4);
        node_a_2.next = node_a_3;
        ListNode node_a_4 = new ListNode(5);
        node_a_3.next = node_a_4;

        ListNode result = reverseList(head);
        while (result.next != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.print(result.val);

    }

}
