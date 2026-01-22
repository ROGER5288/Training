package Shadowing.Multilevel;

public class B3 extends B2 {
	int b = 30;
	
	public void display() {
		System.out.println(b);// access own class
		System.out.println(super.b); // access Variable B2
		System.out.println(((B1)this).b); // access variable B3
	}
	
	public static void main(String[] args) {
		
		B3 b3 = new B3();
		b3.display();
	}
}
