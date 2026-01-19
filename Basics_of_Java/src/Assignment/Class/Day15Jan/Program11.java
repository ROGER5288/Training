package Assignment.Class.Day15Jan;

public class Program11 {
	public static void main(String[] args) {

        int[][] matrix = {
            {0, 0, 3},
            {0, 0, 0},
            {5, 0, 0}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int zeroCount = 0;
        int nonZeroCount = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroCount++;
                } else {
                    nonZeroCount++;
                }
            }
        }

        if (zeroCount > nonZeroCount) {
            System.out.println("The given matrix is a Sparse Matrix");
        } else {
            System.out.println("The given matrix is NOT a Sparse Matrix");
        }
    }
}
