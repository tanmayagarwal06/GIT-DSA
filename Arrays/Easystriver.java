package Arrays;

public class Easystriver {
    

    public boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
            if (count > 1) return false;
        }
        return true;
    }


    public int removeDuplicates(int[] nums) {        
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }


    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = rotated[i];
        }
    }


    public static int[] moveZeros(int n, int []a) {
        // Write your code here.

        int index = 0; // Index to place the next non-zero element

        // Move all non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[index++] = a[i];
            }
        }

        // Fill the rest with zeros
        while (index < n) {
            a[index++] = 0;
        }

        return a;
        
    }


    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }


     public int findMaxConsecutiveOnes(int[] nums) {
       int cnt = 0;
        int maxi = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }

            maxi = Math.max(maxi, cnt);
        }
        return maxi;  
    }


    public int singleNumber(int[] nums) {
        int n = nums.length;
        int repeat = 0;
        for(int i = 0; i< n; i++){
            repeat = repeat ^ nums[i];
        }
        return repeat;
    }
}
