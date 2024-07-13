package hard;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/sudoku-solver/description/
public class SudokuSolver {

    public static void main(String[] args) {
        char board[][]={{'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}};

        solveSudoku(board);
        System.out.println(Arrays.deepToString(board));
    }

    private static void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    private static boolean solve(char[][] board, int row, int col) {

        // Base case: If row is equal to board length, entire board has been filled
        if (row == board.length) {
            return true;
        }

        // Move to next row when current row is fully filled
        if (col == board[0].length) {
            return solve(board, row + 1, 0);
        }

        // Skip cells that are already filled
        if (board[row][col] != '.') {
            return solve(board, row, col + 1);
        }

        for (char num = '1'; num <= '9'; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;

                // Move to next cell
                if (solve(board, row, col + 1)) {
                    return true;
                }
                // Backtrack to previous state if solution not found
                board[row][col] = '.';
            }
        }

        return false;
    }

    public static boolean isSafe(char[][] board,int row,int col,char num){

        //checking for row
        for(int i=0;i< board.length;i++){
            if(board[i][col]==num)
                return false;
        }

        //checking for col
        for(int i=0;i<board.length;i++){
            if(board[row][i]==num)
                return false;
        }

        int square=(int) (Math.sqrt(board.length));
        int r=row-row%square;
        int c=col-col%square;

        for(int i=r;i<r+square;i++){
            for(int j=c;j<c+square;j++){
                if(board[i][j]==num)
                    return false;
            }
        }

        return true;
    }
}
