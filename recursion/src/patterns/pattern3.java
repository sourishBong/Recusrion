package patterns;

/*
*
* *
* * *
* * * *
* * * * *
 */
public class pattern3 {

    public static void main(String[] args) {
      //  printWithRecursion(5);
        printWithRecursion2(5);
    }

    private static void printWithRecursion2(int n) {
        helper2(n,1,1);
    }

    private static void helper2(int n, int i, int j) {
        if(i>n)
            return;

        if(j<=i) {
            System.out.print("*");
            helper2(n,i,j+1);
        }
        else{
            System.out.println();
            helper2(n,i+1,1);
        }
    }

    private static void printWithRecursion(int n) {
        helper(n,0);
    }

    private static void helper(int n, int i) {
        if(n==0)
            return;

        if(i<n) {
            helper(n, i + 1);
            System.out.print("*");

        }else{
            helper(n-1,0);
            System.out.println();
        }
    }
}
