package day10;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Day10StringManipulations01 {
    //Note 1:

    public static void main(String[] args) {

        //Ask user to enter his full name, then create a unique id for the user==>how wiil we cerate id for the user??        //
        //Id should contain first 2 char.s of the first name and the last 2 char.s  of last name.
        //Use the current date time at the end of the Id.
        //For ex; Tom Hanks ==> Toks20220528110434==>last six cahrs. are hoour, minute and second by this way it is unique.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");

        String name = input.nextLine();
        String firstTwo = name.substring(0, 2);//==>to get the first two letters
        System.out.println(firstTwo);
        /*Tom Hanks==> has 9 characters its length is 9 last but the index of last caharacter will be -1 everytime
        for last number of last characters. **Index of last caharacters equals to length-1 everytime.
         */

        String lastTwo = name.substring(name.length()-2);//to get the last two chars of the last name...-2
        System.out.println(lastTwo);
        LocalDateTime currentDateTime = LocalDateTime.now();
        String expectedCurrentDateTime =  currentDateTime.toString().substring(0, 19).replaceAll("[^0-9]", "");
        //time object is converted to string by using toString() and then by using substring (0 , 19) method we dropped off nanoseconds part
        // because it would be too long replacedAll symbols and chars other than numbers...

        System.out.println(firstTwo + lastTwo + expectedCurrentDateTime);



    }















}
