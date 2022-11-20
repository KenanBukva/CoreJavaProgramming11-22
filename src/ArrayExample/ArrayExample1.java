package ArrayExample;

import java.util.Arrays;

public class ArrayExample1 {
    public static void main(String[] args) {
// Example of entering a two-dimensional Array
// two dimensional Array-for insert fullnames 30 students.
       String[][] fullNames = new String[30][2];
       fullNames[0][0] = "Ivica";
       fullNames[0][1] = "Stanic";

       fullNames[2][0]="Anja";
       fullNames[2][1]="Tesanovic";

       fullNames[5][0]="Omer";
       fullNames[5][1]="Mrguda";

       // ....
        fullNames[24][0]="Kenan";
        fullNames[24][1]="Bukva";
        System.out.println(fullNames[24][0]);


        //Copy a range of array to another array
        char[] sourceArray ={ 'l','d', 'C', 'a', 'f', 'f', 'e', 't','i', 'n', 'f', 'u', 'q'};
        char[] destinationArray = Arrays.copyOfRange(sourceArray, 2,10);
        System.out.println(destinationArray);
    }
}
