package Operators.Arithmeticoperators;

public class Program1 {
	
	//Property
	/* 
	 	Every operators will have precedence and associativity
	 	and every return value and type value
	 */
	//Arithmetic operations
	public static void main(String[] args) {
		
		//addition
		//normal, concatenation
		
		int a = 10;
		int b = 30;
		
		
		System.out.println(10 + 20);
		System.out.println( a + b);
		
		//Concatenation is marging the string 
		System.out.println(""+10+10);//1010
		System.out.println(10+20+"Hello"+100);//30Hello100
		//System.out.println(10+true+"hello"+30); ---> compile time error 
		
		System.out.println(10*30/2);

		System.out.println(10/30*2);
		
		System.out.println(5/2);// because it's int type it's 2
		
		System.out.println(5/2.0);// 5 int / 2.0 double that's why 2.5
		
		System.out.println('A'+'B');
		
		char c = 'A'+ 'B';
		System.out.println(c);
		
	}
}
