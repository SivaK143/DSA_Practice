package Searching.problems;

public class SearchInRotated2 {

    static boolean search(int []arr, int target)
    {
        int start = 0, end = arr.length - 1, mid;
        while(start <= end)
        {
            mid = start + (end - start)/2;
            if(arr[mid] == target) return true;
            else if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                start++;
                end--;
                continue;
            }else if(arr[mid] >= arr[start])//check for the sorted is left sorted
            {
                if(arr[start] >= target && target <= arr[mid])
                {
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{ //right sorted
                if(arr[mid] <= target && target <= arr[end])
                {
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int []arr = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(search(arr, target));
    }
}
