import java.util.ArrayList;
import java.util.List;

public class PyUtils
{
    private PyUtils() {
        // nem példányosítható
    }

    public static List<Integer> range(int start, int end, int step)
    {
        List<Integer> result = new ArrayList<Integer>();

        for (int i = start; i < end; i += step) {
            result.add(i);
        }

        return result;
    }

    public static List<Integer> range(int start, int end)
    {
        return range(start, end, 1);
    }

    public static List<Integer> range(int end)
    {
        return range(0, end, 1);
    }
}
