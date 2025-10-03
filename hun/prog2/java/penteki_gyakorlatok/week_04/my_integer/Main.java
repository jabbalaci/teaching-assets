class MyInteger
{
    private int value;

    public final static int MAX_VALUE = 2_147_483_647;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public String toString()
    {
        return "" + this.value;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        MyInteger i = new MyInteger(5);

        System.out.println(i);

        System.out.println(MyInteger.MAX_VALUE);
    }
}
