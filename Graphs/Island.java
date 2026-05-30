package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class Island {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int coloum = grid[0].length;

        int Island = 0;
        int[][] direction = {{-1,0}, {1,0}, {0,1}, {0,-1}};

        for(int i = 0; i < row; i++){
            for(int j = 0; j < coloum; j++){
                if (grid[i][j] == 1) {
                    Island++;

                    Queue<int[]> queue = new LinkedList<>();

                    queue.offer(new int[]{i,j});

                    grid[i][j] = '0';

                    while (!queue.isEmpty()) {
                        int[] current = queue.poll();
                        int r = current[0];
                        int c = current[1];

                        for(int[] d : direction){
                            int sr = r +d[0];
                            int sc = c + d[1];

                            if (sr>0 && sc >0 && sr < row && sc <coloum && grid[sr][sc]=='1') {
                                grid[sr][sc] = '0';
                                queue.offer(new int[]{sr,sc});
                            }
                        }
                    }
                }
            }
        }
        return Island;
    }

    public int numIslands(int[][] grid){
        int island = 0;

        for (int i = 0; i < grid.length; i++) {
            for(int j = 0 ; j < grid[0].length; j++ ){

                if (grid[i][j] == 1) {
                    island++;
                }
            }
        }
        return island;
    }

    public void dfs (int[][] grid, int r, int c ){
        if (r < 0 || c< 0|| r >= grid.length || c >= grid[0].length || grid[r][c] == '0') {
            return;
        }
        grid[r][c] = 0;
        dfs(grid, r+1, c);
        dfs(grid, r-1, c);
        dfs(grid, r, c+1);
        dfs(grid, r, c-1);
    }
}
