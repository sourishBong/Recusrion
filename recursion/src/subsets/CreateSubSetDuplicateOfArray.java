package subsets;

import java.util.ArrayList;

public class CreateSubSetDuplicateOfArray {

    public static void main(String[] args) {
        int arr[]={1,2,2};
        ArrayList<ArrayList<Integer>> ans=createSubSetDuplicate(arr);
       //ArrayList<ArrayList<Integer>> ans=createSubSetDuplicateIterative(arr);
        System.out.println(ans);
    }

    private static ArrayList<ArrayList<Integer>> createSubSetDuplicateIterative(int[] arr) {
        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();

        outer.add(new ArrayList<>());
        int start=0;
        int end=0;

        // for(int num:arr){
        for(int i=0;i<arr.length;i++){
            start=0;
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int size= outer.size();
            for(int j=start;j<size;j++){
                ArrayList<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }

    private static ArrayList<ArrayList<Integer>> createSubSetDuplicate(int[] arr) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());
        helper(arr,0,arr.length-1,result,0,result.size(),0,0);
        return result;
    }

    private static void helper(int[] arr, int i, int n,
                               ArrayList<ArrayList<Integer>> result, int j, int size,int start,int end) {
        if(i>n)
            return;
        if(j<size){
            ArrayList<Integer> temp=new ArrayList<>(result.get(j));
            temp.add(arr[i]);
            result.add(temp);
            helper(arr,i,n,result,j+1,size,start,end);
        }else{
            start=0;
            i=i+1;
            if(i>0 && i<arr.length && arr[i]==arr[i-1])
                start=end+1;
            end=result.size()-1;
            size= result.size();
            helper(arr,i,n,result,start,size,start,end);
        }
    }
}
