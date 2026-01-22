package OOP.Abstraction.Interface;


interface I5 {
	static void keep() {
		System.out.println("hehe");
	}

}

interface I6{
	final static int a=10;
	public abstract void take();
	static void keep() {
		System.out.println("keep");
		
	}
}
public class Demo3 implements I6,I5{
public void take() {
	System.out.println("take it");
}
public static void main(String[] args) {
	Demo3 d=new Demo3();
	I5.keep();I6.keep();
	d.take();
	System.out.println("I6.a");
	
	
}
		
	}
	


//whenever the class not implementing the interface and trying to access the static members of an interface by interface name as a reference at that time the interface static members will get loaded in static area
