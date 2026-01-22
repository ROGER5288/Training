package OOP.Abstraction;

public class Program1 {
	
	public static void main(String[] args) {
		
		// A  a = new A();  // CTE ---> Abstraction class cannot be initialized
		//a.test();

		
		// Upcasting is mandate for Abstraction
        A a = new B();
        a.testA();
        a.test();// test() of B gets executed as JVM starts from below to check child to parent
        
        //a.testB(); // CTE ---> because a can only access to A and  Object class compartment although it is an instance of B
        
        

        B b = (B) a;
        b.testA();
        b.test();
        b.testB();
    }
}

