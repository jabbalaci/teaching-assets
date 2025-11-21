public class TestMain
{
    public static void main(String[] args)
    {
        test_product();
    }

    private static void test_product()
    {
        assert Main.product() == 1;
        assert Main.product(2) == 2;
        assert Main.product(2, 3) == 6;
        assert Main.product(2, 3, 0) == 0;
        assert Main.product(2, 3, 10) == 60;
        assert Main.product(2, -3, 10) == -60;

        System.out.println("OK");
    }
}
