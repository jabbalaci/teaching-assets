class Teglalap
{
    private int a;
    private int b;

    public Teglalap(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public int kerulet() {
        return 2 * (a + b);
    }

    public int terulet() {
        return a * b;
    }

    @Override
    public String toString()
    {
        return String.format("Teglalap(a: %d, b: %d)", a, b);
    }
}
