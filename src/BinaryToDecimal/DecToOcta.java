package BinaryToDecimal;

public class DecToOcta {

    static int DecimalToOcta(int n)
    {
        int rem, ans = 0, i=0;
        while(n > 0)
        {
            rem = n % 8;
//            System.out.println(rem);
            ans = rem * (int)Math.pow(8,i) + ans;
            System.out.println(ans);
            i++;
            n = n / 8;

        }
        return ans;
    }
    public static void main(String[] args) {

        System.out.println(DecimalToOcta(13));
    }
}
