class Main
{
    public static void main(String[] args)
    {
        int[] tomb1 = new int[3];
        tomb1[0] = 1;
        tomb1[1] = 2;
        tomb1[2] = 3;

        int[] tomb2 = tomb1;
        tomb2[0] = 100;

        for (int i = 0; i < tomb1.length; ++i)
        {
            System.out.println(tomb1[i]);
        }
    }
}
