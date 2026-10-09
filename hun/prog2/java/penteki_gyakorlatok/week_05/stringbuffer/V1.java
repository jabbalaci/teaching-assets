/*
    írjuk le egymás mellé a számokat 1-től 20-ig
    az eredmény legyen egy sztring:

    "1234.....89101112......1920"
 */

public class V1
{
    public final static int N = 100_000;

    public static void main(String[] args)
    {
        // naiv verzió
        String s = "";
        for (int i = 1; i <= N; ++i)
        {
            // s += String.valueOf(i);
            // s = "1234" + "5"
            //     "12345"
            s = s + String.valueOf(i);
        }
        System.out.println(s.length());
    }
}
