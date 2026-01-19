package Assignment.Assignment2;
import java.util.Scanner;
public class Program8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email");
		String email= sc.nextLine();
		String valid = "^[a-z0-9]+(\\.[a-z0-9]+)*@gmail\\.com$";
		String domain1 = "@gmail.com";
		if(email.matches(valid) ) {
			System.out.println("Valid Email ID");
        } else {
            System.out.println("Invalid Email ID");
        }

	
	}
}
