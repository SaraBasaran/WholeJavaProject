package day05;

import java.util.Scanner;

public class Day05IfStatement {

    public static void main(String[] args) {

/*
        If your score is less than 50 then you will fail
            If (condition){
            <The code to be executed if the condition is true>
             }
             The condition part is "if your score is less than 50,
             the action part is "you will fail.
             if condition statement is true the code will be active the action will be executed
             if the condition statement is false the code will not be executed.
 */
        //inside the parenthesis we type condition inside the curly braces we type action
        //if the condition is not valid then there will be no action
        //Note: We use "if statement" to decide which code will be executed under which condition
        if (3>4){
            System.out.println("It is true");
        }
        //Type the code to check if the integer given by the user is divided by 3 or not

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = input.nextInt();

        if (n%3==0){
            System.out.println("The number is divided by 3");
        }

        if (n%3!=0){
            System.out.println("The number is not divided by 3");
        }

        //Type codes to check if the first digit of a 3 digits integer is less than 5.
        //If it is less than 5 print "perfect number" other wise print "good number".

        input = new Scanner(System.in);
        System.out.println("Enter an integer to compare");
        int no = input.nextInt();
        if (no/100<5){
            System.out.println("Perfect Number!");
        }
        if (no/100>=5){
            System.out.println("Good Number");
        }
         //Ask user to enter the initial of the day names and print on the console.

        System.out.println("Enter the initial of a day name");
        String s = input.next();


        if(s.equals("S")){
            System.out.println("Saturday and Sunday");
        }
        if (s.equals("T")){
            System.out.println("Tuesday and Thursday");
        }
        if (s.equals("W")){
            System.out.println("Wednesday");
        }
        if (s.equals("F")){
            System.out.println("Friday");
        }
        if (s.equals("M")){
            System.out.println("Monday");
        }







    }






}
