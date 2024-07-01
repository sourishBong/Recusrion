package sorting;

import java.util.Arrays;

// Here we will take pivot
// choose any element as pivot
//after first pass all the elements less than pivot will be on left hand of pivot
// and the ones greater will be on the right of the pivot
public class QuickSort {

    public static void main(String[] args) {
        int[] arr={8,3,4,12,5,6};
        int[] ans=quickSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] quickSort(int[] nums) {
            quickSortHelper(nums,0,nums.length-1);
            return nums;
    }

    private static void quickSortHelper(int[] nums, int left, int right) {

        if(left>right)
            return;

        int start=left;
        int end=right;
        int mid=start+(end-start)/2;
        int pivot=nums[mid];

        while(start<=end){
            while(nums[start]<pivot){
                start++;
            }

            while(nums[end]>pivot){
                end--;
            }

            if(start<=end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }

        quickSortHelper(nums,start,right);
        quickSortHelper(nums,left,end);
    }
}
