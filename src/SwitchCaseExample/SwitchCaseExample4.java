package SwitchCaseExample;

import java.util.Scanner;

public class SwitchCaseExample4 {
    public static void main(String[] args) {
        //** Example for Switch Case Brake function
        // Example: Program write number day of week
        System.out.println("Insert the day of the week");
        String  dayOfWeek = new Scanner(System.in).nextLine();
        int numberOfDayInWeek;
        numberOfDayInWeek = switch(dayOfWeek){
            case "Monday" ->{yield 1;}
            case "Tuesday"->{yield 2;}
            case "Wednesday"->{yield 3;}
            case "Thursday"->{yield 4;}
            case "Friday"->{yield 5;}
            case "Saturday"->{yield 6;}
            case "Sunday"->{yield 7;}
            default ->{yield -1;}
        };
        System.out.println("This is the " + numberOfDayInWeek +" day of the week.");
    }

}
