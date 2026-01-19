package Methods;

public class Program8 {
	public static void main(String[]args) {
		isnum(35);
	}
	public static void isnum(int a) {
		boolean issunny = false;
		for(int i = 1; i<=a; i++) {
			if(i*i==a+1) {
				issunny = true; 
			}
		}if(issunny){
			System.out.println("Sunny Number " + a);
		}
		else {
			System.out.println("Not Sunny Number " + a);
		}
	}
}



//public class Program8 {
//	public static void main(String[]args) {
//		isnum(35);
//		
//	}
//	public static boolean  isnum(int a) {
//		int count = 0;
//		for(int i = 1; i<=a; i++) {
//			if(i*i==a+1) {
//				count++; 
//			}
//		}
//		retrun count == 1;
//	}
//}
//
