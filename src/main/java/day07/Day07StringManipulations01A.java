package day07;

import java.util.Scanner;

public class Day07StringManipulations01A {

    public static void main(String[] args) {


        //when we create a String value we name it like here 's' and we assign a value with double quotes
        //substring means a part of a string value for ex; NewYork's substring can be from index(2 to 6)==>wYor part
        //of the String.index(2) means inclusive second one index(6) will be exclusive part.Substring will include
        //2 starting from 2 ending just before 6 no adding to the substring the second exclusive part of substring.

        //Example 1:Type code to print just the unique characters in a String.
        //"Hello" ==> Heo


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to print unique characters.");
        String str = input.nextLine();

       /*
        //Explanation: for          Hello
                                 indexof()        lastIndexOf()
                       H ==>         0              0
                       e ==>         1              1
                       l ==>         2              3 **There is no equality between the indexOf() and lastIndexOf()
                       o ==>         4              4
        */
        //1.way:
        /*
        if(str.indexOf(str.charAt(0)) == str.lastIndexOf(str.charAt(0))) {

            System.out.println(str.charAt(0));
        }
        if(str.indexOf(str.charAt(1)) == str.lastIndexOf(str.charAt(1))) {
            System.out.println(str.charAt(1));
        }
        if(str.indexOf(str.charAt(2)) == str.lastIndexOf(str.charAt(2))){
            System.out.println(str.charAt(2));
        }
        if(str.indexOf(str.charAt(3)) == str.lastIndexOf(str.charAt(3))) {
            System.out.println(str.charAt(3));
        }
        if(str.indexOf(str.charAt(4)) == str.lastIndexOf(str.charAt(4))){
            System.out.println(str.charAt(4));

         */

            //2.way:create a container put the item in it so we can use whenever and however we want.
        //here we create a char container and change the name and the value acc. to the index and fastIndex of the
        //chars.
        char c = str.charAt(0);
        if(str.indexOf(c) == str.lastIndexOf(c)){
            System.out.println(str.charAt(c));
        }
        char d = str.charAt(1);
        if(str.indexOf(d) == str.lastIndexOf(d)) {
            System.out.println(str.charAt(d));
        }
        char e = str.charAt(2);
        if(str.indexOf(e) == str.lastIndexOf(e)) {
            System.out.println(str.charAt(e));
        }
        char f = str.charAt(3);
        if(str.indexOf(f) == str.lastIndexOf(f)) {
            System.out.println(str.charAt(f));
        }
        int g = str.charAt(4);
        if(str.indexOf(g) == str.lastIndexOf(g)) {
            System.out.println(str.charAt(g));
        }























    }
}

