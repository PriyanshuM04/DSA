package Questions;

import java.util.Stack;

public class Recursion_questions2 {
    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) return;

        int top = stack.pop();
        sortStack(stack);
        insertInOrder(stack, top);
    }
    static void insertInOrder(Stack<Integer>stack, int elem) {
        if (stack.isEmpty() || elem > stack.peek()) {
            stack.push(elem);
            return;
        }
        int top = stack.pop();
        insertInOrder(stack, elem);
        stack.push(top);
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) return;

        int top = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, top);
    }
    static void insertAtBottom(Stack<Integer> stack, int elem) {
        if (stack.isEmpty()) {
            stack.push(elem);
            return;
        }
        int top = stack.pop();
        insertAtBottom(stack, elem);
        stack.push(top);
    }


    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(10);
        stack.push(3);
        stack.push(4);

//        reverseStack(stack);
        sortStack(stack);
        while (!stack.isEmpty()) System.out.print(stack.pop() + " ");
    }
}
