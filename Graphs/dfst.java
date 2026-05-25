package Graphs;

public class dfst {
    public static void dfsTraversal(int matrix[][], int currentVertex, boolean visited[]){
        visited[currentVertex] = true;
        System.out.println(currentVertex + " ");
        for(int i = 0; i < matrix.length; i++){
            if (matrix[currentVertex][i] ==1  && visited[i] == false ) {
                dfsTraversal(matrix, i, visited);
            }
        }
        public static void dfs(int matrix[][]){
            boolean visited[] = new boolean[matrix.length];
            dfsTraversal(matrix, currentVertex, visited);
        }
    }
}
