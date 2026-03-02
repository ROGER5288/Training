package Dp;
import java.util.Arrays;

public class Coin_Problem {

    /* -------------------------------------------------
       1️  MINIMUM COINS REQUIRED
       Return least number of coins to make amount
       If not possible → -1
       ------------------------------------------------- */
    public static int coinChangeMin(int[] coins, int amount) {

        int[] minCoinsForAmount = new int[amount + 1];

        Arrays.fill(minCoinsForAmount, amount + 1); // infinity
        minCoinsForAmount[0] = 0;

        for (int currentAmount = 1; currentAmount <= amount; currentAmount++) {

            for (int coin : coins) {

                if (currentAmount >= coin) {
                    minCoinsForAmount[currentAmount] =Math.min(minCoinsForAmount[currentAmount], 1 + minCoinsForAmount[currentAmount - coin]);
                }
            }
        }

        return (minCoinsForAmount[amount] > amount) ? -1 : minCoinsForAmount[amount];
    }


    /* -------------------------------------------------
       2️  NUMBER OF WAYS (COMBINATIONS)
       Return how many ways we can make amount
       ------------------------------------------------- */
    public static int coinChangeWays(int[] coins, int amount) {

        int[] waysToMakeAmount = new int[amount + 1];
        waysToMakeAmount[0] = 1;

        for (int coin : coins) {

            for (int currentAmount = coin; currentAmount <= amount; currentAmount++) {

                waysToMakeAmount[currentAmount] += waysToMakeAmount[currentAmount - coin];
            }
        }

        return waysToMakeAmount[amount];
    }


    /* -------------------------------------------------
       3️⃣  MAIN METHOD (Testing)
       ------------------------------------------------- */
    public static void main(String[] args) {

        int[] coins = {1, 2, 5};
        int amount = 10;

        int minimumCoins = coinChangeMin(coins, amount);
        int numberOfWays = coinChangeWays(coins, amount);

        System.out.println("Minimum coins needed: " + minimumCoins);
        System.out.println("Number of ways: " + numberOfWays);
    }
}

