package Patterns.part4;

public class pyramid {

    static void pyramidPattern(int n)
    {
        int row, col;
        for(row = 1; row<=n; row++)
        {
            //spaces
            for(col = 0; col<(n-row); col++)
            {
                System.out.print("  ");
            }
            //stars with odd no
            for(col = 1; col<=(2*row - 1); col++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void numberPattern(int n)
    {
        int row, col;
        for(row = 1; row<=n; row++)
        {
            //spaces
            for(col = 0; col<(n-row); col++)
            {
                System.out.print("  ");
            }
            //numbers from increasing order
            for(col = 1; col<=row; col++)
            {
                System.out.print(col + " ");
            }
            //numbers from row - 1 to decrease
            for(col = row -1; col>=1; col--)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void reversePyramid(int n)
    {
        int row, col;
        for(row = n; row>=1; row--)
        {
            //spaces
            for(col = 1; col<=(n-row); col++)
            {
                System.out.print("  ");
            }
            //stars
            for(col = 1; col <= 2*row - 1; col++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }

    static void specialPattern(int n)
    {
        int row, col;
        for(row = n; row>=1; row--)
        {
            //stars
            for(col =1;col<=row; col++)
            {
                System.out.print("*"+ " ");
            }
            //spaces
            for(col = 1; col <= 2*n - 2* row; col++)
            {
                System.out.print("  ");
            }

            //stars
            for(col = 1; col<=row; col++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }

        //for the down part
        for(row = 1; row<=n; row++)
        {
            //stars
            for(col = 1; col<=row; col++)
            {
                System.out.print("*"+ " ");
            }

            //spaces
            for(col = 1; col<= 2*n - 2*row; col++)
            {
                System.out.print("  ");
            }
            //stars
            for(col = 1; col<=row; col++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }

    static void specialPattern1(int n)
    {
        int row, col;
        for(row = 1; row<=n; row++)
        {
            //stars
            for(col = 1; col<=row; col++)
            {
                System.out.print("*"+ " ");
            }
            //spaces
            for(col = 1; col <= 2*n-2*row; col++)
            {
                System.out.print("  ");
            }
            //stars
            for(col = 1; col<=row; col++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }

        //for the down part
        for(row = n-1; row>=1; row--)
        {
            //stars
            for(col = 1; col<=row; col++)
            {
                System.out.print("*"+" ");
            }
            //spaces
            for(col = 1; col<=2*n - 2*row; col++)
            {
                System.out.print("  ");
            }
            //stars
            for(col = 1; col<=row; col++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    static void specialPattern2(int n)
    {
        int row, col;
        for(row = 1; row<=n; row++)
        {
            //spaces
            for(col = 1; col<=(n-row); col++)
            {
                System.out.print(" ");
            }
            //stars
            for(col = 1; col<=row; col++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        //for the down part
        for(row = n; row>=1; row--)
        {
            //spaces
            for(col = 1; col <=(n-row); col++)
            {
                System.out.print(" ");
            }
            //stars
            for(col = 1; col<=row; col++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pyramidPattern(6);
        numberPattern(6);

        reversePyramid(5);

        specialPattern(4);

        specialPattern1(4);

        specialPattern2(4);
    }
}
