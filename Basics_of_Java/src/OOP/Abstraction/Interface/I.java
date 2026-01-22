package OOP.Abstraction.Interface;

interface I{
	static void keep() {
		System.out.print("hehe");
	}

}

interface I2 extends I{
	final static int a=10;
	static void keep() {
		System.out.println("keep");
		
	}
}
