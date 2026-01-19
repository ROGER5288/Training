package String.Basics;

public class Program10 {
	public static void main(String[] args) {
		
		
		//for letter w+
		String s = "helloABWX";
		System.out.println(s.matches("\\w+"));
		
		// for space s+
		String s1 = " ";
		System.out.println(s1.matches("\\s+"));
		
	}
}
