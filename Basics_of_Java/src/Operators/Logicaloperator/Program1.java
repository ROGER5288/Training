package Operators.Logicaloperator;

public class Program1 {
	/*
	 	Logical Operators only for boolean
	 	(Multiple Conditions
	 	AND : && ---> Condition1 && Condition2 && Condition3 all has to be satisfied if any one condition is false 
	 	the output will be false after one condition is false any other condition after that condition will not be checked 
	 	OR : ||  ---> Condition1 || Condition2 || Condition3 any one has to be satisfied if any one condition is true 
	 	the output will be true after one condition is true any other condition after that condition will not be checked
	 	NOT: !   ---> Unary Operator makes the opposite if true makes it false and vice versa 
	 	Negate the value
	 */
	public static void main(String[] args) {
		
		System.out.println(true && false && true);
		
		int a=5;
		
		System.out.println(a>10 && ++a>a);
		System.out.println(a);
	}
}
