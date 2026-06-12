package Heaps;

import java.util.PriorityQueue;

import Trees.Binarytree2.removeleaf;

class MedianFinder {

    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;

    public MedianFinder() {
        maxHeap = new PriorityQueue<>((a,b) -> b -a);
        minHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        maxHeap.offer(num);

        minHeap.offer(maxHeap.poll());

        if (minHeap.size()>maxHeap.size() + 1) {
            maxHeap.offer(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if (minHeap.size()>maxHeap.size()) {
            return minHeap.peek();
        }

        return (maxHeap.peek()+ minHeap.peek())/2.0;
    }
}
