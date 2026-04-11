package Stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class nextgreaterelement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int nums : nums2){
            while (!st.isEmpty() && st.peek() < nums) {
                map.put(st.pop(), nums);
            }
            st.push(nums);
        }

        int result[] = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            result[i] = map.getOrDefault(nums1[i], -1);
        }
        return result;
    }
}
