package backtrackingPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NqueensArray {

    public static void main(String[] args) {
        int n=4;
        List<String> arr=solveNqueens(n);
        System.out.println(arr);
    }

    private static List<String> solveNqueens(int n) {
        String arr[][]=new String[n][n];
        List<String> result=new ArrayList<>();
        for (String[] row : arr) {
            Arrays.fill(row, ".");
        }
        helper(n,0,arr,result);
        return result;
    }

    private static void helper(int n, int row, String[][] arr,List<String> result) {
        if(row==n){
            display(arr,result);
            System.out.println();
            return;
        }
            for (int c = 0; c < n; c++) {
                if (isSafe(row, c , arr)) {
                    arr[row][c]="Q";
                    helper(n, row+1, arr,result);
                    arr[row][c]=".";
                }

            }
    }

    private static void display(String[][] arr,List<String> result) {

        for(int i=0;i<arr.length;i++){
            String str="";
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
                if(arr[i][j].equalsIgnoreCase("Q"))
                    str=str+"Q";
                else
                    str=str+".";
            }
            System.out.println();
            result.add(str);
           // str="";
        }

    }

    private static boolean isSafe(int r, int c, String[][] arr) {
        //check vertical row
        for(int i=0;i<r;i++){
            if(arr[i][c].equalsIgnoreCase("Q"))
                return false;
        }

        //diagonal left
        int maxleft=Math.min(r,c);
        for(int i=0;i<=maxleft;i++){
            if(arr[r-i][c-i].equalsIgnoreCase("Q"))
                return false;
        }

        //diagonal right
        int maxRight=Math.min(r,arr.length-c-1);
        for(int i=0;i<=maxRight;i++){
            if(arr[r-i][c+i].equalsIgnoreCase("Q"))
                return false;
        }

        return true;
    }

//    private static boolean isSafe(int oldR,int oldC,int r,int c, String[][] arr) {
//        if(r>=0 && c>=0 && r<arr.length && c<arr.length){
//            if(oldR==r || oldC==c)
//                return false;
//            else if(r==0){
//                if(c==0 &&("Q".equalsIgnoreCase(arr[r][c+1]) ||
//                        "Q".equalsIgnoreCase(arr[r+1][c+1]) ||
//                        "Q".equalsIgnoreCase(arr[r+1][c])))
//                    return false;
//                else if(c!=0 &&("Q".equalsIgnoreCase(arr[r][c+1]) ||
//                        "Q".equalsIgnoreCase(arr[r+1][c+1]) ||
//                        "Q".equalsIgnoreCase(arr[r+1][c]) ||
//                        "Q".equalsIgnoreCase(arr[r+1][c-1]) ||
//                        "Q".equalsIgnoreCase(arr[r][c-1])))
//                    return false;
//            }else if(c==arr.length-1){
//                if(r!=arr.length-1 && ("Q".equalsIgnoreCase(arr[r+1][c]) ||
//                        "Q".equalsIgnoreCase(arr[r+1][c-1]) ||
//                        "Q".equalsIgnoreCase(arr[r][c-1]) ||
//                        "Q".equalsIgnoreCase(arr[r-1][c-1]) ||
//                        "Q".equalsIgnoreCase(arr[r-1][c]))){
//                    return false;
//                }else if(r==arr.length-1 && (
//                        "Q".equalsIgnoreCase(arr[r][c-1]) ||
//                        "Q".equalsIgnoreCase(arr[r-1][c-1]) ||
//                        "Q".equalsIgnoreCase(arr[r-1][c])))
//                    return false;
//            }
//            else if("Q".equalsIgnoreCase(arr[r][c+1]) ||
//                    "Q".equalsIgnoreCase(arr[r+1][c+1]) ||
//                    "Q".equalsIgnoreCase(arr[r+1][c]) ||
//                    "Q".equalsIgnoreCase(arr[r+1][c-1]) ||
//                    "Q".equalsIgnoreCase(arr[r][c-1]) ||
//                    "Q".equalsIgnoreCase(arr[r-1][c-1]) ||
//                    "Q".equalsIgnoreCase(arr[r-1][c]) ||
//                    "Q".equalsIgnoreCase(arr[r-1][c+1]))
//                return false;
//            else
//                return true;
//        }
//
//        return false;
//    }
}
