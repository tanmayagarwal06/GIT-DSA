package DP.zerooneknapsack;

public class ZerooneKnapsack {
    public static int recursion(int W, int[] value, int[] w, int n){
        if (W == 0 || n == 0) {
            return 0;
        }

        int pick = 0;
        
        if (w[n- 1] <=W) {
            pick = value[n - 1] + recursion(W - w[n -1], value, w, n-1);
        }

        int notpick = recursion(W, value, w, n - 1);

        return Math.max(pick, notpick);
    }

    public static int Memoization(int W, int[]value, int[]w, int n, int[][] memo){
        if (W == 0|| n == 0) {
            return 0;
        }

        if (memo[n][W] != -1) {
            return memo[n][W];
        }

        int pick = 0;

        if (w[n-1] <= W) {
            pick = value[n-1] + Memoization(W -w[n -1], value, w, n-1, memo);
        }
        int notpick = Memoization(W, value, w, n-1, memo);

        return memo[n][W] = Math.max(pick, notpick);
    }

    public static int Tabulation(int W, int[] value, int[] w, int n){
        int dp[][] = new int[n+1][W+1];
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= W; j++){

                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
                else{
                int pick = 0;
                if (w[i - 1] <= W) {
                    pick = value[i -1] + dp[i - 1][j - w[i -1]];
                }
                int notpick = dp[i-1][j];

                return Math.max(pick, notpick);
            }
            }
        }
        return dp[n][W];
    }
}
