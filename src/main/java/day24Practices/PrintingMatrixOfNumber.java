package day24Practices;

import java.util.Scanner;

public class PrintingMatrixOfNumber {

    /*
    Ask user to enter a number and print on console number by number matrix.
    Example:
    Input: 10
    Output:
    1 0 0 1 1 0 0 0 1 1
    0 0 1 0 1 0 1 0 0 0
    0 1 0 1 0 0 0 0 0 1
    1 1 1 0 0 0 0 1 1 1
    1 1 0 1 1 1 0 1 0 0
    1 0 0 0 1 1 0 0 0 0
    0 0 1 0 0 0 0 1 1 1
    1 1 0 1 0 1 0 0 1 0
    0 0 1 0 0 0 0 1 1 0
    1 1 1 0 0 1 1 1 1 0
*/
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer");
        int num= input.nextInt();

        //we are controlling random printing with nested loop.

        for (int i=0; i<num; i++){ //row control
            for(int j=0; j<num; j++){ //column control
                System.out.print((int)(Math.random()*2) +" "); //Math.random() will give us decimal numbers upto given number
                                                              // we typed here (int) to remove decimal part
                                                              //we multiply by 2 to see integer values
            }
            System.out.println();
        }





    }



}
