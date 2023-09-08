import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Verem
{
    private List<Integer> data;

    public Verem() {
        this.data = new ArrayList<>();
    }

    public void betesz(int value) {
        this.data.add(value);
    }

    public int meret() {
        return this.data.size();
    }

    public boolean ures() {
        return this.meret() == 0;
    }

    @Override
    public String toString() {
        return "Verem(" + this.data.toString().replace("]", "") + ")";
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Verem v = new Verem();
        System.out.println(v.ures());
        v.betesz(1);
        v.betesz(4);
        v.betesz(5);
        System.out.println(v);
        System.out.println(v.meret());
        System.out.println(v.ures());
    }
}
