public class V1
{
    private final static int N = 100_000;

    public static void main(String[] args)
    {
        String s = "";

        for (int i = 1; i <= N; ++i) {
            s = s + i;    // s += i;
        }

        System.out.println(s);
    }
}
