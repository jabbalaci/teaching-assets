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
        users.add(new User("bela", 20));
        users.add(new User("aladar", 18));
        users.add(new User("denes", 16));
        users.add(new User("cecil", 15));

//        Collections.sort(users);
        Collections.sort(users, new AgeComparator());

        System.out.println(users);
    }
}
