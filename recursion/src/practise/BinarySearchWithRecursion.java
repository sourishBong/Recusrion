package practise;

//binary search using recursion
public class BinarySearchWithRecursion {

    public static void main(String[] args) {
            int arr[]={1,2,3,4,5};
            int target=2;
            int ans=binarySearch(arr,target,0,arr.length-1);
            System.out.println(ans);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {

        if(start>end)
            return -1;

        int mid=start+(end-start)/2;

        if(target==arr[mid])
            return mid;

       else if(target<=arr[mid])
            return binarySearch(arr,target,start,mid-1);
       else
           return binarySearch(arr,target,mid+1,end);
    }
}
