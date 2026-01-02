package Arrays.BinarySearch.BinarySearchonanswer;

public class Largestsubarraysum {
    
    public int splitArray(int[] nums, int k){
        int low = 0; int high = 0;
        for (int i = 0; i < nums.length; i++) {
            low = Math.max(low, i);
            high += i;
        }

        while (low < high) {
            int mid = low + (high - low)/2;

            if (candivide(nums, k, mid)) {
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean candivide(int nums[], int k, int maxsum){
        int subarrays = 0;
        int currentsum = 1;

        for (int i = 0; i < nums.length; i++) {
            if (i + currentsum <= maxsum) {
                currentsum += i;
            }
            else{
                subarrays++;
                currentsum = i;
                if (subarrays > k) {
                    return false;
                }
            }
        }
        return true;
    }
}
