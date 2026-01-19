package Assignment.Assignment2;

public class Program6 {
	public static void main(String[] args) {

        int[][] matrix = {
            {1,0,0},
            {0,1,0},
            {0,0,1}
        };

        boolean isIdentity = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                if (i == j && matrix[i][j] != 1)
                    isIdentity = false;

                if (i != j && matrix[i][j] != 0)
                    isIdentity = false;
            }
        }

        if (isIdentity)
            System.out.println("Identity Matrix");
        else
            System.out.println("Not an Identity Matrix");
    }
}
