package Heaps;

import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.PriorityQueue;

public class mergelist {
    public ListNode mergeKLists(ListNode[] lists){
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a.val - b.val);

        for(ListNode node: lists){
            if (node != null) {
                pq.offer(node);
            }
        }


    }
}
