package BreakAndContiniue;


import java.util.Scanner;

//Pustiti korisnika aplikacije ili programa da  unese slovo.
//Nakon toga provjeriti dali se slovo sadrzi u recenici.Ukuliko je slovo sadrzano u recenici ispisati
// koliko puta se ponavlja slovo u recenici.
public class ContinueDemo {
    public static void main(String[] args) {
        String recenica="Petar Pan je pojeo crvenu papriku.";
        System.out.println("Unesi tacno jedno slovo:");
        char unesenoSlovo = new Scanner(System.in).nextLine().charAt(0);
        char[] nizSlovaRecenice=  recenica.toCharArray();
        int  brojPonavljanja=0;
       for(int i=0;i< nizSlovaRecenice.length;i++){
          char tempSlovo=nizSlovaRecenice[i];
         if(tempSlovo!=unesenoSlovo){

             continue;

         }
           brojPonavljanja++;

    }
        if(brojPonavljanja!=0){
        System.out.println("uneseno slovo: "+unesenoSlovo+" se ponavlja "+brojPonavljanja+" puta u recenici.");
}else {
            System.out.println("Uneseno slovo "+unesenoSlovo+" se ne pojavljuje nigdje u recenici!");
        }
        }
}
