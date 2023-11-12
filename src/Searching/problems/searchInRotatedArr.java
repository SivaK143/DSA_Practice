package Searching.problems;

import java.util.Arrays;

public class searchInRotatedArr {

    static int searchInArr(int []arr, int target) {
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            //check whether the target is present or not
            if (arr[mid] == target) return mid;
                //if the arr is left sorted
            else if (arr[mid] >= arr[0]) {
                //check whether the target is present in the range
                if (arr[start] < target && target < arr[mid]) end = mid - 1;
                else start = mid + 1;
            } else {
                //the arr is right sorted
                //check whether the target is present in the range
                if (arr[mid] < target && target < arr[end]) start = mid + 1;
                else end = mid - 1;
            }

        }
        return -1;
    }

        public static void main(String[] args){

        int[] arr = {4,5,6,7,0,1,2};
            System.out.println(searchInArr(arr,0));

    }
}
