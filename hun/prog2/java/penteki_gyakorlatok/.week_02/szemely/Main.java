import java.util.Calendar;

class Person
{
    public String name;
    public String eMail;
    public int yearOfBirth;

    public int howOldAreYou()
    {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year - yearOfBirth;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Person p1 = new Person();
        p1.name = "Anna";
        p1.eMail = "anna@hello.com";
        p1.yearOfBirth = 1990;

        System.out.println(p1.howOldAreYou());
    }
}
