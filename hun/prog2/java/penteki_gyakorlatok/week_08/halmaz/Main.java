import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<>();
        set.add("geza");
        set.add("geza");
        set.add("kek");
        set.add("az");
        set.add("az");
        set.add("az");
        set.add("eg");

        System.out.println(set);
        System.out.println(set.getClass());
        System.out.println("---------");

        List<String> szavak = List.of("aa", "bb", "cc", "cc", "dd");
        Set<String> masik = new HashSet<>(szavak);
        System.out.println(masik);
        System.out.println("-----------");

        for (String elem : set)
        {
            System.out.println(elem);
        }
        System.out.println(set.contains("geza"));
        System.out.println("-------");
//        masik.remove("bb");
//        System.out.println(masik);
        List<String> vissza = new ArrayList<>(masik);
        System.out.println(vissza);
        System.out.println(vissza.getClass());
        System.out.println(masik.size());
        //
        System.out.println("--------------");
        Set<String> a = new HashSet<>(List.of("alma", "banan", "citrom"));
        Set<String> b = new HashSet<>(List.of("banan", "narancs"));
        System.out.println(a);
        System.out.println(b);
        // unió
        Set<String> result = new HashSet<>(a);
        result.addAll(b);
        System.out.println(result);
        System.out.println("----");
        System.out.println(a);
    }
}
