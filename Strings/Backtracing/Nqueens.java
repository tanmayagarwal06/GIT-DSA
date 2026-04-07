package Strings.Backtracing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nqueens {
    public List<List<String>> solveNQueens(int n){
        List<List<String>> result = new ArrayList<>();

        char [][] board = new char[n][n];

        for(char[] row : board ){
            Arrays.fill(row, '.');
        }

        boolean[] coloum = new boolean[n];
        boolean[] diagonal1 = new boolean[2*n];
        boolean[] diagonal2 = new boolean[2*n];

        backtrack(0, n, board, result, coloum, diagonal1, diagonal2);
        return result;

    }

    private void backtrack(int row,int n, char[][] board, List<List<String>> result, boolean[] coloum, boolean[] diagonal1, boolean[] diagonal2){
        if (row == n) {
            result.add(construct(board));
            return;
        }

        for(int col = 0; col < n; col++){
            if (coloum[col] || diagonal1[row + col] || diagonal2[row - col + n]) {
                continue;
            }
            board[row][col] = 'Q';
            coloum[col] = true;
            diagonal1[row + col] = true;
            diagonal2[row - col + n] = true;

            backtrack(row + 1, n, board, result, coloum, diagonal1, diagonal2);

            board[row][col] = '.';
            coloum[col] = false;
            diagonal1[row + col] = false;
            diagonal2[row - col + n] = false;
        }
    }


    private List<String> construct(char[][] board){
        List<String> result = new ArrayList<>();
        for(char[] row : board){
            result.add(new String(row));
        }
        return result;
    }
}
