class Main
{
    public static void main(String[] args)
    {
        int x = 7;

        if (paros(x)) {
            System.out.println("páros");
        }
        else {
            System.out.println("páratlan");
        }

        a();
    }

    static void b() {
        System.out.println("hello from b()");
    }

    static void a() {
        b();
    }

    static boolean paros(int n)
    {
        if (n % 2 == 0) {
            return true;
        }
        // else
        return false;
    }
}
