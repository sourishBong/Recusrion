package hard;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/n-queens/description/
public class NQueens {

    public static void main(String[] args) {
        int n=4;
        List<List<String>> ans=solveNQueens(n);
    }

    private static List<List<String>> solveNQueens(int n) {
        List<List<String>> result=new ArrayList<>();
        List<String> p=new ArrayList<>();
        helper(0,0,result,p,n);
        return result;
    }

    private static void helper(int row, int col, List<List<String>> result,List<String> p, int n) {
        if(row==n-1 && col==n-1){
            result.add(p);
            return;
        }

    }


}
