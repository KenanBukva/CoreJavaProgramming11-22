package BreakAndContiniue;

import java.util.Random;
import java.util.Scanner;

public class BingoGameDemo {
    public static void main(String[] args) {
        //**Postavke zadatka:
        // Pustimo korisnika da unese niz brojeva, onda ga uporedimo te brojeve sa nizom tacnih brojeva koje program generise svaki put,
        //ako je jedan od unesenih brojeva jednak jednom od tacnih brojeva ispisujemo mu poruku da je pogodio i da je dobio nagradu.
        //ako korisnik nije pogodio broj mi mu ponovo omogucavamo da unese nove brojeve a nagradu umanjujemo za 33%.
        //Nakon 3 pogresa unosa, igrica se zavrsava jer je nagradni fond manji od nule.

        int[] sretniBrojevi=new int[8];
        int nagradniFond=10000;
        int stepenUmanjenja=3334;
        int[] uneseniBrojevi=new int[5];
        Random generisiSretneBrojeve=new Random();
        Omega:
        while(nagradniFond>0){
            for(int n=0; n<sretniBrojevi.length; n++){
                int slucajanRandomBroj=generisiSretneBrojeve.nextInt(1000);
                sretniBrojevi[n]=slucajanRandomBroj;
            }
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
