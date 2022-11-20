package LoopsExamples;


import java.util.ArrayList;
import java.util.Scanner;

public class LoopsExample4 {
    public static void main(String[] args) {
        ArrayList wrongNumbers = new ArrayList<>();

        while (true) {
            System.out.println("Insert number 5 and start the game!");
            int insertNumber = new Scanner(System.in).nextInt();
            if (insertNumber == 5) {
                System.out.println("You entered number 5 and you started the game!");
                break;
            }
            else {
                wrongNumbers.add(insertNumber);
                System.out.println("You entered the wrong numbers:"+ wrongNumbers + ",and enter number 5 and start the game.");
            }
        }
    }
}

