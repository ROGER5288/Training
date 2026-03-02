import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Reverse_Vowel_Shift_Remove_Duplicates_Rotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();  // consume newline

        while (T-- > 0) {
            String str = sc.next();
            int k = sc.nextInt();

            System.out.println(processString(str, k));
        }

        sc.close();
    }

    public static String processString(String str, int k) {

        // 1️⃣ Reverse the string
        String reversed = new StringBuilder(str).reverse().toString();

        // 2️⃣ Replace vowels
        String replaced = replaceVowels(reversed);

        // 3️⃣ Remove duplicates (keep first occurrence)
        String noDuplicates = removeDuplicates(replaced);

        // 4️⃣ Rotate right by K positions
        return rotateRight(noDuplicates, k);
    }

    // Replace vowels with next vowel cyclically
    private static String replaceVowels(String str) {
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (isVowel(ch)) {
                char next = getNextVowel(ch);
                sb.append(next);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    private static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    private static char getNextVowel(char ch) {
        String lowerVowels = "aeiou";
        String upperVowels = "AEIOU";

        if (Character.isLowerCase(ch)) {
            int index = lowerVowels.indexOf(ch);
            return lowerVowels.charAt((index + 1) % 5);
        } else {
            int index = upperVowels.indexOf(ch);
            return upperVowels.charAt((index + 1) % 5);
        }
    }

    // Remove duplicate characters
    private static String removeDuplicates(String str) {
        Set<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    // Rotate string to the right by k positions
    private static String rotateRight(String str, int k) {
        int n = str.length();
        if (n == 0) return str;

        k = k % n;

        return str.substring(n - k) + str.substring(0, n - k);
    }
}