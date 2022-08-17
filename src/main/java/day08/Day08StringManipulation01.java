package day08;

public class Day08StringManipulation01 {

    public static void main(String[] args) {

        //Iask ; Count the alphabetical characters in a given string.
        //    Tom12 Hanks!... = String data type
        //If your code works just for one specific data it is called "Hard Coding".It can not be acceptedIf your code gives corrects output for some data and it doesn't correct data for some others
        //If your code works for all data , it is called "Dynamic code". Every time you must make your code 'Dynamic'
        /*
        //when we create a String value we name it like here 's' and we assign a value with double quotes
        //substring means a part of a string value for ex; NewYork's substring can be from index(2 to 6)==>wYor part
        //of the String.index(2) means inclusive second one index(6) will be exclusive part.Substring will include
        //2 starting from 2 ending just before 6 no adding to the substring the second exclusive part of substring.
        s.charAt()
         */
        String name = "Tom12 Hanks!...";

        int numOfLetters = name.replaceAll("[^A-Za-z]", "").length();

        System.out.println(numOfLetters);

        //Get the initial from full name.(Middle Name is out of scope).
        //Tom Hanks ==> TH

        String fullName = "   Tom hanks   ";
        //trim() method removes the spaces just from the beginning and from the end.It does not touch spaces in
        //the middle.
        //substring(startingIndex, endIndex) method is used to get a specific part of a string.
        //starting index is inclusive, ending index is exclusive.
        //Note:The variables used inside the method parenthesis are called "Parameters".
        //Note:The values you used inside the method parenthesis are called "Arguments".

        String initialOfFirstName = fullName.trim().substring(0,1).toUpperCase();

        System.out.println("initial:" + initialOfFirstName);

        //split method is used to split a string into specific parts by using specific characters .
        //The characters you used to split the string will not be visible after splitting.

        String initialOfLastName = fullName.trim().split(" ")[1].substring(0,1).toUpperCase();
        //String initialsLastOfName = fullName.trim().split("")

        System.out.println("InitialOfLastName: " + initialOfLastName);

        System.out.println(initialOfFirstName+initialOfLastName);//TH

        //Example3: Fix the day names' format like "Sunday".

        String dayName = "   sUNdAY ";//This is a dynamic code.trim method trims the spaces..

        String initialOfDayName=dayName.trim().substring(0,1).toUpperCase();
        String otherCharsOfDayName=dayName.trim().substring(1).toLowerCase();
        System.out.println(initialOfDayName+otherCharsOfDayName);

        //Example 4: Make all digits except last 4 digits of a credit card invisible by using asterics"*".
        //1234 1234 1234 1234 (the first three parts will be invisible).==> **** **** **** 1234

        String creditCardNumber = "1234 1234 1234 1234";
        String invisiblePart=creditCardNumber.substring(0,15).replaceAll("[\\d]","*");
        System.out.println(invisiblePart);

        //to see only the visible part;
        //Note 1:\\S means different from space (Uppercase means 'different from' \\ and an uppercase means also )
        //Note 2: \\s this has positive meaning , (Space chars.)

        String visiblePart = creditCardNumber.substring(15);

        System.out.println(invisiblePart+visiblePart);

        //Example 5:Count how many different from space were used in a String.
        //"Tom Hanks was born in 1975."
        //1.way:

        String s="Tom Hanks was born in 1975.";

        int numberOfChar=s.replace(" ", "").length();
        System.out.println("Number of characters: " + numberOfChar);

        //2.way:
       int numberOfCharacters=s.replace(" ", "").split("").length;
        System.out.println(numberOfCharacters);




    }



}
