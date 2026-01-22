package OOP.Inheritance;

public class TestB extends TestA{
	public TestB() {
		super(10);
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		TestB obj = new TestB();
	}
	
}
