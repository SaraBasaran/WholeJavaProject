package day07;

import java.util.Scanner;

public class Day07Switch02 {

    public static void main(String[] args) {


        /*
        Ask user to enter day number then print day names starting with that number and the rest of the week days.
        ıf user gives you 5 for the day name then starting from (the first day as Sunday)
        User ==> 5 Output ==> Thursday(Fifth day) - Friday - Saturday - Sunday
        User ==> 3 Output ==> Tuesday (Third day) - Wednesday - Thursday- Friday - Saturday

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day number");
        int dayNum = input.nextInt();

        switch (dayNum){

            case 1:
                System.out.println("Sunday");//No need to use breaks here till the last part of the switch
                                             //As the coding will be based on the number and the answer that will
                                            // given to the user an integer value.

            case 2:
                System.out.println("Monday");//If we put break between the cases then once the system matches
                                             // the cases switch will take you out of system.

            case 3:
                System.out.println("Tuesday");

            case 4:
                System.out.println("Wednesday");

            case 5:
                System.out.println("Thursday");

            case 6:
                System.out.println("Friday");

            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Please enter a valid day number 1-7");

        }



    }
}
