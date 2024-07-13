package hard;

import java.util.Arrays;

// https://leetcode.com/problems/n-queens-ii/description/
public class NQueensII {

    public static void main(String[] args) {
        int n=4;
        int ans=totalNQueens(n);
        System.out.println(ans);
    }

    public static int totalNQueens(int n) {
        boolean grid[][]=new boolean[n][n];
        return queens( grid,0);
    }

    private static int queens(boolean[][] grid, int row) {
        if(row== grid.length){
            return 1;
        }

        int count=0;
        //placing queens and checking for every row and col
        for(int col=0;col<grid[0].length;col++){
            //place the queen if it is safe
            if(isSafe(grid,row,col)){
                grid[row][col]=true;
                count+=queens(grid,row+1);
                grid[row][col]=false;
            }

        }

        return count;
    }

    private static boolean isSafe(boolean[][] grid, int row, int col) {
        //vertical
        for(int i=0;i<row;i++){
            if(grid[i][col])
                return false;
        }
        //check left diagonal
        int left=Math.min(row,col);
        for(int i=0;i<=left;i++){
            if(grid[row-i][col-i])
                return false;
        }

        //check right diagonal
        int right=Math.min(row,grid.length-col-1);
        for(int i=0;i<=right;i++){
            if(grid[row-i][col+i])
                return false;
        }
        return true;
    }

    private static void display(boolean[][] grid) {
        for(boolean row[]:grid){
            for(boolean element:row){
                if(element)
                    System.out.print("Q");
                else
                    System.out.println(".");
            }
            System.out.println();
        }
    }

}
