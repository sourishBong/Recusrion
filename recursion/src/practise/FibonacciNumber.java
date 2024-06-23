package practise;

import java.sql.SQLOutput;

//find nth fibonacci number
public class FibonacciNumber {

    public static void main(String[] args) {

      int ans=  fibonacci(7);
        System.out.println(ans);

    }

    private static int fibonacci(int n) {
        if(n==0 || n==1)
            return n;

       return fibonacci(n-1) + fibonacci(n-2);
    }
}
