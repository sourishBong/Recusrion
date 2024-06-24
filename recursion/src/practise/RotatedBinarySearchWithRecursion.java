package practise;

public class RotatedBinarySearchWithRecursion {

    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,1,2,3};
        int target=7;
       // int ans=binarySearchIterative(arr,target);
        int ans=binarySearchRecursive(arr,target);
        System.out.println(ans);
    }

    private static int binarySearchRecursive(int[] arr, int target) {

        return helper(arr,target,0,arr.length-1);
    }

    private static int helper(int[] arr, int target, int start, int end) {
        if(start>end)
            return -1;

        int mid=start+(end-start)/2;

        if(target==arr[mid])
            return mid;

        if(arr[start]<=arr[mid]){
            if(target>=arr[start] && target<arr[mid])
                return helper(arr,target,start,mid-1);
            else
                return helper(arr,target,mid+1,end);
        }else{
            if(target>arr[mid] && target <=arr[end])
                return helper(arr,target,mid+1,end);
            else
                return helper(arr,target,start,mid-1);
        }
    }

    private static int binarySearchIterative(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid])
                return mid;
            if(arr[start]<=arr[mid]){
                if(target>=arr[start] && target<arr[mid])
                    end=mid-1;
                else
                    start=mid+1;
            }else {
                if(target>arr[mid] && target<=arr[end])
                    start = mid + 1;
                else
                    end=mid-1;
            }
        }
        return -1;
    }
}
