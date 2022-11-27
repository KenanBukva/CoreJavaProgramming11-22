package OOP_Example;

import java.util.Arrays;

public class Menadzer extends Zaposleni{
    private int clanoviTima;
    public Menadzer (String imePrezime, String adresa, String brojTelefona, int radnoVrijeme, int clanoviTima ){
        super(imePrezime,adresa,brojTelefona,radnoVrijeme);
        this.clanoviTima=clanoviTima;
    }
    @Override
    public String toString() {
        String ispis = super.toString()+"/nClanovi tima: " + clanoviTima;
        return ispis;
    }

    @Override
    public void posao (){
        System.out.println("Ja sam menadzer i imam"+ clanoviTima+"clana tima");
    }

    public int getClanoviTima() {
        return clanoviTima;
    }

    public void setClanoviTima(int clanoviTima) {
        this.clanoviTima = clanoviTima;
    }
}
