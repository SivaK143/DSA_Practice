package Patterns.part2;

public class first {

    static void second(){
        int row, col;
        for(row = 1; row<=5; row++)
        {
            for(col = 1; col<=row; col++)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void third(){
        int row,col;
        for(row = 1; row<=5; row++)
        {
            for(col = 1; col<=row; col++)
            {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    static void fourth(){
        int row, col;
        for(row = 1; row<=5; row++)
        {
            for(col = 1; col<=5-row + 1; col++)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void fifth(){
        int row, col;
        for(row = 1; row<=5; row++)
        {
            for(col = 5; col>= 5-row + 1; col--)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int row, col;
        for(row = 1; row<=5; row++)
        {
            for(col = 1; col <= row; col++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        second();
        third();
        reverseThird();
        fourth();
        fifth();

    }

    private static void reverseThird() {

        int row, col;
        for(row = 1; row<=5; row++)
        {
            for(col = row; col>0; col--)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
