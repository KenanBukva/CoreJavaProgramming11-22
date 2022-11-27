package ArrayExample;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class HugoDemo {
    public static void main(String[] args) {

        //**Korisnik unese broj u program, ukoliko je broj 5 iscita mu se poruke unio si peticu i zapoceo si igricu
        // ako nije unio 5 izbacuje mu se poruka da nije unio pogresan broj i ne moye zapoceti igricu. Svaki put kad
        // unese pogresan broj, program pamti pogrsne brojeve i izbacuje mu poruku koje pogresne brojeve je unio i da treba unijeti broj 5.
        //Zadatak treba rjrsiti sa nizom.
        int velicinaNiza=0;
        int[] pogresniBrojevi=new int[velicinaNiza];
        while(true){
            System.out.println("Unesi peticu i zapocni igricu!");
            int uneseniBroj=new Scanner(System.in).nextInt();
            if (uneseniBroj==5){
                System.out.println("Unio si peticu i zapoceo si igricu.");
                break;
            }else {
                velicinaNiza++;
                pogresniBrojevi= Arrays.copyOfRange(pogresniBrojevi,0,velicinaNiza);
                 pogresniBrojevi[velicinaNiza-1]=uneseniBroj;
                String porukaKorisniku ="Unio si pogresne brojeve:";
                for(int i =0;i<velicinaNiza;i++){
                    porukaKorisniku=porukaKorisniku+ pogresniBrojevi[i]+",";
                }
                System.out.println(porukaKorisniku+"a nigdje petice!");

            }
        }
    }
}
