package DP;

public class LongestPalindrome {
    public int longestPalindromeSubseq(String s){
        int n = s.length();

        int[][] dp = new int[n+1][n+1];

        return dp[n][n];
    }
}
