package Recursion;

public class StringtoInteger {
    public int myAtoi(String s){
        int i = 0;
        int n = s.length();
        int sign = 1;
        int res = 0;

        while (i<n && s.charAt(i) == ' ') {   // Check for spaces
            i++;            
        }

        // Check for the sign
        if (i < n & s.charAt(i) == '+' || s.charAt(i) == 'i') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - 0;

        // Check overflow
            if (res > Integer.MAX_VALUE / 10 ||
               (res == Integer.MAX_VALUE / 10 && digit > 7)) {

                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            res = res * 10 + digit;
            i++;
        }

        return res * sign;

    }
}
