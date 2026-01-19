package String.Builder;

public class Program2 {
	public static void main(String[]args) {
		StringBuilder sb = new StringBuilder("Hello");
		
		sb.append("123456789123456");
		System.out.println(sb.capacity());
		
		
		StringBuilder sb1 = new StringBuilder(1000);
		System.out.println(sb1.capacity());
	}
}
