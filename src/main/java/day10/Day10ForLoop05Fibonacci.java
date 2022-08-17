package day10;

import java.util.Scanner;

public class Day10ForLoop05Fibonacci {

    public static void main(String[] args) {

      /*
      Ask user how many fibonacci numbers he wants to see. Then type the code that prints
      these fibonacci numbers.
      Ex: if user enters 6 output will be 112358
       */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci numbers to see");

        int n= input.nextInt();

        int fibo1= 1;
        int fibo2=1;
        int fibonacci=0;
        System.out.print(fibo1 + " ");
        System.out.print(fibo2 + " ");

        for (int i=1; i<n-1; i++){ //we put here i<n-1 because the value starts with two 1s...whichever value is entered
                                    //value should be a number less than the printed one.
            fibonacci = fibo1+fibo2;  //the sum of two consecutive numbers is fibonacci number...to sum up two consecutive numbers by order.
            fibo1=fibo2;
            fibo2=fibonacci;
            System.out.print(fibonacci +" ");
        }







    }







}
