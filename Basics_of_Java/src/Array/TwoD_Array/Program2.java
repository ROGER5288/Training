package Array.TwoD_Array;

public class Program2 {
	public static void main(String[] args) {
		
		int [][]a= {{7,9},{4,2}};
		int[][] b= {{1,2},{3,1}};
		int [][]c= new int[2][2];
		
		for(int i = 0; i <= c.length-1;i++) {
			for(int j = 0; j<c[i].length;j++) {
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
}
