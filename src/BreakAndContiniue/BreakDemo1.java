package BreakAndContiniue;

import java.util.Scanner;

public class BreakDemo1 {
    public static void main(String[] args) {
        //**Postavke zadatka:
        // Pustimo korisnika da unese neki broj, onda ga uporedimo sa nizom tacnih brojeva koje mi cuvamo u jednom nizu,
        //ako je uneseni broj jednak jednom od tacnih brojeva ispisujemo mu poruku da je pogodio i da je dobio nagradu.
        //ako korisnik nije pogodio broj mi mu ponovo omogucavamo da unese novi broj a nagradu umanjujemo za 30%.
        //Nakon 10 pogresnih unosa, igrica se zavrsava.

        int[] sretniBrojevi={22,57,63,96,1,970,543,92,444,90};
        int nagradniFond=10000;
        int stepenUmanjenja=3334;
        int[] uneseniBrojevi=new int[5];
        Omega:
        while(nagradniFond>0){
            for(int i=0;i<uneseniBrojevi.length;i++){
               int count=i+1;
                    System.out.println("Unesite "+ count+ ". broj:");
                    uneseniBrojevi[i]=new Scanner(System.in).nextInt();
            }
            for (int k=0;k<uneseniBrojevi.length;k++){
                int temp=uneseniBrojevi[k];
                for (int j=0;j<sretniBrojevi.length;j++){
                  if (sretniBrojevi[j]==temp){
                    System.out.println("Unijeli ste tacan broj: " + temp + ",cestitamo! dobili ste nagradu u iznosu "+nagradniFond+" $.");
                    break Omega;
                }
        }
    }System.out.println("Unijeli ste pogresane brojeve, probajte ponovo!");
            nagradniFond=nagradniFond-stepenUmanjenja;
            continue Omega;
}
}
}