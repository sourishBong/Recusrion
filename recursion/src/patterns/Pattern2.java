package patterns;
/*
     *
   * * *
 * * * * *
 */
public class Pattern2 {

    public static void main(String args[]){
       // printWithIteration(5);
       printWithRecursion(5);
    }
    static int c=1;
    private static void printWithRecursion(int n) {

        helper(n,0,c);
    }

    private static void helper(int n, int i,int c) {
        if(i>=n)
            return;

        prinstSpaces(i+1,n-1);
        printStar(1,i,c);
        c++;
        prinstSpaces(i+1,n-1);
        System.out.println();
        helper(n,i+1,c);
    }

    private static void printStar(int i, int n, int c) {
        if(i>n+c)
            return;
        System.out.print("*");
        printStar(i+1,n,c);
    }

    private static void prinstSpaces(int i, int n) {
        if(i>n)
            return;
        System.out.print(" ");
        prinstSpaces(i+1,n);

    }

    private static void printWithIteration(int n) {
        int c=1;
        for(int i=0;i<n;i++){
            for(int k=i+1;k<=n-1;k++){
                System.out.print(" ");
            }
            //this could have been done using j<=2*i-1
          //  for(int j=1;j<=2*i-1;j++){
            for(int j=1;j<=i+c;j++){
                System.out.print("*");
            }
            c++;
            for(int k=i+1;k<=n-1;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
