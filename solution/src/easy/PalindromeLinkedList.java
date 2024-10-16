package easy;

import util.ListNode;

import java.util.Objects;

public class PalindromeLinkedList {

    public static void main(String[] args) {
        ListNode head = ListNode.from(new int[]{1, 2, 2, 1});
        System.out.println(isPalindrome(head));
    }

    private static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    private static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode rev = reverse(slow.next);
        slow.next = null;

        while (rev != null) {
            if (Objects.requireNonNull(head).val != rev.val) {
                return false;
            }
            head = head.next;
            rev = rev.next;
        }

        return true;
    }
}