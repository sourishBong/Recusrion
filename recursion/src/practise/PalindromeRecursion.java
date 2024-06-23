package practise;

public class PalindromeRecursion {

    public static void main(String[] args) {
        int n=131;
        boolean ans=palindrome(n);
        System.out.println(ans);
    }

    private static boolean palindrome(int n) {
        //count number of digits
        int digits=(int)Math.log10(n)+1;

        if(n==helper(n,digits))
            return true;
        else
            return false;
    }

    private static int helper(int n, int digits) {
        if(n==0)
            return 0;
        int rem=n%10;
          return (int) (rem*Math.pow(10,digits-1)+helper(n/10,digits-1));

    }
}
