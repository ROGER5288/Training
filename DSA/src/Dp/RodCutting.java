package Dp;

import java.util.*;

public class RodCutting {

    // lengths[] -> allowed cut sizes
    // prices[]  -> profit for each size
    // n -> total rod length
    static int cutRod(int[] lengths, int[] prices, int n) {

        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {

            int max = 0;

            for (int j = 0; j < lengths.length; j++) {

                if (lengths[j] <= i) {
                    max = Math.max(max,
                            prices[j] + dp[i - lengths[j]]);
                }
            }

            dp[i] = max;
        }

        return dp[n];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of cut types: ");
        int m = sc.nextInt();

        int[] lengths = new int[m];
        int[] prices = new int[m];

        System.out.println("Enter cut lengths:");
        for (int i = 0; i < m; i++)
            lengths[i] = sc.nextInt();

        System.out.println("Enter prices:");
        for (int i = 0; i < m; i++)
            prices[i] = sc.nextInt();

        System.out.print("Enter total rod length: ");
        int n = sc.nextInt();

        int result = cutRod(lengths, prices, n);

        System.out.println("Maximum Profit = " + result);

        sc.close();
    }
}
