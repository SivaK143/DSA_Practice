package Arrays;

import java.util.Arrays;

public class rotate {

    static void inplaceRotate(int []arr)
    {
        reverse(arr, 0, arr.length - 2);
        reverse(arr, 0, arr.length - 1);
    }

    static void reverse(int []arr, int start ,int end)
    {
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateArr(int []arr)
    {
        int []newArr = new int[arr.length];
        for(int i=1; i<arr.length; i++)
        {
            newArr[i] = arr[i-1];
        }
        newArr[0] = arr[arr.length - 1];
        System.out.println(Arrays.toString(newArr));
    }
    public static void main(String[] args) {

        int []arr = {2,7,4,11,5,8};
//        rotateArr(arr);
        inplaceRotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
