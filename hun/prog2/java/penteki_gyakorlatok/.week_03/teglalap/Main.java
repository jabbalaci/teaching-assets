public class Main
{
    public static void main(String[] args)
    {
        Teglalap t1 = new Teglalap(10, 5);

        // System.out.println("t1 kerület: " + t1.kerulet());
        // System.out.println("t1 terület: " + t1.terulet());

        // Teglalap(a: ..., b: ...)
        System.out.println(t1);

        Teglalap t2 = new Teglalap(2 * t1.getA(),
                                   2 * t1.getB());

        // System.out.println("t2 kerület: " + t2.kerulet());
        // System.out.println("t2 terület: " + t2.terulet());

        System.out.println(t2);
    }
}
