package practise;

//sum of digits if n=1342 then 1+3+4+2=10
public class SumOfDigits {

    public static void main(String[] args) {
        int n=1342;
        int ans=sumofDigits(n);
        System.out.println(ans);
    }

    private static int sumofDigits(int n) {
        if(n==0)
            return 0;

        return sumofDigits(n/10)+n%10;
    }

    static int sum=0;
    private static int sumofDigitsRecurison2(int n) {
        if(n==0)
            return 0;

        sum=sum+(n%10);
        sumofDigits(n/10);
        return sum;
    }

    private static int sumofDigitsWithRecursion(int n) {
        int result=0;
        while(n!=0){
            int temp=n%10;
            result=result+temp;
            n=n/10;

        }
        return result;
    }
}
