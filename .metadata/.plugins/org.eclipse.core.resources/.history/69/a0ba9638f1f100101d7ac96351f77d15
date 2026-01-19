package String.Basics;

public class Program8 {
	public static void main(String[] args) {
		
		// to check if the string belongs between that range 
		//for single character
		
		System.out.println("a".matches("[abc]"));
		System.out.println("b".matches("[abc]"));
		System.out.println("c".matches("[abc]"));

		System.out.println("d".matches("[abc]"));
		System.out.println("d".matches("^[abc]"));
		System.out.println("m".matches("[a-z]"));
		
		
		System.out.println("M".matches("[a-z]"));

		System.out.println("M".matches("[A-Z]"));
		
		// For multiple characters 
		// + --> 1 And more
		// * --> 0 and more
		// ? --> 0 or 1
		// {n} --> Actual number'
		
		System.out.println("abc".matches("[a-z]+"));
		
		System.out.println("ABC".matches("[A-Z]+"));
		
		//for combination of upper and lower case
		
		// we can interchange the range 
		
		System.out.println("abcABC".matches("[a-zA-Z]+"));
		
		//For numbers

		System.out.println("123".matches("[0-9]+"));
		
		//For upper/lowercase and number mix
		
		System.out.println("abc123AZW".matches("[a-zA-Z0-9]+"));


		
		
		System.out.println("8".matches("[6-9]"));
		
		
		System.out.println("8234567".matches("[6-9]+"));
		

		System.out.println("9876543210".matches("[6-9][0-9]+"));
	}
}
