package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[]={5,3,4,1,2};
       // int ans[]=bubbleSortIterative(arr);
        int ans[]=bubbleSortRecursion(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] bubbleSortRecursion(int[] arr) {
        return helper(arr,0,0,arr.length);
    }

    private static int[] helper(int[] arr, int i, int j,int n) {
        if(i>=n)
            return arr;

        if(j<n-1){
            if(arr[j+1]<arr[j]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
         return helper(arr,i,j+1,n);
        }else{
            return helper(arr,i+1,0,n);
        }

    }

    private static int[] bubbleSortIterative(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
