package Patterns.part3;

public class first {

    static void firstPro(int n)
    {
        int row, col;
        for (row = 1; row<=n; row++)
        {
            //we have to print spaces first
            for(int sp=0; sp<(n-row); sp++ )
            {
                System.out.print("  ");
            }
            //next print stars
            for(col = 1; col<=row; col++)
            {
                System.out.print("* ");
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
            for(col = 1; col<=row; col++)
            {
                System.out.print(row+" ");
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
            for(col = 0; col < (n-row); col++)
            {
                System.out.print("  ");
            }
            //numbers
            for(col = 1; col<=row; col++)
            {
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }

    static void fourth(int n)
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
            for(col = 1; col<=row;col++)
            {
                System.out.print((char) ('A' + col - 1) + " ");
            }
            System.out.println();
        }
    }

    static void fifth(int n)
    {
        int row, col;
        for(row=1; row<=n; row++)
        {
            //spaces
            for(col=0; col<(n-row); col++)
            {
                System.out.print("  ");
            }
            //numbers
            for(col = row; col>0; col--)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {


//          *
//        * *
//       * * *
        firstPro(5);
        second(6);
        third(6);
        fourth(6);
        fifth(6);
    }
}
