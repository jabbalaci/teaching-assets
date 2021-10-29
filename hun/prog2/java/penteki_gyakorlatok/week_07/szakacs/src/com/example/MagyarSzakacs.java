package com.example;

public class MagyarSzakacs extends Szakacs
{
    public void keszitPorkolt() {
        System.out.println("pörkölt készítése");
    }

    @Override
    public void keszitSpecialitas() {
        System.out.println("hortobágyi húsos palacsinta készítése");
    }
}
