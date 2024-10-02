package easy;

import util.ListNode;

public class LinkedListCycle {
    public static void main(String[] args) {
        int[] arr = {3, 2, 0, -4};
        int cycleKey = 1;
        ListNode list = ListNode.buildWithCycle(arr, cycleKey);
        System.out.println(hasCycle(list));
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode spNode = head;
        ListNode fpNode = head;

        while (fpNode != null && fpNode.next != null) {
            spNode = spNode.next;
            fpNode = fpNode.next.next;

            if (spNode == fpNode) {
                return true;
            }
        }

        return false;
    }

}
