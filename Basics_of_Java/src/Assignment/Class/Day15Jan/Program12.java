package Assignment.Class.Day15Jan;

public class Program12 {
	public static void main(String[] args) {

        int rows = 4;
        int cols = 4;

        char[][] seats = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = 'O';
            }
        }

        System.out.println("Initial Seating Arrangement:");
        printSeats(seats);

        int[][] selections = {
            {1, 2},
            {0, 3},
            {2, 1}
        };

        for (int k = 0; k < selections.length; k++) {
            int r = selections[k][0];
            int c = selections[k][1];

            if (r >= 0 && r < rows && c >= 0 && c < cols) {
                if (seats[r][c] == 'O') {
                    seats[r][c] = 'X';
                    System.out.println("\nSeat reserved at (" + r + "," + c + ")");
                } else {
                    System.out.println("\nSeat already reserved at (" + r + "," + c + ")");
                }
            }

            printSeats(seats);
        }
    }

    static void printSeats(char[][] seats) {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}
