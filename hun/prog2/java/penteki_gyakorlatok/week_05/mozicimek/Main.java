import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        String fname = "mozik.csv";
        List<String> sorok = FileUtils.readLines(fname);

        for (String sor : sorok)
        {
            // sor: az aktuális sor
            String[] darabok = sor.split(";");
            System.out.println(darabok[1]);
        }
    }
}
