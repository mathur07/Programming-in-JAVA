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
        temp = head;
        head=null;
        temp = temp.next;
        while (temp != null) {
            if (temp.next==null){
                break;
            }
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
        ListNode node_a_4 = new ListNode(5);
        node_a_3.next = node_a_4;

        ListNode head = reverseList(head1);
        while (head.next != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.print(head.val);

    }

}
