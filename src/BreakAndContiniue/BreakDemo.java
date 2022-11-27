package BreakAndContiniue;

import java.util.Scanner;

public class BreakDemo {
    public static void main(String[] args) {
    //**Postavke zadatka:
        // Pustimo korisnika da unese neki broj, onda ga uporedimo sa nizom tacnih brojeva koje mi cuvamo u jednom nizu,
        //ako je uneseni broj jednak jednom od tacnih brojeva ispisujemo mu poruku da je pogodio i da je dobio nagradu.
        //ako korisnik nije pogodio broj mi mu ponovo omogucavamo da unese novi broj a nagradu umanjujemo za 10%.
        //Nakon 10 pogresnih unosa, igrica se zavrsava.

        int[] sretniBrojevi={22,57,63,96,1,970,543,92,444,90};
        int nagradniFond=10000;
        int stepenUmanjenja=1000;
        Omega:
            while(nagradniFond>0){
                    System.out.println("Unesite sretni broj");
                    int uneseniBroj=new Scanner(System.in).nextInt();
                    for (int i =0; i<sretniBrojevi.length;i++) {
                        if (sretniBrojevi[i]==uneseniBroj) {
                            System.out.println("Unijeli ste tacan broj: " + uneseniBroj + ",cestitamo! dobili ste nagradu u iznosu"+nagradniFond+"$.");
                            break Omega;
                        }
                        }
                System.out.println("Unijeli ste pogresan broj, probajte ponovo!");
                    nagradniFond=nagradniFond-stepenUmanjenja;
                    }

                }

    }

