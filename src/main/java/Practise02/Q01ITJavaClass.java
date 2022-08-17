package Practise02;

import java.util.Scanner;

public class Q01ITJavaClass {


    public static void main(String[] args) {

        //fibbinacia number = 1 1 2 3 5 8
        //sayı kendinden bir sonraki sayı ile toplanıp devam ediliyor
        //1 , 1 1+1 = 2
        //1, 1 , 2= 1+2=3 ve 2 3 = 5 gibi

//        int n1 = 1;
//        int n2= 1;
//        int n3= 0;

        /*Use switch statement to print
        a) "Winter" for December, January, February
        b) "Spring" for March, April, May
        c) "Summer" for June, July, August
        d) "Fall" for September, October, November
        e) "Invalid month name" for all the others

         */
        /*String monthName = "June";
        monthName = monthName.toLowerCase();
        switch(monthName){
            case "december":
            case "january":
            case "february":
                System.out.println("Winter");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("Spring");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("Summer");
                break;
            case "september":
            case "november":
            case "october":
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid month name");
                break;
        }

         */
               Scanner input = new Scanner(System.in);
        System.out.println("Enter a month name to check the season");
                  String monthName= input.next();
             monthName=monthName.toLowerCase();
             switch (monthName){
                 case "december":
                 case"january":
                 case"february":
                     System.out.println("Winter");
                     break;
                 case "march":
                 case "april":
                 case "may":
                     System.out.println("Spring");
                     break;
                 case "june":
                 case "july":
                 case "august":
                     System.out.println("Summer");
                     break;
                 case "september":
                 case "october":
                 case "november":
                     System.out.println("Autumn");
                     break;
                 default:
                     System.out.println("Please enter a month name");

             }





    }





}
