package Assignment.Assignment2;

public class Program7 {
	public static void main(String[] args) {

        int[][] matrix = {
            {2,7,6},
            {9,5,1},
            {4,3,8}
        };

        int n = matrix.length;

        int magicSum = 0;
        for (int j = 0; j < n; j++) {
            magicSum += matrix[0][j];
        }

        for (int i = 0; i < n; i++) {
            int rowSum = 0, colSum = 0;

            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }

            if (rowSum != magicSum || colSum != magicSum) {
                System.out.println("Not a Magic Matrix");
                return;
            }
        }

        int d1 = 0, d2 = 0;
        for (int i = 0; i < n; i++) {
            d1 += matrix[i][i];
            d2 += matrix[i][n - i - 1];
        }

        if (d1 == magicSum && d2 == magicSum)
            System.out.println("Magic Matrix");
        else
            System.out.println("Not a Magic Matrix");
    }
}
