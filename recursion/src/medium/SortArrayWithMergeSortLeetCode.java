package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/sort-an-array/description/
public class SortArrayWithMergeSortLeetCode {

    public static void main(String[] args) {
        int nums[]={8,3,4,12,5,6};
        int ans[]=sortArray(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] sortArray(int[] nums) {
        mergeHelper(nums,0,nums.length-1);
        return nums;
    }

    private static void mergeHelper(int[] nums, int start, int end) {
        if(start>=end)
            return;

        int mid=start+(end-start)/2;
        mergeHelper(nums,start,mid);
        mergeHelper(nums,mid+1,end);

        merge(nums,start,mid,end);
    }

    private static void merge(int[] nums, int start, int mid, int end) {

        List<Integer> arr=new ArrayList<>();
        int left=start;
        int right=mid+1;

        while(left<=mid && right<=end){
            if(nums[left]<=nums[right]){
                arr.add(nums[left]);
                left++;
            }else if(nums[left]>nums[right]){
                arr.add(nums[right]);
                right++;
            }
        }

        while(left<=mid){
            arr.add(nums[left]);
            left++;
        }

        while(right<=end){
            arr.add(nums[right]);
            right++;
        }

        for(int i=start;i<=end;i++){
            nums[i]=arr.get(i-start);
        }
    }
}
