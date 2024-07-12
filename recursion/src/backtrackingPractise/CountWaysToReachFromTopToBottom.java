package backtrackingPractise;

// Count ways to go from top to bottom
//User can go to right or down
public class CountWaysToReachFromTopToBottom {

    public static void main(String[] args) {
//        int count=returnPaths(3,3);
//        System.out.println(count);
      //  path("",3,3);
        pathReverse("",0,0);
    }

    static int returnPaths(int row,int col){
        if(row==1 || col==1)
            return 1;

        int left=returnPaths(row-1,col);
        int right=returnPaths(row,col-1);
        return left+right;
    }

    private static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1){
            path(p+'D',r-1,c);
        }

        if(c>1){
            path(p+'R',r,c-1);
        }

    }

    private static void pathReverse(String p,int r,int c){
        if(r==2 && c==2){
            System.out.println(p);
            return;
        }

        if(r<2){
            pathReverse(p+'D',r+1,c);
        }

        if(c<2){
            pathReverse(p+'R',r,c+1);
        }

    }
}
