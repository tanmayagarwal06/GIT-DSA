package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class breadthFirst {

    public static void bfs(int[][] matrix){
        Queue<Integer> pendingVeritices =  new LinkedList<>();

        boolean[] visited = new boolean[matrix.length];
        visited[0] = true;
        pendingVeritices.add(0);

        while (!pendingVeritices.isEmpty()) {
            int currentVertex = pendingVeritices.poll();
            System.out.print(currentVertex +" ");

            for (int i = 0; i < matrix.length; i++) {
                if (matrix[currentVertex][i] == 1 && !visited[i]) {
                    pendingVeritices.add(i);
                    visited[i] = true;
                }
            }
        }
    }

}
