package Recursion;


public class CountGoodNumber {

    long MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long odd = n / 2;
        long even = (n + 1)/2;

        long p1 = pow(5, even);
        long p2 = pow(4, odd);

        return (int)((p1 * p2) % MOD);

        
    }

    public long pow(long base, long exp){
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base)%MOD;
            }
            base = (base * base)%MOD;
            exp = exp / 2;
        }
        return result;
    }
}
    
