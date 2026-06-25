package Recursion;

import java.util.HashSet;

public class SudokuValid {

    public boolean isValidSudoku(char[][] board){
        HashSet<String> seen = new HashSet<>();
        
        for(int r = 0; r<9; r++){
            for(int c = 0; c <9; c++){

                char num = board[r][c];

                if (num == '.') {
                    continue;
                }

                if (!seen.add("r" + r + num) || !seen.add ("c" + c + num) || !seen.add("b" + (r/3) + (c/3) + num)) {
                    return false;
                }
            }
        }
        return true;
    }
}