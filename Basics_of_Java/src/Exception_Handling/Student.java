package Exception_Handling;

public class Student {
	public static String name;
	public static int year = 0;
	public static void checkAge(int age) throws InvalidAgeException{
		if(age<(year+1)) {
			throw new InvalidAgeException("Age is Invalid");
		}
		else {
			System.out.println("Age of the student is : " + age);
		}
	}
	public static void checkName(String name) throws InvalidNameException{
		if(name==null) {
			throw new InvalidNameException("Name is not valid");
		}else {
			System.out.println("Name : " + name);		}
	}
	
	public static void main(String [] args) {
		System.out.println("Program started");
		try {
			checkName("Miller");
			
		}catch(InvalidNameException a) {
			System.out.println(a.getMessage());
		}
		try {
			checkAge(16);
		}catch(InvalidAgeException b){
			System.out.println(b.getMessage());
		}
		System.out.println("Program Ended");		
	}
}
