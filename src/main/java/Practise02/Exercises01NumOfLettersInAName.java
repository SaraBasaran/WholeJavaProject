package Practise02;

import java.util.Scanner;

public class Exercises01NumOfLettersInAName {
    public static void main(String[] args) {
        //1.Task: Count the alphanetical charaters in a given value.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name please.");

        String fullName = input.nextLine();
        int NumberOfFullName = fullName.replaceAll("[^A-Za-z]", "").length();

        System.out.println(NumberOfFullName);

        System.out.println("=======================================================");

        //2.task: Get the initials from full name.

        String fullName2= input.nextLine();

        String initialOfFirstName = fullName2.trim().substring(0,1).toUpperCase();

        //trim() method removes the spaces only before and after the given value.
        //substring means for Java to take a specific part of a String by using index value
        //substring (0,1) tells Java to start processing from 0 (inclusive) to stop at 1st(exclusive) of index.

        String initialOfLastName = fullName2.trim().split(" ")[1].substring(0,1).toUpperCase();
// After splitting the values with usage of "space" then the index of "Hanks will be the 1st at index because
        //for Java after splitting String values every part of index will be defined as starting from 0.
        //like splitting "tom Hanks"==> index of tom is 0 and index of Hanks will be [1]

        System.out.println(initialOfFirstName + "____ " + initialOfLastName + "________");

        //Example 5:Count how many different from space were used in a String.
        //"Tom Hanks was born in 1975."
        //1.way:

        String s="Tom Hanks was born in 1975.";
        int numOfChars = s.replace(" ", "").length();

      //When you use startswith() method you have to add an String value. "Startswith ()" does not cover 'char' value.

        String str = "Hello World";

        System.out.println(str.indexOf('h'));

        //**As there is no 'h' in the String the result will be -1...
        // indexOf() methods returns -1 for non-existing characters.
        //If you use indexOf() with multiple characters, it will return index of first caharacter only.
        //For ex;
        /*String str = "Hello World"; ==> sout(str.indexOf("Wo");==> 6 on the console as it is the first character
        asked for the multiple indexes...
        //If you want to skip some caharacters from the beginning you can use indexOf() like that;
        String str ="Java is Java" ==> sout(ştr.indexOf("va", 2)==> means skip the first 2 caharacters

       and give the index of "va". ==> the result is 2 on the console as there are 2 "va"s in the value and the first
       value will be printed as the index==>2.

       lastIndexOf() gives you the last index of the character but indexOf() gives yı-ou the first indexOf occurence.
         */


    }


}
