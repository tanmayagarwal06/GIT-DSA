package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class zeroonematrix {
    public int[][] updateMatrix(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;

        Queue<int[]> queue = new LinkedList<>();

        int[][] direction = {{-1,0}, {1,0}, {0,1}, {0,-1}};

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if (mat[i][j] == 0) {
                    queue.offer(new int[]{i,j});
                }
                else{
                    mat[i][j] = -1;
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();

            int row = curr[0];
            int coloum = curr[1];

            for(int[] d : direction){
                int newrow = row + d[0];
                int newcoloum = coloum + d[1];

                if (newrow >= 0 && newcoloum >= 0 && newrow < m && newcoloum < n && mat[newrow][newcoloum] == -1)  {
                    mat[newrow][newcoloum] = mat[row][coloum]+1;

                    queue.offer(new int[]{newrow,newcoloum});
                }
            }
        }
        return mat;
    }
}
