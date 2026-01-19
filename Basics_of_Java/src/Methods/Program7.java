package Methods;

public class Program7 {
	public static void main(String[] args) {
		num(1,2);
		num('A','B');
		//num('A',200);
		//num('A',20.5); 
		//num('A',20.5);
		//compiler decides which method should run 1st based on actual argument 
		/* method overloading is also called as compile time binding/compile time polymorphism/static binding
		 	*Similar type
		 	*Widening
		 */
		//compiler --> actual Argument
		/*
		 * process of binding between method call statement and implementation 
		 * of the method during compilation by the compiler based on actual argument
		 */
		
	}
	public static void num(int a, int b) {
		//implementation
		System.out.println("int, int ");
	}
//	public static void num(double a, double b) {
//		System.out.println("double, double ");
//	}
	public static void num(char a, char b) {
		System.out.println("char, char");
	}
//	public static void num(int a, char b) {
//		System.out.println("int, char ");
//	}
//	public static void num(char a, int b) {
//		System.out.println("int, char ");
//	}
//	
}
