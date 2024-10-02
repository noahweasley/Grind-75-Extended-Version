package easy;

import util.ListNode;

public class MergeSortedList {

    public static void main(String[] args) {
        ListNode list1 = ListNode.buildFromList(new int[]{1, 2, 4});
        ListNode list2 = ListNode.buildFromList(new int[]{1, 3, 4});
        ListNode mergedList = mergeTwoLists(list1, list2);

        System.out.println(mergedList);
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
