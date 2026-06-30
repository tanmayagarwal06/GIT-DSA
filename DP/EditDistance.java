package DP;

import java.util.Arrays;

public class EditDistance {
    // Recursion
    public static int recursion(String s1, String s2, int m, int n){
        if (m == 0) {
            return n;
        }
        if (n == 0) {
            return m;
        }
        if (s1.charAt(m -1) == s2.charAt(n -1)) {
            return recursion(s1, s2, m-1, n-1);
        }

        return 1+ Math.min(Math.min(recursion(s1, s2, m-1, n), recursion(s1, s2, m, n-1)), recursion(s1, s2, m-1, n-1));
    }
    public static int recursionwrapper(String s1, String s2){

        return recursion(s1, s2, s1.length(), s2.length());
    }


    // Memorization
    public static int Memorization(String s1, String s2, int m, int n, int[][] memo){
        if (m == 0) {
            return n;
        }
        if (n == 0) {
            return m;
        }

        if (memo[m][n] != -1) {
            return memo[m][n];
        }

        if (s1.charAt(m -1) == s2.charAt(n -1)) {
            return memo[m][n] = recursion(s1, s2, m-1, n-1);
        }

        return memo[m][n] = 1+ Math.min(Math.min(recursion(s1, s2, m-1, n), recursion(s1, s2, m, n-1)), recursion(s1, s2, m-1, n-1));

    }
    public static int editDistance(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[][] memo = new int[m + 1][n + 1];
        for (int[] row : memo)
            Arrays.fill(row, -1);
        return Memorization(s1, s2, m, n, memo);
    }

    public static int Tabulation(String s1, String s2){
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m+1][n+1];

        for(int i = 0; i <= m; i++){
            dp[i][0] = i;
        }

        for(int j = 0; j <= n; j++){
            dp[0][j] = j;
        }

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if (s1.charAt(m -1) == s2.charAt(n-1)) {
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    dp[i][j] = 1 + Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
