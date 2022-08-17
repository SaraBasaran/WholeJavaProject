package day10;

import java.util.Scanner;

public class Day10ForLoopRewiev {
    public static void main(String[] args) {

        //Type codes to print a monthly calendar for 4 weeks and 7 days.

        int weeks = 4;
        int days = 7;

        for (int i = 1; i <= weeks; i++) {
            System.out.println("Week: " + i);
            for (int k = 1; k <= days; k++) {
                System.out.println("Day: " + k);
            }
        }
       /*Review part

        int weeks2=4;
        int days2= 7;
        for (int i=1; i<=weeks2; i++){

            System.out.println("Week: " + i);

            for (int k=1; k<=days2; k++){
                System.out.println("Day: " + k);
            }

        }

        /*Type code to print the following image on the console.

        X X X X X
        X X X X X
        X X X X X
        X X X X X
        X X X X X

        */

        System.out.println("Enter the number of columns and rows");
        Scanner input = new Scanner(System.in);
        int col = input.nextInt();
        int row = input.nextInt();
        for (int i = 1; i <= row; i++) {

            String s = "";
            for (int k = 1; k <= col; k++) {
                s = s + "X ";


            }
            System.out.println(s);
        }
        //Type code to find the sum of integers from 10 to 14..
        int sum =0;  //If we make sum = 5 ,then the result will be added 5 to the result.so we should always put 0 value to the sum container...

        for (int i=10; i<15; i++){
            sum = sum +i;
        }
        System.out.println(sum);//If you put sout in loop body part you will see the sum value for each value
        //10
        //21
        //33
        //46
        //****If you want to see the final value of total sum you should put after loop part.



    }








}
