package day06;

import java.util.Scanner;

public class Day06IfElseStatement02 {

    public static void main(String[] args) {

        /*Ask user to enter the password and check if the password is valid or not acc.to the given rules
        1) At least 8 characters
        2)Contains at least 1 uppercase
        3)contains at least 1 lowercase
        4)contains at least 1 symbol
        **If there is no defect in the construction of pwd then there is no need to take action or give any result
        as there is no problem the user will be directed to another page after a valid pwd enterance.
         */
        // 1.way
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your password");

        //password will be a String because it will have different characters.
        String pwd = input.next();//next() method gives us a String.

        //1) At least 8 characters, the condition should be less than 8 condition.
        if (pwd.length() < 8) {
            System.out.println("Password is invalid because it does not have at least 8 characters");

            //2)Contains at least 1 uppercase

        } else if ((pwd.replaceAll("[^A-Z]", "")).length() == 0) {
            //[^A-Z] and so on is a group of data. ^means different from. we should put regex [].
            System.out.println("Password is invalid because it does not have at least one uppercase");
            //3)contains at least 1 lowercase
        } else if ((pwd.replaceAll("[^a-z]", "")).length() == 0) {

            System.out.println("Password is invalid because it does not have at least one lowercase");

            //4)contains at least 1 symbol
        } else if ((pwd.replaceAll("[^A-Za-z0-9]", "")).length() == 0) {

            System.out.println("Password is invalid because it does not have at least any symbol");
        } else {
            System.out.println("Password is valid, Welcome to Chase Bank");
        }
        System.out.println("=================================================================");
        //2.way
        if (pwd.length() < 8) {
            System.out.println("Password is invalid because it does not have at least 8 characters");
        }
        if ((pwd.replaceAll("[^A-Z]", "")).length() == 0) {
            //[^A-Z] and so on is a group of data. ^means different from. we should put regex [].
            System.out.println("Password is invalid because it does not have at least one uppercase");
        }
        if ((pwd.replaceAll("[^a-z]", "")).length() == 0) {

            System.out.println("Password is invalid because it does not have at least one lowercase");
        }
        if ((pwd.replaceAll("[^A-Za-z0-9]", "")).length() == 0) {

            System.out.println("Password is invalid because it does not have at least any symbol");

         //If we use if else we see onşy one message, if we use if statements only then we will see all results.
          //If you wanna check just if the password is valid first way is better.
            // But if you wanna see all results after password you can use second way with multiple words.
        }


    }
}
