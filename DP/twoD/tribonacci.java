package DP.twoD;

public class tribonacci {
    
    public int recursion(int n){
        if (n == 0 || n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return recursion(n -1) + recursion(n -2) + recursion(n -3);
    }

    public int memorization(int n, int[] dp){
        if (n == 0 || n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        if (dp[n] != -1) {
            return dp[n];
        }
        return memorization(n -1, dp) + memorization(n-2, dp)+ memorization(n-3, dp);
    }

    public int tabulation(int n){
        if (n == 0 ) {
            return 0;
        }
        if (n ==2 || n == 1) {
            return 1;
        }
        int a = 0;
        int b = 1;
        int c = 1;

        for(int i = 3; i <= n;  i++){
            int sum = a + b+ c;
            a = b;
            b = c;
            c = sum;
        }
        return c;
    }
}


