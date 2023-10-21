package Patterns.part4.homework;

public class second {

    static void secondPattern(int n)
    {
        int row, col;
        for(row = 1; row<=n; row++)
        {
            //spaces
            for(col =1; col<=(n-row); col++)
            {
                System.out.print("  ");
            }

            //numbers
            for(col = 1; col <= (2*row - 1); col++)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void lastPattern(int n)
    {
        int row, col;
        for(row = 1; row<=n; row++)
        {
            //spaces
            for(col = 1; col<=(n-row); col++)
            {
                System.out.print("  ");
            }
            //increasing part
            for(col = 1; col<=row; col++)
            {
                System.out.print((char) ('A'+col - 1)+ " ");
            }

            //decreasing part
            for(col = row - 1; col>=1; col--)
            {
                System.out.print((char) ('A'+col - 1) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        secondPattern(5);

        lastPattern(5);
    }
}
