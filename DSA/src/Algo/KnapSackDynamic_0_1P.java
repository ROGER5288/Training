package Algo;

public class KnapSackDynamic_0_1P {

    public static int knapsack(int[] val, int[] wt, int W) {

        int n = val.length;

        int[][] dp = new int[n+1][W+1];

        for(int i = 1; i <= n; i++) {
            for(int w = 1; w <= W; w++) {

                if(wt[i-1] <= w) {
                    dp[i][w] = Math.max(dp[i-1][w], val[i-1] + dp[i-1][w - wt[i-1]]);
                } 
                else {
                    dp[i][w] = dp[i-1][w];
                }
            }
        }

        return dp[n][W];
    }

    public static void main(String[] args) {

        int[] val = {2, 3, 1, 4};
        int[] wt  = {2, 4, 6, 5};
        int W = 8;

        System.out.println("Max values : "+knapsack(val, wt, W));
    }
}
