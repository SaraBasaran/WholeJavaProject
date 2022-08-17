package Practise02;

import java.util.Scanner;

public class Q12ItJavaClass {


    public static void main(String[] args) {
//
//        12) Type code to check if a String has an uppercase initial and dot at the end.
//                Example: For ‘Ali’ your code should print false on the console
//        For ‘ali.’ your code should print false on the console
//        For ‘ Ali. ’ your code should print false on the console
//        For ‘Ali.’ your code should print true on the console
//        For ‘ALI.’ your code should print true on the console
//        String s = "Tom Hanks.";
//        char firstChar = s.charAt(0);
//        char lastChar = s.charAt(s.length()-1);
//        Boolean isTheFirstCharUpper = firstChar>='A' && lastChar<='Z';
//        Boolean isTheLastCharDot = lastChar=='.';
//        Boolean isFirstUpperAndLastDot = isTheFirstCharUpper && isTheLastCharDot;
//        System.out.println("Is the first char upper and the last char dot? " + isFirstUpperAndLastDot);


        String name="Tom Hanks.";
        char firstChar= name.charAt(0);
        char lastChar= name.charAt(name.length()-1);

        Boolean isTheFirstCharUpper = firstChar>='A' && lastChar<='Z';
        Boolean isTheLastCharDot = lastChar=='.';
        Boolean isFirstUpperAndLastDot = isTheFirstCharUpper && isTheLastCharDot;
        System.out.println("Is the first char uppercase and the last char dot? " + isFirstUpperAndLastDot);



        //13) Type code to check if a password is valid or not for the following conditions;
        //Password must have at least 8 characters different from space character
        //Password must have at least 1 symbol
        //Example: For ‘A2b!’ your code should print false on the console
        // For ‘A2b3cdef’ your code should print false on the console
        // For ‘!1a23b4’ your code should print false on the console
        // For ‘!1a23b4?es’ your code should print true on the console
        // For ‘! a b 3 k’ your code should print false on the console
        //String pwd = "!1a23b4?es";
        //Boolean atLeastEightChars = pwd.replaceAll("\\s","").length()>=8;
        //Boolean atLeastOneSymbol = pwd.replaceAll("\\s","").replaceAll("[A-Za-z0-9]","").length()>0;
        //System.out.println("Is the password valid? " + (atLeastEightChars && atLeastOneSymbol));


//        Scanner input= new Scanner(System.in);
//
//        System.out.println("Create your password");
//
//        String pwd = input.next();

        String pwd= "Sara12234";

          Boolean atLeastEight = pwd.replaceAll("\\s", "").length()>=8;

          Boolean atLeastOneSymbol= pwd.replaceAll("\\s", "").replaceAll("[A-Za-z\\d]", "").length()>0;
          System.out.println("Is the password valid?" + (atLeastEight && atLeastOneSymbol));

         /*
         14) Type code to check if a String has a specific single character or not in three different ways.
          1.Way:
          String s = "Java";
          Boolean result = s.contains("v");
          System.out.println("Does the character exist? " + result);

          2.Way:
          String s = "Java";
          Boolean result = s.replaceAll("[^v]", "").length()>0;
          System.out.println("Does the character exist? " + result);

         3.Way:
         String s = "Java";
         Boolean result = s.indexOf("v")!=-1;
         System.out.println("Does the character exist? " + result)
          */
          //1.way;

        String nameInput = "Mehmet";

        Boolean result = nameInput.contains("a");
        System.out.println("Does the char exist?" + result);

        System.out.println("=============================================================");

        /*3.Way:
        String s = "Java";
        Boolean result = s.indexOf("v")!=-1;
        System.out.println("Does the character exist? " + result)
         */

        //3.way

        String s2= "Sara";
        Boolean result3= s2.indexOf("a")!=-1;

        System.out.println("Does the character exist " + result3);


       /*
       15) String shirtPrice = ‘$12.99’;
        String bookPrice = ‘$35.99’;
        Type code to find the sum of the shirt and book prices.
        String s = shirtPrice.replaceAll("[$.]","");
        String b = bookPrice.replaceAll("[$.]","");
        double x = Double.valueOf(s);
        double y = Double.valueOf(b);
        System.out.println("Total price is " + (x+y)/100);

       */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the shirt price, please.");
        String shirtPrice= input.next();
        String shirtPriceWithout$= shirtPrice.replaceAll("[$]", "");
        System.out.println(shirtPriceWithout$);
        System.out.println("Enter the book price please.");
        String bookPrice= input.next();
        String bookPriceWithout$= bookPrice.replaceAll("[$]", "");
        System.out.println(bookPriceWithout$);

        double x= Double.valueOf(shirtPriceWithout$);
        double y= Double.valueOf(bookPriceWithout$);
        double z= x+y;
         System.out.println("Total price " + ((x+y)));










    }











}
