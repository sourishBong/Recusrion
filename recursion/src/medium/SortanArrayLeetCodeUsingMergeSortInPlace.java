package medium;
//Exceeding time limit in Leetcode
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/sort-an-array/description/
public class SortanArrayLeetCodeUsingMergeSortInPlace {

    public static void main(String[] args) {
        int nums[]={5,2,3,1};
        int ans[]=sortArray(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] sortArray(int[] nums) {
        mergeHelper(nums,0,nums.length);
        return nums;
    }

    private static void mergeHelper(int[] nums, int start, int end) {
        if(end-start<=1)
            return;

        int mid=start+(end-start)/2;
        mergeHelper(nums,start,mid);
        mergeHelper(nums,mid,end);

        mergeInplace(nums,start,mid,end);
    }

    private static void mergeInplace(int[] nums, int start, int mid, int end) {
       //int ans[]=new int[end-start];
        List<Integer> ans=new ArrayList<>();
        int p1=start;
        int p2=mid;
        int i=0;
        while(p1<mid && p2<end){

            if(nums[p1]<nums[p2]){
               // ans[i]=nums[p1];
                ans.add(nums[p1]);
                i++;
                p1++;
            }else if(nums[p1]>nums[p2]){
             //   ans[i]=nums[p2];
                ans.add(nums[p2]);
                i++;
                p2++;
            }
        }

        while(p1<mid){
           // ans[i]=nums[p1];
            ans.add(nums[p1]);
            i++;
            p1++;
        }
        while(p2<end){
          //  ans[i]=nums[p2];
            ans.add(nums[p2]);
            i++;
            p2++;
        }

        for(int l=0;l<ans.size();l++){
            nums[start+l]=ans.get(l);
        }


    }
}
