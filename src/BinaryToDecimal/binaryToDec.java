package BinaryToDecimal;

public class binaryToDec {

    static int DecimalToBinary(int n)
    {
        int rem, ans = 0, i=0;
        while(n > 0)
        {
            rem = n%2;
            n = n/2;
            ans = rem * (int)(Math.pow(10,i)) + ans;
            i++;
        }
        return ans;
    }

    static int BinaryToDecimal(int n)
    {
        int rem , ans = 0, mul = 1;
        while(n>0)
        {
            rem = n % 10;
            ans = rem * mul + ans;
            mul = mul * 2;
            n = n/10;
        }
        return ans;
    }
    public static void main(String[] args) {

       int ans = DecimalToBinary(12341);

        System.out.println(BinaryToDecimal(1101));
    }
}
