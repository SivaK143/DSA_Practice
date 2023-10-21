package Searching.problems;

import java.util.Arrays;

public class firstAndLastPosition {

    static int[] binarySearch(int []arr, int target)
    {
        int start = 0, end = arr.length-1, first = -1,last=-1, mid;
        //first position
        while(start <= end)
        {
            mid = start + (end - start)/2;
            if(arr[mid] == target)
            {
                first = mid;
                end = mid - 1;
            }else if(arr[mid] < target) start = mid + 1;
            else end = mid -1;
        }

//        last position
        start = 0;
        end = arr.length-1;
        while(start<=end)
        {
            mid = start + (end - start)/2;
            if(arr[mid] == target){
                last = mid;
                start = mid + 1;
            }else if(arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        int []ans = {-1,-1};
        ans[0] = first;
        ans[1] = last;

        return ans;

    }

    public static void main(String[] args) {

        int []arr = {5,7,7,8,8,10};

        int []ans = binarySearch(arr,8);
        System.out.println(Arrays.toString(ans));
    }
}
