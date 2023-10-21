package Searching.problems;

public class countZeros {

    static int count(int []arr, int n)
    {
        int start = 0, end = n-1, ans = 0, mid;
        while(start <= end)
        {
            mid = start + (end - start)/2;
            if(arr[mid] == 0)
            {
                ans = mid;
                end = mid -1;
            }else start = mid + 1;
        }
        return n - ans;
    }

    public static void main(String[] args) {

        int arr[] = {1,1,1,1,1,1,1,1,1,0,0,0};
        System.out.println(count(arr, arr.length));
    }
}
