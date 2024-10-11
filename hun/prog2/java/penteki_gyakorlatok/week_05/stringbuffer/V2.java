/*
    írjuk le egymás mellé a számokat 1-től 20-ig
    az eredmény legyen egy sztring:

    "1234.....89101112......1920"
 */

public class V2
{
    public final static int N = 100_000;

    public static void main(String[] args)
    {
        // sztrinbufferes verzió
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; ++i)
        {
            sb.append(i);
        }
        System.out.println(sb.toString().length());
    }
}
