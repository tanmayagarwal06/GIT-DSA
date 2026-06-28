package DP.zerooneknapsack;

public class LostStoneWeight2 {
    public int lastStoneWeightII(int[] stones){
        int n = stones.length;

        int sum = 0;

        for(int num : stones){
            sum += num;
        }
        int target = sum/2;

        boolean dp[][] = new boolean[n+1][target+1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= target; j++){
                if (stones[i -1 ] <= j) {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-stones[i-1]];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        for(int j = target; j >= 0; j--){
            if (dp[n][j]) {
                return sum - 2*j;
            }
        }
        return 0;
    }
}
