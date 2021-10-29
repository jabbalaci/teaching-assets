import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] scores = new int[10];  // filled with 0s

        System.out.println(Arrays.toString(scores));
        modosit(scores);
        System.out.println(Arrays.toString(scores));

        int[] five = getOneToFive();
        System.out.println(Arrays.toString(five));
    }

    public static int[] getOneToFive()
    {
        int[] result = {1, 2, 3, 4, 5};
        return result;
    }

    public static void modosit(int[] tomb) {
        tomb[0] = 99;
    }

    // public static void kiir(int[] scores)
    // {
        // for (int i = 0; i < scores.length; ++i) {
            // System.out.print(scores[i] + " ");
        // }
        // System.out.println();
    // }
}
