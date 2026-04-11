package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class nextgreaterelement2 {
    
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(result,-1);

        for(int i = 0; i < 2 * n - 1; i++){
            int num = nums[i % n];
            while (!st.isEmpty() && nums[st.peek()] < num) {
                result[st.pop()] = num;
            }
            if(i < n) {
                st.push(i);
            }
        }
        return result;
    }
}
