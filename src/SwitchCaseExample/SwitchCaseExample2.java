package SwitchCaseExample;

import java.util.Scanner;

public class SwitchCaseExample2 {

    //The program asks the user to enter the number of days a week.
    // When the user enters the ordinal number of days a week, program prints the remaining days of the week.
    // Switch Case without Brake function.
    public static void main(String[] args) {
        System.out.println("Insert the ordinal number of day of the week");
        int numberOfDay = new Scanner(System.in).nextInt();
        String daysOfWeek = " ";
        switch (numberOfDay) {
            case 1:
                daysOfWeek = "Monday,";

            case 2:
               daysOfWeek = daysOfWeek + "Tuesday,";

            case 3:
                daysOfWeek = daysOfWeek +  "Wednesday,";

            case 4:
                daysOfWeek = daysOfWeek +  "Thursday,";

            case 5:
                daysOfWeek = daysOfWeek + "Friday,";

            case 6:
                daysOfWeek = daysOfWeek +  "Saturday,";

            case 7:
                daysOfWeek = daysOfWeek + "Sunday.";
                System.out.println(daysOfWeek);
                break;
            default:
                System.out.println("You entered the wrong number of day ");
        }
    }
}

