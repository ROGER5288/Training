package Shadowing.Multilevel;

public class C3 extends C2 {
	int c = 30;

	public void method() {
		System.out.println("C3 method");
	}

	public void display() {
		System.out.println(c);
		System.out.println(super.c);
		System.out.println(((C1) this).c);

		method();
		super.method();
		((C1) this).method();
	}

	public static void main(String[] args) {
		C3 c3 = new C3();
		c3.display();
	}
}