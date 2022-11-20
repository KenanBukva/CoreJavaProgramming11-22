package LoopsExamples;

import java.util.Scanner;

public class LoopsExample3 {
    /**
     * Example infinite loop with stopping.
     * User programs insert a number that is different from the number 5,
     * and the program is memorized the wrong entries and and warns with message not to enter number 5.
     */

    public static void main(String[] args) {
        String wrongNumbers = " ";
        while (true) {
            System.out.println("Insert number 5 and start the game!");
            int insertNumber = new Scanner(System.in).nextInt();

            if (insertNumber == 5) {
                System.out.println("You entered number 5 and you started the game!");
                break;
            } else {
                wrongNumbers = insertNumber+", " + wrongNumbers;
                System.out.println("You entered the wrong numbers: " + wrongNumbers + "and enter number 5 and start the game.");
            }
        }
    }
}

