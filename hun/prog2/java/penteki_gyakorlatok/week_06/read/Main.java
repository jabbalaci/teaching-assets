import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        String fname = "text.txt";
        List<String> sorok = FileUtils.readLines(fname);

        // System.out.println(sorok);

        for (String sor : sorok) {
            System.out.println(sor);
        }
    }
}
