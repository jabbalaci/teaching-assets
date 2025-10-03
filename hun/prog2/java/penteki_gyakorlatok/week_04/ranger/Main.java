import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Integer> szamok1 = PyUtils.range(5, 20, 2);

        List<Integer> szamok2 = PyUtils.range(5, 20);

        List<Integer> szamok3 = PyUtils.range(20);

        System.out.println(szamok1);
        // System.out.println(szamok2);
        // System.out.println(szamok3);

        for (int n : szamok1)
        {
            System.out.println(n);
        }
        System.out.println("----");

        String text = "Java 21";

        for (char c : text.toCharArray())
        {
            System.out.println(c);
        }
    }
}
