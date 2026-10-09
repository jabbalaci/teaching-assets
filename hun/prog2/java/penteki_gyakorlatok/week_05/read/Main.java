import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        String fname = "input.txt";
        List<String> sorok = FileUtils.readLines(fname);

        for (String sor : sorok) {
            System.out.println(sor);
        }
    }
}
