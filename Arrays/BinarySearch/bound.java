package Arrays.BinarySearch;

import java.util.Scanner;

public class bound {
    
    public static int lowerBound(int[] nums, int target){
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = (low + high)/ 2;
            if (nums[mid] >= target) {
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
        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] > target) {
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }
        int target = s.nextInt();
        int a = lowerBound(nums, target);
        int b = upperBound(nums, target);
        System.out.println(a);
        System.out.println(b);

        s.close();
    }
}
