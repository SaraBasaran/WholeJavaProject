package practise09;

import java.util.Scanner;

public class Q01PrintingTheNumsOrLettersInBetween {

    // Ask user to enter 2 chars and print the chars between them on console

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter first character");
        char ch1= input.next().charAt(0);

        System.out.println("Enter second character");
        char ch2= input.next().charAt(0);

        //if the user gives us "d" ==> ASCII value will be defined and we need to put +1 to the given value

        int first=Math.min(ch1, ch2);//by this way java will take the min value first and then give result
        int second=Math.max(ch1, ch2);

        System.out.println( "The characters between " + (char) first + " and "+ (char) second);
        for (int i=first+1; i<second; i++){
            System.out.print((char) i +" "); //i will be right after the first one.

        }
          //int num= 'a';

    }







}
