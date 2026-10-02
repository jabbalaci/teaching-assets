public class Hello
{
    public static void main(String[] args)
    {
        Hello h = new Hello();
        h.start();
    }

    public void start()
    {
        System.out.println(duplaz(6));
    }

    public int duplaz(int n) {
        return 2 * n;
    }
}
