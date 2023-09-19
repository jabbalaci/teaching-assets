public class Main
{
    public static void main(String[] args)
    {
        double r = 2.7;

        double ker = kerulet(r);
        double ter = terulet(r);

        System.out.println("A kör kerülete: " + ker);
        System.out.printf("A kör területe: %.2f\n", ter);
    }

    static double terulet(double r)
    {
        return r * r * Math.PI;
    }

    static double kerulet(double r)
    {
        return 2 * r * Math.PI;
    }
}
