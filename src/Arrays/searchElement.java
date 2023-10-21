package Arrays;

public class searchElement {

    static boolean search(int []arr, int ele)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == ele) return true;
        }

        return false;
    }

    public static void main(String[] args) {

        int []arr = {10,20,7,11,8,4};
        System.out.println(search(arr,1));
    }
}
