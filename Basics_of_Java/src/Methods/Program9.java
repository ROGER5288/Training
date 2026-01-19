package Methods;

public class Program9 {
	public static void main(String[] args) {
		int f=145;
		 if(num(f) == f){
			 System.out.println("Stong number");
		 
		 }
		 else {
			 System.out.println("Not Strong number ");
		 }
	}
	public static int num(int a) {
		int temp = a;
		int n=0;
		while(temp!=0) {
			int b =(temp%10);
			temp/=10;
			n= fact(b)+n;
		}
		return n;
	}
	public static int fact(int n) {
		int res = 1;
		for(int i = n; i>=1;i--) {
			res*=i;
		}
		return res;
	}
}
