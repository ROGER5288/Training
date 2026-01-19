package Assignment.Class.Day15Jan;

public class Program5 {
	public static void main(String[] args) {
		String s = "Hello";
        char ch = 'l';
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ch) {
                result = result + s.charAt(i);
            }
        }

        System.out.println(result);
	}
}
