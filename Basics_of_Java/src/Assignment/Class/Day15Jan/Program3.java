package Assignment.Class.Day15Jan;

public class Program3 {
	public static void main(String[] args) {
		String s = "java is an oop lang";
        String result = "";

        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            for (int j = word.length() - 1; j >= 0; j--) {
                result = result + word.charAt(j);
            }

            result = result + " ";
        }

        System.out.println(result.trim());
	}
}
