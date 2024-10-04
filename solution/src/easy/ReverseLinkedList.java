package easy;

import util.ListNode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode node = ListNode.from(new int[]{1, 2, 3});
        System.out.println(reverseList(node));
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
