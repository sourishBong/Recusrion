package practise;

public class CountZeroesInNumber {

    public static void main(String[] args) {
        int n=100300100;
      //  int ans=countZeroesIterative(n);
      //  int ans=countZeroesRecursion(n);
        int ans=countZeroesRecursion2(n);
        System.out.println(ans);
    }

    private static int countZeroesRecursion2(int n) {
        int count=0;

       return helper(n,count);
    }

    private static int helper(int n, int count) {
        if(n==0)
            return count;

        if(n%10==0)
            count++;

        return helper(n/10,count);

    }

    static int count=0;
    private static int countZeroesRecursion(int n) {
        if(n==0)
            return 0;

        if(n%10==0)
            count++;

        countZeroesRecursion(n/10);
        return count;
    }

    private static int countZeroesIterative(int n) {
        int count=0;
        while(n!=0){
            int temp=n%10;
            if(temp==0)
                count++;
            n=n/10;
        }
        return count;
    }

}
