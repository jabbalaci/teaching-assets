import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
        List<Integer> szamok = new ArrayList<>();
        szamok.add(4);
        szamok.add(6);
        szamok.add(9);
        szamok.add(1);

        List<Integer> copy = new ArrayList<>(szamok);
        copy.set(0, 99);

        System.out.println(szamok);
        System.out.println(copy);

        // Collections.sort(szamok);
        // System.out.println(szamok);
        // Collections.reverse(szamok);
        // System.out.println(szamok);
        // Collections.shuffle(szamok);
        // System.out.println(szamok);
    }
}
