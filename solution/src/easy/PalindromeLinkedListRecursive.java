package easy;

import util.ListNode;

public class PalindromeLinkedListRecursive {
    static ListNode curr;

    public static void main(String[] args) {
        final ListNode head = ListNode.from(new int[]{1, 2, 2, 1});
        System.out.println(isPalindrome(head));
    }

    private static boolean isPalindrome(ListNode head) {
        curr = head;
        return solve(head);
    }

    public static boolean solve(ListNode head) {
        if (head == null) return true;
        boolean ans = solve(head.next) && head.val == curr.val;
        curr = curr.next;
        return ans;
    }
}
