class Main
{
    public static void main(String[] args)
    {
        int szam = 9;
        if (paros_e(szam)) {
            System.out.println("páros");
        }
        else {
            System.out.println("páratlan");
        }
    }

    static boolean paros_e(int n)
    {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }
}
