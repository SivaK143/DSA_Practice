package Searching.problems;

public class kthMissingNumber {

    static int missingNumber(int []arr, int k)
    {
        int start =0, end = arr.length - 1, mid, ans = arr.length;
        while(start <= end)
        {
            mid = start + (end - start)/2;
            if(arr[mid] - mid - 1 < k) start = mid + 1;
            else{
                ans = mid;
                end = mid - 1;
            }
        }
        return ans + k;
    }

    public static void main(String[] args) {

        int []arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(missingNumber(arr, k));
    }
}
