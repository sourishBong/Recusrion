package patterns;

/*
*****
****
***
**
*
 */
public class Pattern1 {

    public static void main(String[] args) {
      //  printWithIteration(5);
       // printWithRecursion(5);
        printWithRecursion2(5);
    }

    private static void printWithRecursion2(int n) {
        helper2(n,0);
    }

    private static void helper2(int n, int i) {
        if(i>n)
            return;

        if(i<n){
            System.out.print("*");
            helper2(n,i+1);
        }else{
            System.out.println();
            helper2(n-1,0);
        }
    }

    private static void printWithRecursion(int n) {
        helper(n,1);
    }

    private static void helper(int n, int i) {
        if(i>n)
            return;

        helperSecond(n,i);
        System.out.println();
        helper(n,i+1);
    }

    private static void helperSecond(int n, int i) {
        if(n<i)
            return;
        System.out.print("*");
        helperSecond(n-1,i);
    }

    private static void printWithIteration(int n) {
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
