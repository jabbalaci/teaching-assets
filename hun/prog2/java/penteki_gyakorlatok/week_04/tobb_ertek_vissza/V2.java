import java.util.List;
import java.util.ArrayList;

/*
    Írjunk metódust, ami megkapja a tömböt,
    s visszaadja az első és az utolsó elemét
    a tömbnek.
*/

public class V2
{
    public static void main(String[] args)
    {
        int[] szamok = { 9, 7, 6, 5, 4, 3, 4, 2 };

        List<Integer> result = getFirstAndLast(szamok);

        System.out.println(result);
    }

    private static List<Integer> getFirstAndLast(int[] szamok)
    {
        List<Integer> result = new ArrayList<Integer>();
        result.add(szamok[0]);
        result.add(szamok[szamok.length-1]);

        return result;
    }
}
