package easy;

import java.util.Stack;

public class StackToQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public StackToQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            copyItemsFromStack1();
        }
        return stack2.pop();
    }

    public int peek() {
        int i = -1;

        if (!stack2.isEmpty()) {
            i = stack2.pop();
            stack2.push(i);
        } else {
            copyItemsFromStack1();
            if (!stack2.isEmpty()) {
                i = stack2.pop();
                stack2.push(i);
            }
        }

        return i;
    }

    public boolean empty() {
        return stack2.isEmpty() && stack1.isEmpty();
    }

    private void copyItemsFromStack1() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
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
