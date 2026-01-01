package Arrays.BinarySearch;

public class Squrareroot {
    
    public static int sqrt(int target){

        int left = 0, right = target, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sq =  1L* mid * mid;

            if (sq == target) {
                return mid;
            } else if (sq < target) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}
