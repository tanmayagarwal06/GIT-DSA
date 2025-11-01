package Arrays.BinarySearch;

public class Easy {
    
    /*
     * Binary search
     * Implement lower bound
     * Implement upper bound
     * Search for insertion
     * Find first and last position in sorted array
     * Search element in rotated sorted array
     * Find minimum in a ratated array
     */

     public static int BinarySearch(int[] nums, int target){
        int n = nums.length;
        int low = 0; int high = n -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target == nums[mid]) {
                return mid;
            }
            else if (target < nums[mid]) {
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
     }
     

     public static int Lowerbound(int[] nums, int target){
        int n = nums.length;
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high)/2;

            if (target <= nums[mid]) {
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
            
        }
        return ans;
     }


     public static int upperBound(int[] nums, int target){
        int n = nums.length;
        int low = 0, high = n -1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high)/2;

            if (nums[mid] < target) {
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
     }

     public static int SearcforInsertion(int[] nums, int target){
        int n = nums.length;
        int low = 0; int high = n -1;
        int ans = n;

        while (low < high) {
            int mid = (low + high) / 2;
        
        if (nums[mid] >= target) {
            ans = mid;
            high = mid -1;
        }
     }
     return ans;
    }

    public static int[] firstandlastofsortedarray(int[] nums, int target){
         int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    private static int findFirst(int[] nums, int target) {
        int low = 0, high = nums.length - 1, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                ans = mid;
                high = mid - 1; // move left for earlier occurrence
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private static int findLast(int[] nums, int target) {
        int low = 0, high = nums.length - 1, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                ans = mid;
                low = mid + 1; // move right for later occurrence
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static boolean searchrotated(int[] nums, int target){
        /*
         * check fr the corne rcase that is low = high;
         * check for left side srted
         * check for right side is sorted
         */
        int n = nums.length, low = 0, high = n -1;
        while (low <= high) {
            int mid = (low + high)/2;

            if (nums[mid] == target) {
                return true;
            }

            
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) { // Case !
                low++;
                high--;
            }

            // Case 2

            else if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid -1;
                    }
                    else{
                        low = mid + 1;
                    }
                }
              
            // Case 3   
            else{
                if (target > nums[mid] && target <= nums[high] ) {
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return false;
    }



}

