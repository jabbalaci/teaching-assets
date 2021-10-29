package com.example;

public class Main
{
    public static void main(String[] args)
    {
        Szakacs szakacs = new Szakacs();
//        szakacs.keszitLeves();
//        szakacs.keszitPorkolt();
        szakacs.keszitSpecialitas();

        MagyarSzakacs magyarSzakacs = new MagyarSzakacs();
        magyarSzakacs.keszitSpecialitas();
    }
}
