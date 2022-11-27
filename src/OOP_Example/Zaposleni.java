package OOP_Example;

public class Zaposleni {
    private String imePrezime;
    private String adresa;
    private String brojTelefona;
    private int radnoVrijeme;

    public Zaposleni (String imePrezime, String adresa, String brojTelefona, int radnoVrijeme ) {
        this.imePrezime= imePrezime;
        this.adresa=adresa;
        this.brojTelefona=brojTelefona;
        this.radnoVrijeme=radnoVrijeme;
    }
public void posao(){
    System.out.println("Zaposleni obavlja neku vrstu posla!");
}
    public void setIme(String ime) {
        this.imePrezime = imePrezime;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public void setRadnoVrijeme(int radnoVrijeme) {
        this.radnoVrijeme = radnoVrijeme;
    }
    public String getImePrezime(){
        return imePrezime;
}

    public String getAdresa() {
        return adresa;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public int getRadnoVrijeme() {
        return radnoVrijeme;
    }
@Override
    public String toString(){
        String ispis = "ime i prezime:" + imePrezime + "Adresa:" + adresa+ "Broj telefona:" +brojTelefona+"Radno vrijeme:"+radnoVrijeme;
        return ispis;
        }
     }
