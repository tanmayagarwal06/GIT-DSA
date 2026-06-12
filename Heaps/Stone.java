package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class Stone {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone : stones){
            pq.offer(stone);
        }

            while (pq.size()>1) {
                int y = pq.peek();
                int x = pq.peek();

                if (y != x) {
                    pq.offer(y - x);
                }

            }

            return pq.isEmpty() ? 0 : pq.poll();

        
    }
}