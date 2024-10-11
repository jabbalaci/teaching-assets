public class Main
{
    public static void main(String[] args)
    {
        if (args.length != 1) {
            System.out.println("Hello! Egy darab argumentum kell!");
            System.exit(1);
        }
        // else
        String s = args[0];
        String result = StringUtils.swapCase(s);
        System.out.println(result);
    }
}
