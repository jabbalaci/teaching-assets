import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Integer> szamok = new ArrayList<>();
        szamok.add(5);
        szamok.add(9);
        szamok.add(8);
        System.out.println(szamok);
        int x = szamok.get(0);
        System.out.println(x);
    }
}
