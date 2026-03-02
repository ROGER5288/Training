package Stack;

import java.util.Stack;

public class Post_Infix_No {

    public static int evaluate(String s) {

        Stack<Integer> stack = new Stack<>();

        String[] tokens = s.split(" ");

        for (String t : tokens) {

            // operator
            if (t.equals("+") || t.equals("-") ||
                t.equals("*") || t.equals("/")) {

                int b = stack.pop();   // right
                int a = stack.pop();   // left

                int res = 0;

                switch (t) {
                    case "+": res = a + b; break;
                    case "-": res = a - b; break;
                    case "*": res = a * b; break;
                    case "/": res = a / b; break;
                }

                stack.push(res);
            }
            // operand
            else {
                stack.push(Integer.parseInt(t));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        String postfix = "5 2 * 10 +";

        int result = evaluate(postfix);

        System.out.println("Result: " + result);
    }
}
