package practise;

public class FindArrayIsSortedOrNot {

    public static void main(String[] args) {
        int arr[]={1,3,5,6,7};
       // boolean ans=checkSortedIterative(arr);
        boolean ans=checkSortedRecursive2(arr);
        System.out.println(ans);
    }

    private static boolean checkSortedRecursive2(int[] arr) {
        boolean ans=helper2(arr,1);
        return ans;
    }

    private static boolean helper2(int[] arr, int i) {
        if(i==arr.length)
            return true;

        //both will work
       // return !(arr[i-1]>arr[i]) && helper(arr, i + 1);
        return (arr[i-1]<arr[i]) && helper(arr, i + 1);
    }

    private static boolean checkSortedRecursive(int[] arr) {
        boolean ans=helper(arr,1);
        return ans;
    }

    private static boolean helper(int[] arr, int i) {
        if(i==arr.length)
            return true;
        if(arr[i-1]>arr[i]) {
            return false;
        }
        else {
         return helper(arr, i + 1);
        }
    }

    private static boolean checkSortedIterative(int[] arr) {

        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i])
                return false;
        }
        return true;
    }
}
