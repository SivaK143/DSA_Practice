package Arrays;

public class secondGreater {

    static int secondMax(int []arr)
    {
        int first = -1, second = -1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > first) {
                second = first;
                first = arr[i];
            }else if(arr[i] > second && arr[i] != first)
            {
                second = arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args) {

        int [] arr = {2,6,4,3,8,5,1};

        System.out.println(secondMax(arr));
    }
}
