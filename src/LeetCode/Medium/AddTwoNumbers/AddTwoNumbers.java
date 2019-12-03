package LeetCode.Medium.AddTwoNumbers;


public class AddTwoNumbers {

    public static class ListNode {
        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head;
        ListNode tempNode = new ListNode(0);
        head = tempNode;
        int val, remainder_val = 0;
        boolean flag = false;
        while (l1.next != null && l2.next != null) {
            val = l1.val + l2.val + remainder_val;
            if (val > 9) {
                remainder_val = val % 10;
                val = val / 10;
                flag = true;
            }



        }




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

/*
       while (head1.next!=null){
           System.out.print(head1.val + " -> ");
           head1=head1.next;
       }
        System.out.print(head1.val);

        System.out.println();

        while (head2.next!=null){
            System.out.print(head2.val + " -> ");
            head2=head2.next;
        }
        System.out.print(head2.val);

*/
        ListNode head = addTwoNumbers(head1, head2);

        while (head.next != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.print(head.val);

    }

}
