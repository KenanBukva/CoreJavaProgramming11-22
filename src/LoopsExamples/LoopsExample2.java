package LoopsExamples;


import java.util.Scanner;

/**Example infinite loop with stopping.
* User programs insert a number that is different from the number 5
*and the program is memorized the wrong entries and and warns with message not to enter number 5.
 */
public class LoopsExample2 {
    public static void main(String[] args) {
        int counter=1;
        int[] wrongNumbers= new int[1000];
      while (true) {
          System.out.println("Insert number 5 and start the game!");
        int insertNumber = new Scanner(System.in).nextInt();
        if (insertNumber == 5) {
            System.out.println("You entered number 5 and you started the game!");
        break;
        }
        else {
            wrongNumbers[counter - 1] = insertNumber;
            System.out.println("You entered the wrong numbers:");
            for (int i = 0; i < counter; i++) {
                System.out.println(wrongNumbers[i] + ",");
            }
            System.out.println("and enter number 5 and start the game.");
            counter++;
            if (counter>1000){
                counter=1;
            }
        }
    }
    }

}
