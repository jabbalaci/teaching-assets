import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int x = product(2, 3, 10);          // 60
        int y = product(2, 3, 10, 2);       // 120

        System.out.println(x);
        System.out.println(y);
    }

    public static int product(int... args)
    {
        int p = 1;

        for (int n : args) {
            p *= n;
        }

        return p;
    }
}
