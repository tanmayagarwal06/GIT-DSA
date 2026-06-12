package Graphs;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumEffort {
    public int minimumEffortPath(int[][] heights){
        int m = heights.length;
        int n = heights[0].length;

        int[][] distance = new int[m][n];

        for(int[] row : distance){
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        return m;
    }
}
