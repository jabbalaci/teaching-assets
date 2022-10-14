import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        // int[][] matrix = new int[3][2];    // kinullázza a mátrixot
        // matrix[0][0] = 2;
        // matrix[0][1] = 3;
        // ...

        int[][] matrix = {
            {2, 3},
            {5, 8},
            {7, 1},
        };

        System.out.println(Arrays.deepToString(matrix));
    }
}
