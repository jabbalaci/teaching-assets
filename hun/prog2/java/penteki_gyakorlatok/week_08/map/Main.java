import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

public class Main
{
    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<>();
        map.put("a", "alfa");
        map.put("b", "beta");
        map.put("d", "delta");
        map.put("g", "gamma");
        map.put("o", "omega");
        map.put("x", "xxx");
        System.out.println(map);

        String value = map.getOrDefault("a", "NOT_FOUND");
        System.out.println(value);
        value = map.getOrDefault("x", "");
        System.out.println(value);
        System.out.println("------------");
        System.out.println(map.containsKey("d"));
        System.out.println(map.containsValue("omega"));

//        map.put("x", "xxx");
        map.replace("x", "xxx");
        System.out.println(map);
        System.out.println("-----------");

        for (String k : map.keySet())
        {
            System.out.println(k);
        }
        for (String v : map.values())
        {
            System.out.println(v);
        }
        System.out.println("-------------");

        for (Entry<String, String> e : map.entrySet())
        {
            System.out.printf("%s -> %s\n", e.getKey(), e.getValue());
        }
        System.out.println("------------");
        System.out.println(map);
        System.out.println(map.size());
    }
}
