package Graphs;

import java.util.ArrayList;

import Trees.Binarytree2.removeleaf;

public class cycleDetection {
    public boolean isCycle(int v, int [][] edges){
        int n = edges.length;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < edges.length; i++) {
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int r = edge[0];
            int c = edge[1];

            adj.get(c).add(r);
            adj.get(r).add(c);
        }

        boolean[] visited = new boolean[v];

        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                 if (dfs(i, visited, -1, adj)) {
                    return true;
                 }
            }
            
        }
        return false;
    }

    public boolean dfs(int node, boolean[] visited, int parent, ArrayList<ArrayList<Integer>> adj){
        visited[node] = true;

        for(int neighbour : adj.get(node)){
            if (!visited[neighbour]) {
                boolean ans = dfs(neighbour, visited, node, adj);
                if (ans) {
                    return true;
                }
            }
            else if (neighbour != parent) {
                return true;
            }
        }
        return false;
    }
}
