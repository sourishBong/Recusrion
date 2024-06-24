package practise;

import java.util.ArrayList;

public class LinearSearchWithRecursion {

    public static void main(String[] args) {
        int arr[]={1,5,3,8,4};
        int arr2[]={1,5,4,3,8,4};
        int target=18;

        //finding the index
        int ans=linearWithRecursion(arr,target);

        //finding al indexes
        ArrayList<Integer> ans2=returnAllIndex(arr2,target);
        System.out.println(ans);
        System.out.println(ans2);
    }

    private static ArrayList<Integer> returnAllIndex(int[] arr2, int target) {
        ArrayList<Integer> ans=new ArrayList<>();
        ans= helper2(arr2,target,0,ans);
        return ans;
    }

    private static ArrayList<Integer> helper2(int[] arr, int target, int i, ArrayList<Integer> ans) {
        if(i==arr.length){
            return ans;
        }
        if(arr[i]==target) {
            ans.add(i);
        }
        return helper2(arr,target,i+1,ans);

    }

    private static int linearWithRecursion(int[] arr,int target) {

        return helper(arr,0,target);
    }

    private static int helper(int[] arr, int i, int target) {
        if(i==arr.length)
            return -1;
        if(arr[i]==target)
            return i;
        else {
        return helper(arr, i + 1, target);
        }
    }
}
