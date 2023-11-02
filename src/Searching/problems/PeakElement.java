package Searching.problems;

public class PeakElement {

//    static int peakIndex(int []arr)
//    {
//        int start = 0, end = arr.length - 1, mid;
//        while(start <= end)
//        {
//            mid = start + (end - start)/2;
//            if(arr[mid] > arr[mid -1] && arr[mid] > arr[mid+1])
//                return mid;
//            else if(arr[mid] > arr[mid-1])
//                start = mid + 1;
//            else end = mid - 1;
//        }
//        return -1;
//    }


    //if the array is mountain array then we can use another approach
    static int peak(int []arr)
    {
        int start =0, end = arr.length-1, mid;
        while(start < end)
        {
            mid = start + (end - start)/2;
            if(arr[mid] < arr[mid + 1]) start = mid + 1;
            else end = mid;
        }
        return arr[start];
    }

    public static void main(String[] args) {

        int []arr = {0,10,5,2};
//        System.out.println((arr));

        System.out.println(peak(arr));

    }
}

