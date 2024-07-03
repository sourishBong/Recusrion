package medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        int nums[]={1,2,3};
        List<List<Integer>> ans=permute(nums);
        System.out.println(ans);
    }

    private static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        helper(nums,0,nums.length-1,result);
        return result;
    }

    private static void helper(int[] nums, int start, int len, List<List<Integer>> result) {
        if(start>len){
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                list.add(nums[i]);
            }
            result.add(list);
            return;
        }

       for(int i=start;i<=len;i++){
                swap(i,start,nums);
                helper(nums, start + 1, len, result);
                swap(i,start,nums);
           }
       }

    private static void swap(int i, int start, int[] nums) {
        int temp=nums[i];
        nums[i]=nums[start];
        nums[start]=temp;
    }

}
