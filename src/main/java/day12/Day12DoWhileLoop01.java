package day12;

import java.util.Scanner;

public class Day12DoWhileLoop01 {
    public static void main(String[] args) {

        /*
        Ask user to enter an integer.
        If the integer is less than 100, tell user "Won!".
        Otherwise, tell user "Lost!".
        This coding is very good for games.

         */

        Scanner input = new Scanner(System.in);
        //1.way
        int i;

        //Whenever the value is less than 100 we will ask again and again if we get less than 100 the system will stop.
        do {
            System.out.println("Enter an integer");//as there is no comdition sout always will be printed first
            // we put sout here to let the system repeat the same action.
            i = input.nextInt();                     //here user enters a number
            if (i < 100) {                              //java checks the logic
                //if condition is ok for java it prints "won".
                System.out.println("Won!");
            }

            //after showing "won", do while loop makes the code looping and start again and again...
        } while (i < 100);      //as long as the condition is valid for java while loop will start the process again and again.
        System.out.println("Lost!");//==>if the user enters a number equals to or more 100 then the java shows"lost" and stops the system.

        //2.way==>as long as the condition is true, it will give infinite result.
        int k = 0;

         do{
             System.out.println("Enter an integer");
             k =input.nextInt();
             if(k>99){
                 System.out.println("Lost");
                 break;
             }

             System.out.println("Won!");
         }while(true); //==>as long as the cond. is valid java will start the system again and again

               //The benefit of that code in "while"part there is just one condition check










    }









}

