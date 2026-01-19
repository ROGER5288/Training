package OOP.Inheritance;

public class Nephrologist extends Doctor {
	
	
	public void dylasis() {
		System.out.println("dylasis");
	}
	public static void main(String[] args) {
		Nephrologist object = new Nephrologist();
		System.out.println(object.degree);
		System.out.println(object.name);
		object.checkBP();
		object.checkTemp();
		object.dylasis();
	}
}
