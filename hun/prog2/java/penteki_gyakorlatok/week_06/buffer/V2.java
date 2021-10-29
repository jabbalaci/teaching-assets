public class V2
{
    private final static int N = 100_000;

    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; ++i) {
            sb.append(i);
        }

        String result = sb.toString();
        System.out.println(result);
    }
}
