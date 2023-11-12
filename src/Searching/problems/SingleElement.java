package Searching.problems;

public class SingleElement {

    static int singleElement(int []arr)
    {
        int n = arr.length;
        if(n == 1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[n-1] != arr[n-2]) return arr[n-1];
        int start = 1, end = n - 2, mid;
        while(start <= end)
        {
            mid = start + (end - start)/2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]) return arr[mid];
            else if((mid%2==0 && arr[mid] == arr[mid+1]) || (mid%2==1 && arr[mid] == arr[mid-1])) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int []arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleElement(arr));
    }
}
