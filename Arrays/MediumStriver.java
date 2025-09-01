package Arrays;
import java.util.*;

public class MediumStriver {
    

    public int MajorityElement(int nums[]){
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > nums.length/2) {
                return nums[i];
            }
        }
        return -1;
    }


    public int majorityElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            Arrays.sort(nums);
            return nums[nums.length/2];
        }
    }

}
