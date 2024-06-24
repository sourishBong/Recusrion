package easy;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
public class NumberOfStepsToReduceNUmberToZero {

    public static void main(String[] args) {
        int num=14;
        int ans=numberOfSteps(num);
        System.out.println(ans);
    }

    private static int numberOfSteps(int num) {
        int count=0;
        
        return helper(num,count);
    }

    private static int helper(int num, int count) {
        if(num==0)
            return count;
        
        if(num%2==0)
          return  helper(num/2,count+1);
        else
           return helper(num-1,count+1);
    }
}
