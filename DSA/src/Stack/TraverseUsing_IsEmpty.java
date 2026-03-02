package Stack;

import java.util.Stack;

public class TraverseUsing_IsEmpty {
	public static void Traverse(Stack<Integer> stack) {
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println("Stack is empty");
		
	}
	public static void main(String[]args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(60);
		stack.push(6);
		stack.push(21);
		stack.push(98);
		stack.push(5);
		stack.push(95);
		stack.push(541);
		stack.push(985);

		Traverse(stack);
	}
}
