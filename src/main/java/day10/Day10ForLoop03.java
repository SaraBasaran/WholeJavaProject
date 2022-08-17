package day10;

import java.util.Scanner;

public class Day10ForLoop03 {

    public static void main(String[] args) {

        //Type code to print unique character in a String.
        //Alabama==>Albm are unique chars.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string to see unique characters");
        String uniques = input.nextLine();

        for ( int i=0; i<uniques.length(); i++){
            char c = uniques.charAt(i);
            if (uniques.indexOf(c) == uniques.lastIndexOf(c)){  //another task==> to see repeated chars. you should put != sign
                System.out.println(c);
            }
        }
        //Type code to print the following image on the console
        /*
                X X X X X
                X X X X X         ======>We will use for-loop for here...
                X X X X X         ==> If you need for-loop for very step you need to use loop inside the loop==>nested loop.
         */
        System.out.println("Enter the number of columns and rows");

        int columns = input.nextInt();
        int row = input.nextInt();

         for (int i=1; i<=row; i++ ){

         String s = ""; //==>//**I will create first X and second X and this is a new data ı will put Xes here ...

            for ( int k=1; k<=columns; k++) {

                s = s + "X ";
            }
            System.out.println(s);



        }

    }


}
