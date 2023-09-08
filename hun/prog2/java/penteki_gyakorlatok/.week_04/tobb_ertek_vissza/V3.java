/*
    Írjunk metódust, ami megkapja a tömböt,
    s visszaadja az első és az utolsó elemét
    a tömbnek.
*/

class PairIntInt
{
    public int a;
    public int b;
}

public class V3
{
    public static void main(String[] args)
    {
        int[] szamok = { 9, 7, 6, 5, 4, 3, 4, 2 };

        PairIntInt pair = getFirstAndLast(szamok);
        System.out.printf("x: %d, y: %d\n", pair.a, pair.b);

        // List<Integer> result = getFirstAndLast(szamok);
        // System.out.println(result);
    }

    private static PairIntInt getFirstAndLast(int[] szamok)
    {
        PairIntInt pair = new PairIntInt();
        pair.a = szamok[0];
        pair.b = szamok[szamok.length-1];

        return pair;
    }

    // private static List<Integer> getFirstAndLast(int[] szamok)
    // {
        // List<Integer> result = new ArrayList<Integer>();
        // result.add(szamok[0]);
        // result.add(szamok[szamok.length-1]);
//
        // return result;
    // }
}
