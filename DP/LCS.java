package DP;

import java.util.Arrays;

public class LCS {

    public static int LCSrecursion(String s1, String s2){
        int m = s1.length();
        int n = s2.length();

        return recursion(s1, s2, m, n);
    }

    public static int recursion(String s1, String s2, int m, int n){
        if (m == 0 || n == 0) {
            return 0;
        }
        if (s1.charAt(m -1) == s2.charAt(n-1)) {
            return 1 + recursion(s1, s2, m-1, n-1);
        }
        else {
            return Math.max(recursion(s1, s2, m-1, n), recursion(s1, s2, m, n-1));
        }
    }


    public static int Memorization(String s1, String s2, int m, int n, int memo[][]){
        if (m == 0 || n == 0) {
            return 0;
        }

        if (memo[m][n] != -1) {
            return memo[m][n];
        }

        if (s1.charAt(m -1) == s2.charAt(n-1)) {
            return 1 + Memorization(s1, s2, m-1, n-1, memo);
        }

        else{
            return Math.max(Memorization(s1, s2, m-1, n, memo), Memorization(s1, s2, m, n-1, memo));
        }

    }

    public static int MemoMain(String s1, String s2){
        int m = s1.length();
        int n = s2.length();

        int[][] memo = new int[m+1][n+1];

        for(int i = 0; i < n; i++){
            Arrays.fill(memo[i] , -1);

        }
        return Memorization(s1, s2, m, n, memo);
    }

    public static int Tabulation(String s1, String s2){
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m+1][n+1];

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if (s1.charAt(m - 1) == s2.charAt(n-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}