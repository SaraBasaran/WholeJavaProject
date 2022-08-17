package day07;

import java.util.Scanner;

public class Day07Switch03 {

    public static void main(String[] args) {


        //Ask user to enter a character, if it is 'Vowel', if it is not a vowel print "Not vowel"
        //if user will give a single character your container should be "char" value.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter to check if it is vowel or not");
        char c = input.next().toLowerCase().charAt(0);//to get the first char the index of 1st is 0.

        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'y':
            case 'z':
                System.out.println("Not Vowel");
                break;
            default:
                System.out.println("Enter a letter not the other characters...");



        }










    }



}
