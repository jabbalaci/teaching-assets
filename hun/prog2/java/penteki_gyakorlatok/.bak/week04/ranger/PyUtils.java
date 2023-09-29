import java.util.ArrayList;
import java.util.List;

public class PyUtils
{
    private PyUtils() {
        // üres
    }

    public static List<Integer> range(int hi)
    {
        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < hi; ++i) {
            result.add(i);
        }

        return result;
    }
}
