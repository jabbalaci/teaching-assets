import java.util.Comparator;

public class AgeComparator implements Comparator<User>
{
    @Override
    public int compare(User u1, User u2)
    {
        return u1.getAge() - u2.getAge();
    }
}
