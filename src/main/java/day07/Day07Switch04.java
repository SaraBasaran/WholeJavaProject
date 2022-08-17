package day07;

import java.util.Scanner;

public class Day07Switch04 {

    public static void main(String[] args) {
        //Ask user to enter one of the + , -, / , * , % operations
        //Ask user to enter two values then return the result of the operation

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        double n = input.nextDouble();

        System.out.println("Enter second number");
        double m = input.nextDouble();

        System.out.println("Enter one of the operators... + , - , * , / , %");

        //==>those are single characters so char will be used

        char operator = input.next().charAt(0);

        switch (operator){

            case '+':
                System.out.println(n + "+" + m + "=" + (n+m));
                //Java will make the addition inside the parenthesis first ...
                break;
            case '-':
                System.out.println(n + "-" + m + "=" + (n-m));
                break;
            case '*':
                System.out.println(n + "*" + m + "=" + (n*m));
                break;
            case '/':
                System.out.println(n + ":" + m + "=" + (n/m));
                break;
            case '%':
                System.out.println(n + "%" + m + "=" + (n*m/100));
                break;
            default:
                System.out.println("That operation is not defined");

        }     //Note 1: String, int, char can be used in switch parenthesis as variable.
             //Note 2 : boolean(because it has only two results-true or false can not be used for switch values.
        // Because switch is created for multiple scenarios
        // Also long can not be used for switch values. Because switch is created for multiple scenarios not for multiple numeric results.
             //Note 3 : long ,float, double  can not be used because of their huge numeric values.
            //Note 4 : For multiple characters use String. For single characters use char.






    }



}
