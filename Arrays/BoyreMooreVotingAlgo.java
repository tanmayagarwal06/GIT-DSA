package Arrays;

import java.text.ListFormat.Style;
import java.util.Scanner;

public class BoyreMooreVotingAlgo {
    
    /*
     * Concept
     * cancel the diffrent one
     * add the same one
     */

     public static int MajorityElement(int nums[]){
        int candidate = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            count += (nums[i] == candidate) ? 1: -1 ;
        }
        return candidate;
     }


     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println(MajorityElement(nums));
     }
}
