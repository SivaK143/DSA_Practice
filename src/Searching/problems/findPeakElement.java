package Searching.problems;

public class findPeakElement {

    static int findPeak(int []arr)
    {
        //edge cases
        //if the length is 1 simply return 0
        if(arr.length == 0) return 0;
        //if first element is greater than second we can simply return 0 beacsue peak index is present at 0
        if(arr[0] >= arr[1]) return 0;
        //same for the last element
        if(arr[arr.length - 1] >= arr[arr.length-2]) return arr.length-1;

        int start = 0, end = arr.length - 1, mid;
        while(start <= end)
        {
            mid = start + (end - start)/2;
            if(mid > 0 && arr[mid] >= arr[mid - 1] && arr[mid] >= arr[mid + 1]) return mid;
            else if(mid > 0 && arr[mid - 1] > arr[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }

    //another method like finding peak element
    static int peak(int []arr)
    {
        if(arr.length == 1) return 0;
        int start = 0, end = arr.length - 1, mid;
        while(start < end)
        {
            mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]) end = mid;
            else start = mid + 1;
        }
        return start;
    }

    public static void main(String[] args) {

        int []arr = {3,4,3,2,1};
        System.out.println(findPeak(arr));
        System.out.println(peak(arr));
    }
}
