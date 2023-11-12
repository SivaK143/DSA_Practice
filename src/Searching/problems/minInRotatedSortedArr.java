package Searching.problems;

public class minInRotatedSortedArr {


    static int minRotatedArr(int []arr)
    {
        int start = 0, end = arr.length - 1,mid, ans = arr[0];
        while(start <= end)
        {
            mid = start + (end - start)/2;
            if(arr[mid] >= arr[0]) start = mid + 1;
            else{
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int []arr = {3,4,5,1,2};
        System.out.println(minRotatedArr(arr));
    }
}
