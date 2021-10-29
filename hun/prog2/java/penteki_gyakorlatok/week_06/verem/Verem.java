import java.util.List;
import java.util.ArrayList;

public class Verem
{
    private List<Integer> elems;

    public Verem() {
        elems = new ArrayList<Integer>();
    }

    public void push(int value) {
        elems.add(value);
    }

    public int pop() {
        return elems.remove(elems.size() - 1);
    }

    @Override
    public String toString()
    {
        return elems.toString().replace("]", "");
    }
}
