package Stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackEG {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack();
		
		System.out.println(stack.push(23));
		System.out.println(stack.push(44));
		System.out.println(stack.push(56));
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());

		try{
			System.out.println(stack.pop());
		}catch(EmptyStackException e){
			System.out.println("Stack is Empty");
		}
	}
}
