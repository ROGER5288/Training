package Stack;

import java.util.Scanner;
import java.util.Stack;

class minimumStack {
    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    public minimumStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);

        if (minStack.isEmpty()) {
            minStack.push(x);
        } else {
            minStack.push(Math.min(x, minStack.peek()));
        }
    }

    public void pop() {
        if (!mainStack.isEmpty()) {
            mainStack.pop();
            minStack.pop();
        } else {
            System.out.println("Stack is Empty");
        }
    }

    public int top() {
        if (mainStack.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return mainStack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return minStack.peek();
    }
}

public class Min_Stack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of operations:");
        int Q = sc.nextInt();

        minimumStack st = new minimumStack();

        System.out.println("Operations:");
        System.out.println("1 x -> Push");
        System.out.println("2   -> Pop");
        System.out.println("3   -> Top");
        System.out.println("4   -> Get Min");

        while (Q-- > 0) {

            int type = sc.nextInt();

            switch (type) {

                case 1:
                    int x = sc.nextInt();
                    st.push(x);
                    break;

                case 2:
                    st.pop();
                    break;

                case 3:
                    System.out.println(st.top());
                    break;

                case 4:
                    System.out.println(st.getMin());
                    break;

                default:
                    System.out.println("Invalid Operation");
            }
        }

        sc.close();
    }
}
