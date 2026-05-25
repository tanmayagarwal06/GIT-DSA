package Graphs;

public class provinces {
    public int dfs(int [][] array){
        int n = array.length;
        boolean[]  visited = new boolean[n];

        int provinces = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                helper(array, i, visited);
                provinces++;
            }
        }
        return provinces;

       
    }
     public void helper(int[][] array, int city, boolean[] visited){
            visited[city] = true;
             int n = array.length;
            for(int i = 0; i < n; i++){
                if (array[city][i] == 1 && visited[i] == false) {
                    helper(array, i, visited);
                }
            }
        }
}
