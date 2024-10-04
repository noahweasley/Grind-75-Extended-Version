package easy;

import util.ListNode;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        ListNode head = ListNode.from(new int[]{2, 3, 4, 7, 9});
        System.out.println(middleNode(head).val);
    }

    private static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
