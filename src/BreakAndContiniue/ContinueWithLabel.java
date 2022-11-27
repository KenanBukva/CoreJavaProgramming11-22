package BreakAndContiniue;

import java.util.Scanner;

// Parametri zadatka:
//Recenica je fiksno odredjena u programu i nju ne unosi korsinik.
// Korisnik unosi rijec- niz char sekvenci.
//Postavka zadatka:Program provjerava karakter po karakter dali se unesena rijec sadryi u recenici.
//Ideja je da recenicu i rijec konvertujemo u niz karaktera i da dalje radimo sa nizovima.
public class ContinueWithLabel {
    public static void main(String[] args) {
String recenica="Uskoro cete dobiti novu zadacu u kojoj cete provjeriti dali je unesena rijec palindrom";
char[]nizSlovoRecenice=recenica.toCharArray();
        System.out.println("Unesite jednu rijec!");
String rijec=new Scanner(System.in).nextLine();
char[] nizSlovaRijeci=rijec.toCharArray();
        boolean postojiRijec=false;
        int brojPonavljanja=0;
DeltaLabel:
for(int i=0;i<nizSlovoRecenice.length-(nizSlovaRijeci.length-1);i++){
    char tempRecenica=nizSlovoRecenice[i];
    if(tempRecenica!=nizSlovaRijeci[0]){
        continue DeltaLabel;
    }else{
        for (int k=1;k<nizSlovaRijeci.length;k++){
            char tempRijec=nizSlovaRijeci[k];
            if(nizSlovoRecenice[i+k]!=nizSlovaRijeci[k]){
                continue DeltaLabel;}
        }

                postojiRijec=true;
                brojPonavljanja++;
                continue DeltaLabel;

        }
     }
    if (postojiRijec==true){
            System.out.println("Postoji unesena rijec '"+rijec+"' i ponavlja se "+brojPonavljanja+" puta u recenici.");
        }else {
            System.out.println("Unesena rijec '"+rijec+"' ne postoji u recenici.");
        }
    }
}


