package Operators.relationaloperators;

public class Program1 {
	// 'A' [characters] --> ASCII values
	// "A" [strings] --> hashcode--> hashFunction
	//operators can't use hashcode values
	
	//Strings only supports operators like == and !=
	
	public static void main(String[] args) {
		boolean res =10 >20;
			System.out.println(res);
		res ='A'<'B';
		System.out.println(res);
		res = "A"=="B";
		System.out.println(res);
		res = "A" != "B";
		System.out.println(res);
		res = true == false;
		System.out.println(res);
		// >,<,>=,<=,==,!= for byte, short, int, long
		//String, boolean --> ==, !=
		
	}
}
