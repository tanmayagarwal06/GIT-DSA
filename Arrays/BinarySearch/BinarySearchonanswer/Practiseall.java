package Arrays.BinarySearch.BinarySearchonanswer;

public class Practiseall {
    
    public int Squrareroot(int n){
        int low = 1;
        int high = n;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low)/2;
            long sq = 1l * mid * mid;      // this is the line we need to think about;
            
            if (sq == n) {
                return mid;
            }
            else if (sq < n) {
                ans = mid;
                low = mid + 1;
            }
            else {
                high = low + 1;
            }
        }
        return ans;
    }

     public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        
        while (low < high) {
            int mid = low + (high - low) / 2;
            long hours = 0;

            for (int pile : piles) {
                hours += (pile + mid -  1)/mid;// ceil division. understood
            }

            if (hours <= h) {
                high = mid;    
            } else {
                low = mid + 1;   
            }
        }

        return low;
    }

      public int shipWithinDays(int[] weights, int days){
        int low = 0;
        int high = 0 ;

        for(int i : weights){
            low = Math.max(days, i);
            high += i;
        }

        while (low < high) {
            int mid = low + (high - low)/2;
            if (canship(weights, days, mid)) {
                high = mid;
                
            }
            else{
                low = mid + 1;
            }
            
        }
        return low;
      }

      public boolean canship(int weights[], int days, int capacity){
        int requireddays = 0;
        int weigthtransfered = 0;

        for(int i : weights){
            if (weigthtransfered + i < capacity) {
                requireddays++;
                weigthtransfered = 0;
            }
            weigthtransfered += i;
        }
        return requireddays <= days;
      }

}
