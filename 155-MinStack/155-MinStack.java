// Last updated: 7/10/2026, 9:46:24 AM
import java.util.*;

class MinStack {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int val) {
        stack1.push(val);

        if (stack2.isEmpty() || val <= stack2.peek()) {
            stack2.push(val);
        }
    }

    public void pop() {
        if (stack1.peek().equals(stack2.peek())) {
            stack2.pop();
        }

        stack1.pop();
    }

    public int top() {
        return stack1.isEmpty() ? -1 : stack1.peek();
    }

    public int getMin() {
        return stack2.isEmpty() ? -1 : stack2.peek();
    }
}
