package OOP_Example;

import java.util.Arrays;

public class Programer extends Zaposleni {
    String[] programskiJezici;

    public Programer(String imePrezime, String adresa, String brojTelefona, int radnoVrijeme, String[] programskiJezici) {
        super(imePrezime, adresa, brojTelefona, radnoVrijeme);
        this.programskiJezici = programskiJezici;
    }

    public void setProgramskiJezici(String[] programskiJezici) {
        this.programskiJezici = programskiJezici;
    }

    public String[] getProgramskiJezici() {
        return programskiJezici;
    }
    @Override
    public void posao (){
        System.out.println("JA sam programer i moj posao je razvoj aplikacija");
    }
    @Override
    public String toString(){
        String ispis =super.toString()+" "+ Arrays.toString(programskiJezici);
        return ispis;
    }
}

