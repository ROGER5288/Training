package String;


public class All_ASS {

    // Length of String (using built-in)
	public static int length(String s) {
        return s.length();
    }

    // Uppercase using built-in
	public static String toUpper(String s) {
        return s.toUpperCase();
    }

    // Lowercase using built-in
	public static String toLower(String s) {
        return s.toLowerCase();
    }

    // Uppercase WITHOUT built-in
	public static String toUpperManual(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char)(ch[i] - 32);
            }
        }
        return new String(ch);
    }

    // Lowercase WITHOUT built-in
	public static String toLowerManual(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char)(ch[i] + 32);
            }
        }
        return new String(ch);
    }

    // Extract Substring (without substring())
	public static String substringManual(String s, int start, int end) {
        char[] result = new char[end - start];
        int j = 0;
        for (int i = start; i < end; i++) {
            result[j++] = s.charAt(i);
        }
        return new String(result);
    }

    // Check Binary String
	public static boolean isBinary(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '0' && ch != '1') {
                return false;
            }
        }
        return true;
    }

    // Pattern Search
	public static boolean patternSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }
            if (j == m) return true;
        }
        return false;
    }

    // Palindrome Check
	public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // MAIN METHOD
    public static void main(String[] args) {

        String s = "JavaProgramming";
        String binary = "01001101";
        String text = "java is powerful";
        String pattern = "power";
        String pal = "madam";

        System.out.println("Length: " + length(s));
        System.out.println("Upper (built-in): " + toUpper(s));
        System.out.println("Lower (built-in): " + toLower(s));

        System.out.println("Upper (manual): " + toUpperManual(s));
        System.out.println("Lower (manual): " + toLowerManual(s));

        System.out.println("Substring (3,8): " + substringManual(s, 3, 8));

        System.out.println(binary + " → " + (isBinary(binary) ? "Binary" : "Non-Binary"));

        System.out.println("Pattern Found: " + patternSearch(text, pattern));

        System.out.println(pal + " Palindrome: " + isPalindrome(pal));
    }
}
