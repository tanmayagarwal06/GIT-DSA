package Heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SortKSortedarray {
    public List<Integer> sortNearlySortedArray(List<Integer> arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i <= k; i++){
            pq.add(arr.get(i));
        }

        for(int i = k + 1; i < arr.size(); i++){
            result.add(pq.poll());
            pq.add(arr.get(i));
        }

        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }
        return result;
    }
}
