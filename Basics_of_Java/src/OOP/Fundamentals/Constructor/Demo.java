package OOP.Fundamentals.Constructor;

public class Demo {
	
	
	static int a=print();

	static {
		System.out.println("Static Block 1");
	}
	int b=test();
	public static void main(String[] args) {
		System.out.println("Main Start");
		new Demo();
		new Demo();
		System.out.println("Main End");
	}
	
	static {
		System.out.println("Static Block 2");
	}
	
	public int test(){
		System.out.println("test()");
		return 20;
	}
	
	{
		System.out.println("Non static block 1");
	}
	
	Demo(){
		System.out.println("Demo()");
	}
	
	public static int print() {
		System.out.println("print()");
		return 10;
	}
}
