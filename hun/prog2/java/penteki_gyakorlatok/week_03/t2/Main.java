import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] szamok = {45, 65, 44, 75, 74, 54, 65};

        System.out.println(Arrays.toString(szamok));
        Arrays.sort(szamok);
        System.out.println(Arrays.toString(szamok));
    }
}
