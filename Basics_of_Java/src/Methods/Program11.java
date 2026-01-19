package Methods;

public class Program11 {
	public static void main(String[] args) {
		int n = 5;
		for ( int row = 1; row <= n; row++) {
			for(int col = 1; col<=2*n-1;col++) {
				if((row<=col || row+col <= 2*n) && (col+row >=2*n || row>=col)) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}
