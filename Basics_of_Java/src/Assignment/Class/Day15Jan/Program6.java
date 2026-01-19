package Assignment.Class.Day15Jan;

public class Program6 {
	public static void main(String[] args) {
		String str = "aabaabbbcccd";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean found = false;

            for (int j = 0; j < result.length(); j++) {
                if (ch == result.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result = result + ch;
            }
        }

        System.out.println(result);
	}
}
