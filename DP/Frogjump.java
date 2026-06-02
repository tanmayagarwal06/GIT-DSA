package DP;

public class Frogjump {
    public int energy(int n, int[] heights){
        if (n == 1) {
            return 0;
        }
        int prev2 = 0;
        int pre1 = Math.abs(heights[1] - heights[0]);

        for(int i = 2; i < n; i++){
            int jump1 = pre1 + Math.abs(heights[i ] - heights[i -1]);
            int jump2 = prev2 + Math.abs(heights[i] - heights[i -2]);

            int curr = Math.min(jump1, jump2);
             prev2 = pre1;
             pre1 = curr;

        }
        return pre1;
    }
}
