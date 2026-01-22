package OOP.Abstraction.Interface;



interface I3{
	static void keep() {
		System.out.println("hehe");
	}

}

interface I4{
	final static int a=10;
	static void keep() {
		System.out.println("keep");
		
	}
}
public class Demo2 implements I4,I3{
	public static void main(String[] args) {
		
		I3.keep();I4.keep();
		System.out.println("I2.a");
		
	}
	

}
//whenever the class not implementing the interface and trying to access the static members of an interface by interface name as a reference at that time the interface static members will get loaded in static area