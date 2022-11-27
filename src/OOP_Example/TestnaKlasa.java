package OOP_Example;

public class TestnaKlasa {
    public static void main(String[] args) {
        Programer keno=new Programer("Kenan Bukva","Ranovacka 51","061364919", 8,new String[] {"Java","HTML","CSS"});
        System.out.println(keno.toString());
        keno.posao();

        Menadzer Refko= new Menadzer("Refko Refkic","nepoznata","0000",4,16);
        System.out.println(Refko.toString());
        Refko.posao();
    }

}
