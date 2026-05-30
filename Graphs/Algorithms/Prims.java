package Graphs.Algorithms;

import Trees.Binarytree2.removeleaf;

public class Prims {
    
    public static void algo(int[][] adjMatrix){
        int n = adjMatrix.length;
        boolean[] visited = new boolean[n];
        int[] parent = new int[n];
        int[] weight = new int[n];
        // Initializing the source vertex
        parent[0] = -1;
        weight[0] = 0;

        for(int i = 1; i < n; i++){
            weight[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < weight.length; i++) {
            int minVertex = findMinvertex(visited, weight);
            visited[minVertex] = true;
            // Explore neighbour

            for(int j = 0; j < n; j++){
                if (adjMatrix[minVertex][j] != 0 && !visited[j]) {
                    if (weight[j] > adjMatrix[minVertex][j]) {
                        // update value
                        weight[j] = adjMatrix[minVertex][j];
                        parent[j] = minVertex;
                    }
                    
                }
            }
        }
    }

    private static int findMinvertex(boolean[] visited, int[] weight) {
        int minVertex = -1;
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i] && (minVertex == -1 || weight[i] < weight[minVertex])) {
                minVertex = i;
            }
        }
        return minVertex;
    }
}
