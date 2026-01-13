package Methods;

public class Program5 {
	public static void main(String[] args) {
		System.out.println(test());
	}
	/*public static void test() {
		if(true){
			System.out.println("Test");
			return; // return or break should be the last statement of the loop
		}
		System.out.println("Hi");
		return;
	}
	*/
	public static int test() {
		//if(true){
		if(false) {
			System.out.println("Test");
			return 10; // returntype should be matched to the return data like 10 and 100 for here 
			
			//returned data--> Value returned by the method return 100;
			//return type --> datatype of the value return by the method
		}
		System.out.println("Hi");
		return 100;
	}
}
