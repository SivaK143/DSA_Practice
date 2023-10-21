package Searching.problems;

public class squareRoot {

    static int sqrt(int x)
    {
        int start = 0, end = x, ans = 0, mid;
        while(start <= end)
        {
            mid = start + (end - start)/2;
            if(mid == x/mid)  //to avoid overflow
            {
                return mid;
            }else if(mid * mid < x)
            {
                ans = mid;
                start = mid + 1;
            }else end = mid - 1;
        }
        return ans;
    }

    public static void main(String[] args) {

        int x = 8;
        System.out.println(sqrt(x));
    }
}
