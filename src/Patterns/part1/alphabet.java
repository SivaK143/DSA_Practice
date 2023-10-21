package Patterns.part1;

public class alphabet {

    public static void main(String[] args) {


        int row, col;
        for(row = 0; row<5; row++)
        {
            char name = (char)('a' + row);
            for(col =0; col<5; col++)
            {
                System.out.print(name  + " ");
            }
            System.out.println();
        }
    }
}
