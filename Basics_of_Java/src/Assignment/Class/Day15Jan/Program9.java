package Assignment.Class.Day15Jan;

public class Program9 {
	public static void main(String[] args) {
		String str = "Move-Hyphens-to-Front";

		if (str == null) {
		    System.out.println((String)null);
		    return;
		}

		String result = "";
		String letters = "";

		for (int i = 0; i < str.length(); i++) {
		    if (str.charAt(i) == '-') {
		        result = result + "-";
		    } else {
		        letters = letters + str.charAt(i);
		    }
		}

		System.out.println(result + letters);

	}
}
