package Arrays.BinarySearch;

import java.util.Scanner;


public class Binarysearch {

    public static int search(int[] nums, int target){
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high)/ 2;
            if (nums[mid] == target){
                return mid;
            }
            else if (target > nums[mid]) {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] nums = new int[n];
        int target = s.nextInt();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        int i = search(nums, target);
        System.out.println(i);

        s.close();
        
    }
}
