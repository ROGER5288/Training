package Programs_on_variables;

public class Program3 {
	// global variable in class block not mandatory to assign the values 
	// class block is used for declaration purpose 
	static int i =100;
	public static void main(String[] args) {
		// local variable mandatory to assign the values 
		int a=10;
		System.out.println(a);
		a= 20;
		System.out.println(a);
		System.out.println(i);
	}
}