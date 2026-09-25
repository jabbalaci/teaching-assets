public class MyUtils
{
    public final static double PI = 3.14159;

    private MyUtils() {
        // nem példányosítható
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int duplaz(int n) {
        return 2 * n;
    }

    public static int strlen(String s) {
        return s.length();
    }
}
