package Operators.CompoundAssignmentoperators;

public class Program1 {
	public static void main(String[] args) {
		// this operator is an implicit typecaster
		int a=10;
		
		a+=10; //a= a+10;
		
		a+=10.5; //a = a + 10.5 error will show
		
		//a-= 10.5;
		//a*= 10.5;
		//a/= 10.5;
		//a-= 10;
		//a*= 10;
		//a/= 10;
		
		System.out.println(a);
	}
}
