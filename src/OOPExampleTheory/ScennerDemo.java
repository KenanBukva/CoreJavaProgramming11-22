package OOPExampleTheory;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ScennerDemo {
    public static void main(String[] args) {
        InputStream unos=System.in;
        Scanner mojskener=new Scanner(unos);
        int korisnickiUnos=mojskener.nextInt();
        System.out.println(korisnickiUnos);


        }
}