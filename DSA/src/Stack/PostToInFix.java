package Stack;

import java.util.Stack;

public class PostToInFix {
	
	public static String Fix(String s) {
		Stack<String> stack = new Stack<>() ;
		
		String[] token = s.split(" ");
		
		for(String t : token) {
			if(t.equalsIgnoreCase("+") || t.equalsIgnoreCase("-")|| t.equalsIgnoreCase("*")|| t.equalsIgnoreCase("/")) {
				String b =stack.pop();
				String a =stack.pop();
				
				String out = (a+" "+t+" "+b);
				stack.push(out);
			}else {
				stack.push(t);
			}
			
		}
		return stack.pop();
	}
	
	public static void main(String[] args) {
		
		 String postfix = "5 2 * 10 +";

	        String infix = Fix(postfix);

	        System.out.println("Infix: " + infix);
		
	}
}
