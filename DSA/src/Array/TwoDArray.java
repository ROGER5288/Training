package Array;

public class TwoDArray {
		public static void main(String [] args) {
			int arr[][] = {{2,8,9},{3,6,5,4},{1,2}};
			for(int i = 0; i<arr.length; i++) {
				for(int j = 0; j<arr[i].length; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
}
