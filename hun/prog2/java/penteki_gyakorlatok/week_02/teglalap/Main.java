class Teglalap
{
    public int aOldal;
    public int bOldal;

    public Teglalap(int a, int b)
    {
        this.aOldal = a;
        this.bOldal = b;
    }

    public int terulet()
    {
        return aOldal * bOldal;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Teglalap t1 = new Teglalap(3, 5);

        System.out.println(t1.terulet());

        // System.out.println(t1.kerulet());  // TODO
    }
}
