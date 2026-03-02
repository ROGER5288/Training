package Dp;

public class LongestCommonSubsequence {

    public static void main(String[] args) {

        String text1 = "abcde";
        String text2 = "ace";

        lcs(text1, text2);
    }

    public static void lcs(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];

        // STEP 1: Fill DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        System.out.println("LCS Length = " + dp[m][n]);

        // STEP 2: Backtrack to build subsequence
        StringBuilder lcs = new StringBuilder();

        int i = m, j = n;

        while (i > 0 && j > 0) {

            // match → take char
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcs.append(s1.charAt(i - 1));
                i--;
                j--;
            }

            // move where value came from
            else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        // reverse because built backwards
        lcs.reverse();

        System.out.println("LCS String = " + lcs.toString());
    }
}
