package Graphs;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public boolean isBipartite(int[][] graph) {

        int n = graph.length;
        int[] color = new int[n];

        // -1 means uncolored
        for (int i = 0; i < n; i++) {
            color[i] = -1;
        }

        // check all components
        for (int i = 0; i < n; i++) {

            if (color[i] == -1) {
                if (!bfs(graph, i, color)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean bfs(int[][] graph, int start, int[] color) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        color[start] = 0;

        while (!queue.isEmpty()) {

            int node = queue.poll();

            for (int neighbor : graph[node]) {

                // not colored yet
                if (color[neighbor] == -1) {
                    color[neighbor] = 1 - color[node];
                    queue.offer(neighbor);
                }

                // already colored → check conflict
                else if (color[neighbor] == color[node]) {
                    return false;
                }
            }
        }

        return true;
    }
}