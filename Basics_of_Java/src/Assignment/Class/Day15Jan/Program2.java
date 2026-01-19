package Assignment.Class.Day15Jan;

public class Program2 {
	public static void main(String[] args) {

        String s = "Hello";
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            int count = 1;

            if (ch[i] == '\0') {
                continue;
            }

            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '\0';   // mark counted character
                }
            }
            System.out.println(ch[i] + " " + count + "times" );
        }    
	}
}
