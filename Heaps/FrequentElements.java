package Heaps;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequentElements {
    public int[] topKFrequent(int[] nums, int k){
        Map<Integer, Integer> frequency = new HashMap<>();

        for(int num : nums){
            frequency.put(num, frequency.getOrDefault(nums, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a , b) -> frequency.get(a) - frequency.get(b));

        for(int num : frequency.keySet()){
            pq.offer(num);

            if (pq.size()> k) {
                pq.poll();
            }
        }
        int [] ans = new int[k];
        for(int i = k -1; i >= 0; i--){
            ans[i] = pq.poll();
        }
        return ans;
    }
}
