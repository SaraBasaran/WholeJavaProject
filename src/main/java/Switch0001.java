import java.util.Scanner;

public class Switch0001 {

    //Ask user to enter the month name then print the number of the month on the console.

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a month name");
        String monthName= input.next();

        //1.way

        if (monthName.equalsIgnoreCase("January")) {
            System.out.println(1);
        }else if(monthName.equalsIgnoreCase("February")){
            System.out.println(2);
        }else if(monthName.equalsIgnoreCase("March")){
            System.out.println(3);
        }else if(monthName.equalsIgnoreCase("April")){
            System.out.println(4);
        }else if(monthName.equalsIgnoreCase("May")){
            System.out.println(5);
        }else if(monthName.equalsIgnoreCase("June")){
            System.out.println(6);
        }else if(monthName.equalsIgnoreCase("July")){
            System.out.println(7);
        }else if(monthName.equalsIgnoreCase("August")){
            System.out.println(8);
        }else if(monthName.equalsIgnoreCase("September")){
            System.out.println(9);
        }else if(monthName.equalsIgnoreCase("October")){
            System.out.println(10);
        }else if(monthName.equalsIgnoreCase("November")){
            System.out.println(11);
        }else if(monthName.equalsIgnoreCase("December")){
            System.out.println(12);
        }else{
            System.out.println("Enter a valid month name");
        }

        //2.way

        switch (monthName.toLowerCase()){  //may

            case "january":
                System.out.println(1);
                break;
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
                break;
            case "june":
                System.out.println(6);
                break;
            case "july":
                System.out.println(7);
                break;
            case "august":
                System.out.println(8);
                break;
            case "september":
                System.out.println(9);
                break;
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
