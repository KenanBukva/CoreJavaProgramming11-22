package IfFlowControl;

import java.util.Scanner;

//* The professor should grade students based on the points conquered on the exam.
public class IfFlowControl_Exemple2{
    public static void main(String[] args) {
        System.out.println("Insert number of points:");
        int numberPoints = new Scanner(System.in).nextInt();
        char rating;
        if(numberPoints>=90){
            rating = 'A';
        } else if (numberPoints>=80) {
            rating = 'B';
        } else if (numberPoints>74) {
            rating = 'C';
        } else if (numberPoints>65) {
            rating = 'D';
        }else {
            rating = 'E';
        }
        System.out.println("Your rating is "+ rating);
    }
}

