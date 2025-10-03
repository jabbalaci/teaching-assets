import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Integer> szamok = PyUtils.range(5, 20, 2);

        Collections.shuffle(szamok);
        Collections.sort(szamok);
        Collections.reverse(szamok);
        Collections.sort(szamok);

        Collections.rotate(szamok, 4);

        System.out.println(szamok);
    }
}
