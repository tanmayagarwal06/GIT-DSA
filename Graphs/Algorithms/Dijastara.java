package Graphs.Algorithms;

public class Dijastara {
    
    public static void algo(int[][] matrix){
        int n = matrix.length;
        boolean[] visited = new boolean[n];
        int[] distance = new int[n];
        distance[0] =0;
        for(int i = 1; i < n; i++){
            distance[i] = Integer.MAX_VALUE;
        }

        for(int i = 0; i < n; i++){
            int minVertex = findMinvertex(visited, distance);
            visited[minVertex] = true;
            for(int j = 0; j < n; j++){
                if (matrix[minVertex][j] > 0 && !visited[j] && matrix[minVertex][j] != Integer.MAX_VALUE) {
                    int new_distance = distance[minVertex] + matrix[minVertex][j];
                    if (new_distance < distance[j]) {
                        distance[j] = new_distance;
                    }
                }
            }
        }
    }

    private static int findMinvertex(boolean[] visited, int[] distance) {
        int minVertex = -1;
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])) {
                minVertex = i;
            }
        }
        return minVertex;
    }
}
