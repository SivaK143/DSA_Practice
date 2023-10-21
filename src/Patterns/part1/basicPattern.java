package Patterns.part1;

public class basicPattern {

    static void print10()
    {
        int row, col = 0;
        for(row = 1; row<=4; row++)
        {
            for(col =1 ; col<=5; col++)
            {
                System.out.print("10" + " ");
            }
            System.out.println();
        }
    }

    static void printRowNumber(){

        int row, col;
        for(row = 1; row<=5; row++)
        {
            for(col = 0; col<5; col++)
            {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    static void printColNumber(){
        int row, col;
        for(row=1; row<=5; row++)
        {
            for(col = 1; col<=5; col++)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void printColReverse()
    {
        int row, col;
        for(row = 0; row<5; row++)
        {
            for (col = 5; col>0; col--)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

//        for(int i=0; i<5; i++)
//        {
//            for(int j=0; j<5; j++)
//            {
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }

//        print10();

//        printRowNumber();
//        printColNumber();
        printColReverse();
    }
}
