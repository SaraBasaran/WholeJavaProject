package day06;

import java.util.Locale;
import java.util.Scanner;

public class Day06NestedIfStatement {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your gender...");

        String gender = input.next().toLowerCase();
        System.out.println("Enter your age");
        int age = input.nextInt();

        /*If the gender is "Male" and the age is less than 13 print "Boy" otherwise print "Man".
        If the gender is "Female" and the age is less than 13 print "Girl" otherwise print "Woman".
        If the gender is different from "Male" and "Female" print "No information".
        If you put another statement into an if statement you need to use 'nested if'
        //to prevent any difference cause any problem with the enterance of the data
         */
        if(gender.equals("Male")){
            if(age<13){
                System.out.println("Boy");
            }else{
                System.out.println("Man");
            }

        }else if (gender.equals("Female")){
            if (age<13){
                System.out.println("Girl");
            }else{
                System.out.println("Woman");
            }
        }


    }










}
