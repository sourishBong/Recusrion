package practise;

public class ReverseANumber {

    public static void main(String[] args) {
        int n=1342;
        int ans=reverseNumberRecursive2(n);
        System.out.println(ans);
    }

    private static int reverseNumberRecursive2(int n) {

        //find number of digits in a numeric value
        int digits=(int) (Math.log10(n))+1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if(n==0)
            return 0;

        int rem=n%10;
        return (int) (rem* Math.pow(10,digits-1)+ helper(n/10,digits-1));
    }

    private static int rev=0;
    private static int reverseNumberRecursive(int n) {
        if(n==0)
            return 0;
         rev=rev*10+(n%10);
         reverseNumberRecursive(n/10);
         return rev;
    }

    private static int reverseNumberIterative(int n) {
        int result=0;
        while(n!=0){
            int rem=n%10;
            result=result*10+rem;
            //result=result*10;
            n=n/10;
        }
        return result;
    }
}
