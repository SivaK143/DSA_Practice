package Patterns.part2;

public class star {
    public static void main(String[] args) {

        int row, col;
        for(row = 5; row>=1; row--)
        {
            for(col =1; col <= row; col++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
