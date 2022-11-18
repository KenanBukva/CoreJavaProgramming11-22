package SwitchCaseExample;

import java.util.Scanner;

public class SwitchCaseExample1 {
    public static void main(String[] args) {
        //** Example for Switch Case Brake function
        // Example: Program write day of week
        System.out.println("Insert the ordinal number of day of the week");
        int numberOfDay = new Scanner(System.in).nextInt();
       switch(numberOfDay){
           case 1 :
               System.out.println("Monday");
               break;
           case 2 :
               System.out.println("Tuesday");
               break;
           case 3 :
               System.out.println("Wednesday");
               break;
           case 4 :
               System.out.println("Thursday");
               break;
           case 5 :
               System.out.println("Friday");
               break;
           case 6 :
               System.out.println("Saturday");
               break;
           case 7 :
               System.out.println("Sunday");
               break;
           default:
               System.out.println("You entered the wrong number of day ");

       }
    }
}
