package DP;

public class knapsack {

    public static int algo(int index, int w,
                           int[] weight, int[] value) {

                            int n= weight.length;

        int[][] dp = new int[n][n];

        // Base Case
        if (index < 0) {
            return 0;
        }

        // Memoization Check
        if (dp[index][w] != -1) {
            return dp[index][w];
        }

        // Don't take current item
        int notTake = algo(index - 1, w, weight, value);

        // Take current item if possible
        int take = Integer.MIN_VALUE;

        if (weight[index] <= w) {
            take = value[index]
                    + algo(index - 1,
                           w - weight[index],
                           weight,
                           value);
        }

        return dp[index][w] =  Math.max(take, notTake);
    }
}