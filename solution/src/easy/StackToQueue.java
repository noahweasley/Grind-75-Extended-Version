package easy;

import java.util.Stack;

public class StackToQueue {
    Stack<Integer> sTop;
    Stack<Integer> sBottom;
//    int size = 0;

    public StackToQueue() {
        sTop = new Stack<>();
        sBottom = new Stack<>();
    }

    public void push(int x) {
        sTop.push(x);
    }

    public int pop() {
        if (sBottom.isEmpty()) {
            copyItemsFromTopStack();
        }
        return sBottom.pop();
    }

    public int peek() {
        int i = -1;

        if (!sBottom.isEmpty()) {
            i = sBottom.pop();
            sBottom.push(i);
        } else {
            copyItemsFromTopStack();
            if (!sBottom.isEmpty()) {
                i = sBottom.pop();
                sBottom.push(i);
            }

        }

        return i;
    }

    public boolean empty() {
        return sBottom.isEmpty() && sTop.isEmpty();
    }

    private void copyItemsFromTopStack() {
        while (!sTop.isEmpty()) {
            sBottom.push(sTop.pop());
        }
    }

    public static void main(String[] args) {
        StackToQueue ob = new StackToQueue();
        ob.push(1);
        ob.push(2);
        System.out.println(ob.peek());
        System.out.println(ob.pop());
        System.out.println(ob.empty());

    }
}
