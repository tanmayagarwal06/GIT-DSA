package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class rootenoranges {
    public static int rootingOranges(int[][] matrix){
        int row = matrix.length;
        int coloum = matrix[0].length;

        Queue<int[]> queue = new LinkedList<>();

        int fresh = 0;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < coloum; j++){
                if (matrix[i][j] == 2) {
                    queue.offer(new int[] {i,j});
                }
                else if (matrix[i][j] == 1) {
                    fresh++;
                }
                
            }
        }

        if (fresh == 0) {
            return 0;
        }

        int minutes = 0;
        int [][] direction = {{-1,0}, {1,0}, {0,1} , {0,-1}};


        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rootenThisMoment = false;

            for(int i = 0; i < size; i++){
                int[] current = queue.poll();

                int r = current[0];
                int c = current[1];

                for(int[] d : direction){
                    int nr = r + d[0];
                    int nc = c + d[1];

                    if (nr > 0 && nc >0 && nr < size && nc < size && matrix[nr][nc] == 1) {
                        matrix[nr][nc] = 2;
                        fresh--;

                        queue.offer(new int[]{nr,nc});
                        rootenThisMoment = true;
                    }
                }
            }
            if (rootenThisMoment) {
                minutes++;
            }
        }
        return fresh == 0 ? minutes : -1;
    }
}
