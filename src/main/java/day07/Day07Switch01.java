package day07;

import java.util.Scanner;

public class Day07Switch01 {


    public static void main(String[] args) {
        //Ask user to enter the month name then print the month number.
        //1. way
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any month name");

        String month = input.next();//there is difference between next() and nextLine() methods.
        //**next() takes the character till the first space but for the nextLine() will take all the line given by the user
        if(month.equalsIgnoreCase("January")){

            System.out.println(1);

        } else if (month.equalsIgnoreCase("February")) {
            System.out.println(2);


        } else if (month.equalsIgnoreCase("March")) {
            System.out.println(3);

        } else if (month.equalsIgnoreCase("April")) {
            System.out.println(4);

        }else if (month.equalsIgnoreCase("May")){
            System.out.println(5);
        }else if (month.equalsIgnoreCase("June")){

            System.out.println(6);
        }else if (month.equalsIgnoreCase("July")){
            System.out.println(7);

        } else if (month.equalsIgnoreCase("August")) {
            System.out.println(8);
        }else if (month.equalsIgnoreCase("September")){
            System.out.println(9);
        }else if (month.equalsIgnoreCase("October")){
            System.out.println(10);

        }else if (month.equalsIgnoreCase("November")){
            System.out.println(11);
        }else if (month.equalsIgnoreCase("December")){
            System.out.println(12);
        }else{
            System.out.println("Please enter a valid month name");
        }

        //2. way//using if and elses for the coding in the first way but we can use switch method to do the task

        System.out.println("Enter any month name");

        switch(month.toLowerCase()){

            case "january":
                System.out.println(1);
                break;  //break means stop execusion...
            case "february":
                System.out.println(2);
                break;
            case "march":
                System.out.println(3);
                break;
            case "april":
                System.out.println(4);
                break;
            case "may":
                System.out.println(5);
            case "june":
                System.out.println(6);
                break;
            case "july":
                System.out.println(7);
            case "august":
                System.out.println(8);
                break;
            case "september":
                System.out.println(9);
            case "october":
                System.out.println(10);
                break;
            case "november":
                System.out.println(11);
                break;
            case "december":
                System.out.println(12);
                break;
            default:
                System.out.println("Enter a valid month name");

        }



    }







}
