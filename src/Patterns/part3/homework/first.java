package Patterns.part3.homework;

public class first {

    static void first(int n)
    {
        int row, col;
        for(row = 1; row<=n; row++)
        {
            //spaces
            for(col = 0; col<(n-row); col++)
            {
                System.out.print("  ");
            }
            //characters
            for(col = 1; col<=row; col++)
            {
                System.out.print((char) ('A'+row - 1)+ " ");
            }
            System.out.println();
        }
    }

    static void second(int n)
    {
        int row, col;
        for(row = 1; row<=n; row++)
        {
            //spaces
            for(col = 0; col<(n-row); col++)
            {
                System.out.print("  ");
            }
            //numbers
            for(col = n; col>=(n-row+1); col--)
            {
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }

    static void third(int n)
    {
        int row, col;
        for(row = 1; row<=n; row++)
        {
            //spaces
            for(col = 0; col<(n-row); col++)
            {
                System.out.print("  ");
            }
            //charcters
            for(col=n;col>=(n-row+1); col--)
            {
                System.out.print((char) ('A'+col - 1)+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        first(6);

        second(5);

        third(5);
    }
}
