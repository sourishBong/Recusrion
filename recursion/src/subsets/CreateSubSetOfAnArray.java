package subsets;

import java.util.ArrayList;
import java.util.List;

public class CreateSubSetOfAnArray {

    public static void main(String[] args) {
        int arr[]={1,2,3};
        ArrayList<ArrayList<Integer>> ans=createSubSet(arr);
     //   ArrayList<ArrayList<Integer>> ans=createSubSetItertion(arr);
        System.out.println(ans);
    }

    private static ArrayList<ArrayList<Integer>> createSubSetItertion(int[] arr) {
        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();

        outer.add(new ArrayList<>());

       // for(int num:arr){
        for(int j=0;j<arr.length;j++){
            int size= outer.size();
            for(int i=0;i<size;i++){
                ArrayList<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(arr[j]);
                outer.add(internal);
            }
        }

        return outer;
    }

    private static ArrayList<ArrayList<Integer>> createSubSet(int[] arr) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());
        helper(arr,0,arr.length-1,result,0,result.size());
        return result;
    }

    private static void helper(int[] arr, int i, int n, ArrayList<ArrayList<Integer>> result,int j,int size) {
     //   result.add(new ArrayList<>());
        if(i>n) {
            return;
        }
        if(j<size){
            ArrayList<Integer> temp=new ArrayList<>(result.get(j));
            temp.add(arr[i]);
            result.add(temp);
            helper(arr,i,n,result,j+1,size);
        }else {
            size=result.size();
            helper(arr, i + 1, n, result, 0, size);
        }
    }
}
