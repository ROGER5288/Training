package Assignment.Class.Day15Jan;

public class Program8 {
	public static void main(String[]args) {
		String s = "hello world hello java world";
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            int count = 1;

            if (words[i].equals("0")) {
                continue;
            }

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";   // mark as visited
                }
            }

            if (count == 1) {
                System.out.println(words[i]);
            }
        }
	}
}
