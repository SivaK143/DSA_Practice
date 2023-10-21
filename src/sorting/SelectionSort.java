package sorting;

import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int []arr)
    {
        int n = arr.length;
        for(int i=0; i<n - 1; i++)
        {
            int index = i;
            for(int j=i+1; j<n; j++)
            {
                if(arr[j] < arr[index]) index = j;
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    static void selectionDesc(int []arr)
    {
        int n= arr.length;
        for(int i=0; i<n-1; i++)
        {
            int index = i;
            for(int j=i+1; j<n; j++)
            {
                if(arr[j] > arr[index]) index = j;
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    static void charSelection(char []arr)
    {
        int n = arr.length;
        for(int i=0; i<n -1; i++)
        {
            int index = i;
            for(int j = i+1; j<n; j++)
            {
                if((int)arr[index] > (int)arr[j]) index = j;
            }
            char temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] ={9,7,3,1,6};

//        selectionSort(arr);
//        System.out.println(Arrays.toString(arr));
//        selectionDesc(arr);
//        System.out.println(Arrays.toString(arr));

        char []ch = {'C','A','B','D'};
        charSelection(ch);
        System.out.println(Arrays.toString(ch));
    }
}
