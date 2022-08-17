package day05;

import java.util.Scanner;

public class Day05Modulus {

    /*Modulus Operator: % is called modulus operator in Java.
    It returns the remainder in a division operation.
    13/5 ==> Modulus operator gives you 3. 13 % 5 ==3
     */

    public static void main(String[] args) {
        //Ask user to enter an integer then print the last digit of the integer on the console.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");

        int number = input.nextInt();//In case the enters negative digit or digits, we should use Math class..
                                     //not to receive any error from the prog. we should consider all scenarios.
                                     //We should always consider "Boundry values: -1000, -10, -9, 0, 9, 10 and so on.
                                     //In case the user enters a negative value, we should use Math.abs(variablename).
        int absNumber = Math.abs(number);
        int lastDigit = absNumber % 10;
        System.out.println(lastDigit);

        //Ask user to enter his birth year, then print just last 2 digits on the console.

        Scanner dob = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        int yearDob = input.nextInt();

        int last2DigitsDob = Math.abs(yearDob) % 100;
        System.out.println(last2DigitsDob);
        //Ask user to enter an integer then print 'Even' on the console if the number is even.

        Scanner checkEvenNo = new Scanner(System.in);
        System.out.println("Enter an integer ");
        int absCheckEvenNo = input.nextInt();
        //we should use abs not to get any character ^a digit.
        System.out.println("Is the number even? " + (absCheckEvenNo % 2 == 0));

        Scanner checkOdd = new Scanner(System.in);
        System.out.println("Enter a digit to check if it is an odd number ");

        int absCheckodd = input.nextInt();

        System.out.println("Is the number odd? " + (absCheckodd % 2 != 0));

        //Ask user to enter a 3 digits integer then find the sum of the digits.User ın girdiği numberda rakamlar toplamı?
        /*For Ex; when the user enters 237 into the system we should first use modulus method like; 237%10= 7 and then

         */

        System.out.println("Enter a 3 digits number: ");

        Scanner threeDigitsN = new Scanner(System.in);

        int absThreeDigitsN = input.nextInt();

        int last = absThreeDigitsN%10;
        absThreeDigitsN = absThreeDigitsN/10;
        int second = absThreeDigitsN %10;

        absThreeDigitsN = absThreeDigitsN/10;
        int first= absThreeDigitsN%10;

        System.out.println(last + second + first);










    }











}

