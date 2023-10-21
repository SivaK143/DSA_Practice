package Patterns.part2;

public class alphabet {

    public static void main(String[] args) {

        int row, col;
        for(row = 1; row<=5; row++)
        {
            char name = (char) ('a' + row - 1);
            for(col = 1; col<=row; col++)
            {
                System.out.print(name + " ");
            }
            System.out.println();
        }
    }
}
