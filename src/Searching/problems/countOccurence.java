package Searching.problems;

public class countOccurence {

    static int countOccur(int []arr, int x, int n)
    {
        int start = 0, end = n -1, first = -1, last = -1, mid;
        //calculating first occurence
        while(start <= end)
        {
            mid = start + (end - start)/2;
            if(arr[mid] == x)
            {
                first = mid;
                end = mid - 1;
            }else if(arr[mid] < x) start = mid + 1;
            else end = mid - 1;
        }
        if(first == -1) return 0;
        //intia;ize start and end
        start = 0;
        end = n -1;
        //calculating second occurence
        while(start <= end)
        {
            mid = start + (end - start)/2;
            if(arr[mid] == x)
            {
                last = mid;
                start = mid + 1;
            }else if(arr[mid] < x) start = mid + 1;
            else end = mid - 1;
        }
        return last - first + 1;
    }

    public static void main(String[] args) {

        int []arr = {1, 1, 2, 2, 2, 2, 3};
        int x = 2;
        int n= arr.length;
        System.out.println(countOccur(arr,x,n));
    }
}
