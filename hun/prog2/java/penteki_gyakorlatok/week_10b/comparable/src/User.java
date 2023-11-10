public class User implements Comparable<User>
{
    private String name;

    public User(String name) {
        this.name = name;
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
                '}';
    }
}
