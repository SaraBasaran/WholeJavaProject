package Practise02;

import java.util.Scanner;

public class Q08ITJavaClass {

    public static void main(String[] args) {

       /* 8) Create a String variable and print all characters except the last character on the console in
        uppercases.
                Example:If the String is ‘Java’ you should print ‘JAV’ on the console.
                String s = "Java";
        Integer indexOfLastChar = s.length()-1;
        String allCharsExceptLastChar = s.substring(0, indexOfLastChar).toUpperCase();
        System.out.println("All characters except the last character: " + allCharsExceptLastChar);

        */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a name please");
        String name = input.next();

       int indexOfLastChar= name.length()-1;
       String allCharsExceptForLast= name.substring(0, indexOfLastChar).toUpperCase();
        System.out.println("All characters except the last character is: " + allCharsExceptForLast);

        System.out.println("===================================================");

       /*9) Create a String variable and print all characters except the first character and the last
            character on the console in uppercases.1
            Example:If the String is ‘Java’ you should print ‘AV’ on the console.
            String s = "Java";
            Integer indexOfLastChar = s.length()-1;
            String allCharsExceptLastCharInUpperCase = s.substring(1, indexOfLastChar).toUpperCase();
            System.out.println("All characters except the first and the last character: " + allCharsExceptLastCharInUpperCase)

        */
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the name please");
        String name2= input.next();
        String idxFirstChar= name2.substring(1, indexOfLastChar);

         String allCharsExceptFirstLastChars= String.valueOf(name2.substring(1, indexOfLastChar)).toUpperCase();

        System.out.println("All characters except the first and last characters: " + allCharsExceptFirstLastChars);

        System.out.println("=======================================================");

           /*
           10) Type code to check if a String has just a single space character any position in the middle
            Example: For ‘Ali  Can’ your code should print false on the console
            For ‘ Ali Can ’ your code should print false on the console
            For ‘ Ali Can ’ your code should print false on the console
            For ‘Ali Can’ your code should print true on the console
            String s = "Tom Hanks";
            String trimmed = s.trim();
            String allExceptSpace = trimmed.replaceAll("\\s", "");==> TomHanks
           Boolean isThereSingleSpaceInTheMiddle = trimmed.length() - allExceptSpace.length()==1;
           System.out.println("There is a space in the middle: " + isThereSingleSpaceInTheMiddle)
            */


        System.out.println("Enter your name");
        String name3= input2.nextLine();

        String userName= name3.trim().toLowerCase();

        String trimmedName= userName.replaceAll("\\s", "");

        boolean isThereAnySpacesInbetween= userName.length() - trimmedName.length()==1;

        System.out.println(isThereAnySpacesInbetween);

        System.out.println("======================================================");

//        11) Type code to check if a String does not have any space character at the beginning and at
//        the end?
//        Example: For ‘ Ali ’ your code should print false on the console
//        For ‘Ali’ your code should print true on the console
//        String s = " Tom ";
//        String trimmedString = s.trim();
//        Boolean result = s.equals(trimmedString);
//        System.out.println("Is there space at the beginning and/or at the end? " + !result);

           String str1= "Sara";

           String trmName= str1.trim();
           Boolean result= str1.equalsIgnoreCase(trmName);

        System.out.println("Is there any space at the beginning and/or at the end? " + !result);




































    }








}
