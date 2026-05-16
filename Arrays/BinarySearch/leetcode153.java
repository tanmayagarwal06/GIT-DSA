package Arrays.BinarySearch;

public class leetcode153 {

    public int findMin(int[] nums) {

        int n = nums.length;

        int left = 0;
        int right = n - 1;

        int ans = Integer.MAX_VALUE;

        while (left <= right) {

            // If current search space is already sorted
            if (nums[left] <= nums[right]) {
                ans = Math.min(ans, nums[left]);
                break;
            }

            int mid = left + (right - left) / 2;

            // Left half is sorted
            if (nums[left] <= nums[mid]) {

                ans = Math.min(ans, nums[left]);

                left = mid + 1;

            } 
            // Right half is sorted, minimum lies in left half
            else {

                ans = Math.min(ans, nums[mid]);

                right = mid;
            }
        }

        return ans;
    }
}