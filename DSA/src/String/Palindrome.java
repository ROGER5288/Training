package String;

public class Palindrome {
	public static boolean Palindrome(String s) {
		String s2 = "";
		for(int i=s.length()-1; i >= 0; i--) {
			
			s2 = s2 + s.charAt(i);			
		}
		if(s2.equalsIgnoreCase(s)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		String s = "Madam";
		if(Palindrome(s)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
	}
}
