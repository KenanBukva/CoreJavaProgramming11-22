package IfFlowControl;
import java.util.Scanner;
public class IfFlowControlExample {

    public static void main(String[] args) {
        System.out.println("Insert number of year");
        int ageUser = new Scanner(System.in).nextInt();
        if (ageUser>=18){
                System.out.println("You are adult!");
            }else {
                System.out.println("You are not adult!");
            }

        }
}