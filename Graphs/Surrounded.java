package Graphs;

public class Surrounded {
    int rows;
    int coloum;
    int[][] direction = {{-1,0}, {1,0}, {0,1}, {0,-1}};
    
    public void solve(char[][] board) {
         rows = board.length;
         coloum = board[0].length;

        for (int i = 0; i < rows; i++){
            if (board[i][0] == 0) {
                
            }
        }
    }

    public void dfs(int[][] board, int r, int c){
        if (r < 0 || c <0 || r >= rows || c >= coloum || board[r][c] != '0') {
            return;
        }
        board[r][c] = 'T';

        for(int d : direction){
            int nr = r + d[0];
            int  nc = c + d[0];
        }
    }
}
