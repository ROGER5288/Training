package Array.TwoD_Array;

public class Program1 {
	public static void main(String[] args) {
		int a[][] = {{10,20,9},{8,15,12},{12,13,17}};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[0][0]);
		System.out.println();
		
		//Outer loop is to iterate array 
		for(int i = 0; i<a.length;i++) {
			//inner loop is to iterate the element
			for(int j = 0; j<a[i].length;j++) {
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}	
	}
}
