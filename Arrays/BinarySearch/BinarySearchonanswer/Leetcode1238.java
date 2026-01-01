package Arrays.BinarySearch.BinarySearchonanswer;

import java.util.Scanner;

public class Leetcode1238 {
    public int brutesmallestDivisor(int nums[], int threshold){
        int maximum = 0;
        for(int i : nums){
            maximum = Math.max(maximum, i);
        }

        for(int d = 1; d<= maximum; d++){
            int sum = 0;

            for(int i : nums){
                sum += (int) Math.ceil((double)(i/d));
            }
        }
        return -1;
    }

    public int smallestDivisor(int nums[], int threshold){
        int maximum = 0;
        for (int i = 0; i < nums.length; i++) {
            maximum = Math.max(maximum, i);

        }

        int low = 1 ; int high = maximum;   // main
        int answer = maximum; 

        while (low <= high) {
            int mid = (low + (high - low))/2;
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += (i + mid - 1)/mid;
            }
            if (sum <= threshold) {
                answer = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return answer;
    }

    
}
