package easy;

import util.ListNode;

public class MergeSortedList {
    public static void main(String[] args) {
        ListNode list1 = buildList(new int[]{1, 2, 4});
        ListNode list2 = buildList(new int[]{1, 3, 4});
        ListNode mergedList = mergeTwoLists(list1, list2);

        printList(mergedList);
    }

    private static ListNode buildList(int[] ints) {
        if (ints == null || ints.length == 0) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int value : ints) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next;
    }

    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println(); // Move to the next line after printing the list
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode currentNode = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            } else {
                currentNode.next = list2;
                list2 = list2.next;
            }

            currentNode = currentNode.next;
        }

        if (list1 != null) {
            while (list1 != null) {
                currentNode.next = list1;
                list1 = list1.next;
            }
        }

        if (list2 != null) {
            while (list2 != null) {
                currentNode.next = list2;
                list2 = list2.next;
            }
        }

        return dummy.next;
    }

}
