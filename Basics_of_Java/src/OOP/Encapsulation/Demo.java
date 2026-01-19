package OOP.Encapsulation;

public class Demo {
	private int a;
	
	//private variable global variable,method,constructor
	//class Initializer not used
	//Constructor ---> object
	private Demo() {
	
	}

	
	// write value , read the value
	
	//method write design setter method
	//read the value design getter method
	
	public int getValueA() {
		return a;
	}
	
	public void setValueA(int a) {
		this.a=a;
	}
	
	
	//Factory Method to use a private class to another
	
	static Demo obj;
	
	public static Demo getA() {
		if(obj == null) {
			obj = new Demo();
		}
		return obj;
		
	}
}
