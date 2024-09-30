package util;

@SuppressWarnings("all")
public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode buildList(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int value : numbers) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        ListNode node = this;

        while (node != null) {
            output.append(node.val);
            if (node.next != null) {
                output.append(", ");
            }
            node = node.next;
        }

        return output.toString();
    }
}