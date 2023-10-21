package Patterns.part1;

public class columnPrintAlphabet {

    static void printNumbers(){
        int count = 0;
        for(int row = 1; row<=5; row++)
        {
            for(int col = 1; col<=5; col++)
            {
                System.out.print(++count + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int row;
        for(row = 0; row<5; row++)
        {
            for(char col = 'a'; col<='e'; col++)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        printNumbers();
    }
}
