package sorting;

import java.util.Arrays;

//divide array into two parts
//get both parts sorted via recursion
//merge the sorted parts
public class MergeSort {

    public static void main(String[] args) {
        int[] arr={8,3,4,12,5,6};
        int[] ans=mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    //In this merge sort array is used as a copy
    private static int[] mergeSort(int[] arr) {
        return mergeHelper(arr);
    }

    private static int[] mergeHelper(int[] arr) {
        if(arr.length==1)
            return arr;

        int mid=arr.length/2;
       int[] left=mergeHelper(Arrays.copyOfRange(arr,0,mid));
       int[] right=mergeHelper(Arrays.copyOfRange(arr,mid,arr.length));

       return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int p1=0;
        int p2=0;
        int i=0;
        int ans[]=new int[left.length+right.length];
        while(p1<left.length && p2<right.length){

            if(left[p1]<right[p2]){
                ans[i]=left[p1];
                i++;
                p1++;
            }else if(left[p1]>=right[p2]){
                ans[i]=right[p2];
                i++;
                p2++;
            }
        }

        while(p1<left.length){
            ans[i]=left[p1];
            i++;
            p1++;
        }
        while(p2<right.length){
            ans[i]=right[p2];
            i++;
            p2++;
        }

        return ans;
    }
}
