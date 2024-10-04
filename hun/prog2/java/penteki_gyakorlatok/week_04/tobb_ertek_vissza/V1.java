import java.util.Arrays;

/*
    Írjunk metódust, ami megkapja a tömböt,
    s visszaadja az első és az utolsó elemét
    a tömbnek.
*/

public class V1
{
    public static void main(String[] args)
    {
        int[] szamok = { 9, 7, 6, 5, 4, 3, 4, 2 };

        int[] result = getFirstAndLast(szamok);
        System.out.println(Arrays.toString(result));
    }

    private static int[] getFirstAndLast(int[] szamok)
    {
        int[] result = new int[2];
        result[0] = szamok[0];
        result[1] = szamok[szamok.length-1];

        return result;
    }
}
