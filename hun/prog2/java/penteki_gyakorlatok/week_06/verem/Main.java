public class Main
{
    public static void main(String[] args)
    {
        Verem v = new Verem();

        v.push(1);
        v.push(3);
        v.push(8);

        int x = v.pop();

        System.out.println(x);
        System.out.println(v);
    }
}
