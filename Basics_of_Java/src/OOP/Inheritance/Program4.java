package OOP.Inheritance;

public class Program4 extends Program3{
	
	static int j = 20;
	public static void main(String[] args) {
		System.out.println(Program3.i);
		System.out.println(Program4.i);
		Program4.print();
		System.out.println(Program4.j);
		//System.out.println(A.j);
		
	}
	
	// i ----> A ----> B ----> Generalized Member
	// j ----> B -----> Specialized Member
}
