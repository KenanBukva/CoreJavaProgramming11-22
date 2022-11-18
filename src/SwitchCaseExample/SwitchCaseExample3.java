package SwitchCaseExample;

import java.sql.SQLOutput;
import java.util.Scanner;

//** Program give a response to the number of days for entered the month of the year.
public class SwitchCaseExample3 {
    public static void main(String[] args) {
        System.out.println("Insert year");
        int year = new Scanner(System.in).nextInt();
        System.out.println("Insert mount");
        int month = new Scanner(System.in).nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            case 2:
                if ((year%4==0)&&(year%100!=0)||(year%400==0)) {
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }
            default:
                System.out.println("Wrong number of the month!");

        }
    }
}