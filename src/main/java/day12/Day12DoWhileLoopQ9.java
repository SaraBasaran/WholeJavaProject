package day12;

import java.util.Scanner;

public class Day12DoWhileLoopQ9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String password = "";

        do {
            System.out.println("Enter your password");

            password = scan.nextLine();

            if(!(password.equals("password"))) {

                System.out.println("false");

            }

        }while (false);


        System.out.println("true");








    }








}
