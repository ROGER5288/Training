package OOP.Inheritance;

public class Super {

	static int i=10;
	
	//private static int i=10; private method can't be inherited
	
	
	static{
		System.out.println("Super class static Block");
	}
	
	public void print() {
		System.out.println("print()");
	}
}