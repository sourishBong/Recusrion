package sorting;

import java.util.Arrays;

//take the largest element in the array and put it at last
//then take 2nd largest element in an array and put at last.
//this is how you can sort.
public class SelectionSort {

    public static void main(String[] args) {
        int arr[]={5,3,4,1,2};
        // int ans[]=SelectionSortIterative2(arr);
        int ans[]=SelectionSortRecursion(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] SelectionSortRecursion(int[] arr) {
     return helper(arr,arr.length-1,0,arr.length-1);
    }

    private static int[] helper(int[] arr, int i, int j,int maxIndex) {
        if(i==0)
            return arr;
        if(j<i){
           if(arr[j]>arr[maxIndex]){
               maxIndex=j;
           }
            return helper(arr,i,j+1,maxIndex);
        }else {
            int temp=arr[maxIndex];
            arr[maxIndex]=arr[i];
            arr[i]=temp;
            return helper(arr, i - 1, 0, i - 1);
        }
    }

    private static int[] SelectionSortIterative2(int[] arr) {
        for(int i=arr.length-1;i>=0;i--){
            int maxIndex=i;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[maxIndex])
                    maxIndex=j;
            }
            int temp=arr[maxIndex];
            arr[maxIndex]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }

    private static int[] SelectionSortIterative(int[] arr) {
            //descending
//        for(int i=0;i<=arr.length-1;i++){
//            int maxValue=i;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[j]>arr[maxValue])
//                    maxValue=j;
//            }
//            int temp=arr[maxValue];
//            arr[maxValue]=arr[i];
//            arr[i]=temp;
//        }

        //ascending
        for(int i=0;i<=arr.length-1;i++){
            int minValue=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minValue])
                    minValue=j;
            }
            int temp=arr[minValue];
            arr[minValue]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
