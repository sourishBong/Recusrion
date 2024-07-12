package medium;

import java.util.ArrayList;

public class RatinaMazeProblemI {

    public static void main(String[] args) {
        int N=4;

        int m[][]={{1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}};

//        int N=2;
//
//        int m[][] = {{1, 0},
//                {1, 0}};

        ArrayList<String> ans=findPath(m,N);
        System.out.println(ans);
    }

    private static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> result=new ArrayList<>();
        helper("",0,0,m,n,result);
        return result;
    }

    private static void helper(String p, int row, int col, int[][] m, int n, ArrayList<String> result) {

        if(row==n-1 && col==n-1){
            if(m[row][col]==1) {
                result.add(p);
                return;
            }else{
                result.add("-1");
                return;
            }
        }

        if(m[row][col]==0)
            return;

        m[row][col]=0;

        if(row<n-1){
            helper(p+"D",row+1,col,m,n,result);
        }

        if(col<n-1 ){
            helper(p+"R",row,col+1,m,n,result);
        }

        if(row>=1){
            helper(p+"U",row-1,col,m,n,result);
        }

        if(col>=1){
            helper(p+"L",row,col-1,m,n,result);
        }

        m[row][col]=1;
    }
}
