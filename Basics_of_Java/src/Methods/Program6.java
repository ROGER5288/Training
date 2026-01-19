package Methods;

public class Program6 {
	//Method Overloading --> In a class multiple method with same name but different formal arguments/operations
	//rules
	/*
	 	method should be similar name change in formal argument with respect to 
	 	* length
	 	* type
	 	* order of declaration
	 */
	public static void main(String[] args) {
		System.out.println(num(10,20));
		System.out.println(num(10,20,30));
	}
	public static int num(int a, int b) {
		return a+b;
	}
	public static int num(int a, int b, int c) {
		return a+b+c;
	}
}
