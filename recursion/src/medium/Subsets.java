package medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {
        int nums[]={1,2,3};
        List<List<Integer>> ans=subsets(nums);
        System.out.println(ans);
    }

    private static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());
        helper(nums,0,nums.length-1,result,result.size(),0);
        return result;
    }

    private static void helper(int[] arr, int start, int len,
                               List<List<Integer>> result,int size,int j) {
      if(start>len)
          return;

        if(j<size){
            ArrayList<Integer> temp=new ArrayList<>(result.get(j));
            temp.add(arr[start]);
            result.add(temp);
            helper(arr,start,len,result,size,j+1);
        }else{
            size=result.size();
            helper(arr, start + 1, len, result,size, 0);
        }
    }

}
