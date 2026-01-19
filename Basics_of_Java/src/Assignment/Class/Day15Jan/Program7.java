package Assignment.Class.Day15Jan;

public class Program7 {
	public static void main(String[] args) {
		String s = "abbacd";  
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ch) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());
	}
}
