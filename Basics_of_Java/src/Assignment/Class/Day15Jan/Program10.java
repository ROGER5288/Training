package Assignment.Class.Day15Jan;

public class Program10 {
	 public static void main(String[] args) {

	        int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int n = matrix.length;

	        for (int i = 0; i < n; i++) {
	            int temp = matrix[i][i];
	            matrix[i][i] = matrix[i][n - i - 1];
	            matrix[i][n - i - 1] = temp;
	        }

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
