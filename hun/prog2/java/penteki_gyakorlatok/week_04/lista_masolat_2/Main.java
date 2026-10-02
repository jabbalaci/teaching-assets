import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Integer> szamok1 = PyUtils.range(5, 20, 2);

        List<Integer> masolat = new ArrayList<Integer>();
        masolat.addAll(szamok1);

        // szamok1[0] = 99;
        szamok1.set(0, 99);

        System.out.println(szamok1);
        System.out.println(masolat);
    }
}
