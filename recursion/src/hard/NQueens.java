package hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/n-queens/description/
public class NQueens {

    public static void main(String[] args) {
        int n=4;
        List<List<String>> ans=solveNQueens(n);
        System.out.println(ans);
    }

    private static List<List<String>> solveNQueens(int n) {
        List<List<String>> result=new ArrayList<>();
        String grid[][]=new String[n][n];
       for(String row[]:grid){
           Arrays.fill(row,".");
       }
        helper(0,result,n,grid);
        return result;
    }

    private static void helper(int row, List<List<String>> result, int n,String[][] grid) {
        if(row==n){
            display(result,grid);
            return;
        }
            for(int col=0;col<n;col++){
                if(isSafe(row,col,grid)){
                    grid[row][col]="Q";
                    helper(row+1,result,n,grid);
                    grid[row][col]=".";
                }
            }
    }

    private static void display(List<List<String>> result, String[][] grid) {
        List<String> list=new ArrayList<>();

        for(int i=0;i<grid.length;i++){
            String str="";
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j].equalsIgnoreCase("Q"))
                    str=str+"Q";
                else
                    str=str+".";
            }
            list.add(str);
        }
        result.add(list);
    }

    private static boolean isSafe(int row, int col, String[][] grid) {

        //for vertical up
        for(int i=0;i<row;i++){
            if(grid[i][col].equalsIgnoreCase("Q"))
                return false;
        }

        //left diagonal
        int left=Math.min(row,col);
        for(int i=0;i<=left;i++){
            if(grid[row-i][col-i].equalsIgnoreCase("Q"))
                return false;
        }
        //right diagonal
        int right=Math.min(row,grid[0].length-col-1);
        for(int i=0;i<=right;i++){
            if(grid[row-i][col+i].equalsIgnoreCase("Q"))
                return false;
        }

        return true;
    }


}
