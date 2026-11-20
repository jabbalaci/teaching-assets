public class User implements Comparable<User>
{
    private String name;

    private int age;

    public int getAge() {
        return age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User other)
    {
        // negatív: this < other
        // 0: this == other
        // pozitív: this > other
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
