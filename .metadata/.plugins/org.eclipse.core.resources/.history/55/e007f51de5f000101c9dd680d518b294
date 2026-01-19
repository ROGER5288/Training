package Methods;

//public class Program12 {
//    public static void main(String[] args) {
//        int n = 5;
//
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= n; col++) {
//
//                if (row == (n + 1) / 2 ||
//                    col == row ||
//                    col == n - row + 1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }
//    }
//}
public class Program12 {
    public static void main(String[] args) {
        int n = 3; // The number of rows for one half of the butterfly

        // Upper half of the butterfly
        for (int i = 1; i <= n; i++) {
            // First part (left stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces in the middle
            // Formula: 2 * (n - i) spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Second part (right stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        // Lower half of the butterfly
        // Start from n-1 to avoid repeating the middle row
        for (int i = n - 1; i >= 1; i--) {
            // First part (left stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces in the middle
            // Formula: 2 * (n - i) spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Second part (right stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}





/*
 *	*   *
 *	** **
 *	*****
 *	** **
 *	*   *
 * 
 * 
 * */
