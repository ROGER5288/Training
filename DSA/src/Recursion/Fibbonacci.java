package Recursion;

public class Fibbonacci {
	public static int fibbonacci(int n) {
		if(n<=1) {
			return n;
		}
		return fibbonacci(n-1)+fibbonacci(n-2);
	}
	
	public static void main(String[] args) {
		int n = 7;
		for(int i = 0; i<n;i++) {
			System.out.println(fibbonacci(i));
		}
	}
}
