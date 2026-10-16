class Szakacs
{
    public void keszitLeves() {
        System.out.println("leves keszitese");
    }

    public void keszitFoetel() {
        System.out.println("foetel keszitese");
    }

    public void keszitSpecialitas() {
        System.out.println("vadas marha keszitese");
    }
}

class MagyarSzakacs extends Szakacs
{
    public void keszitPorkolt() {
        System.out.println("porkolt keszitese");
    }

    @Override
    public void keszitSpecialitas() {
        System.out.println("hortobagyi husos palacsinta keszitese");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Szakacs szakacs = new Szakacs();
        szakacs.keszitSpecialitas();

        System.out.println("---");

        MagyarSzakacs magyar = new MagyarSzakacs();
        // magyar.keszitLeves();
        // magyar.keszitFoetel();
        // magyar.keszitPorkolt();
        magyar.keszitSpecialitas();
    }
}
