package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class Colourfill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color){
        int row = image.length;
        int coloum = image[0].length;

        int oldColour = image[sr][sc];

        if (oldColour == color) {
            return image;
        }

        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[] {sr,sc});

        image[sr][sc] = color;

        int[][] direction = {{-1, 0}, {1,0}, {0,1}, {0,-1}};

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];

            for(int d[] : direction){
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr>=0 && nc>=0 && nr < row && nc < coloum && image[nr][nc] == oldColour ) {
                    image[nr][nc] = color;
                    queue.offer(new int[]{nr,nc});
                }
            }
        }
        return image;
    }
}
