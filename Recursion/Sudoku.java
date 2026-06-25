package Recursion;

public class Sudoku {
    public void solveSudoku(char[][] board){
            solver(board);
    
    }

    private boolean solver(char[][] board){
        for (int row = 1; row<=9; row++){
            for(int col = 1; col<= 9; col++){
                if (board[row][col] == '.') {
                    for(char num = 1; num <= 9; num++){
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num;

                            if (solver(board)) {
                                return true;
                            }
                            board[row][col] = '.';
                        }

                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int row, int col, char num){
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) {
                return false;
            }
            if (board[i][col] == num) {
                return false;
            }
        }

            int startrow = (row/3) * 3;
            int startcol = (row/3) * 3;

            for(int r = startrow; r <= startrow + 3; r++){
                for(int c = startcol; r<= startcol+3;c++){
                    if (board[r][c] == num) {
                        return false;
                }
            }

        }
        return true;
    }
}
