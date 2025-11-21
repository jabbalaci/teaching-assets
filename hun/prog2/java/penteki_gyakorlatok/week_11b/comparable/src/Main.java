import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
//        List<String> nevek = new ArrayList<>(List.of("dd", "cc", "aa", "bb"));
//        System.out.println(nevek);
//
//        Collections.sort(nevek);
//        System.out.println(nevek);

        List<User> users = new ArrayList<>();
        users.add(new User("bela"));
        users.add(new User("aladar"));
        users.add(new User("denes"));
        users.add(new User("cecil"));

        Collections.sort(users);

        System.out.println(users);
    }
}
