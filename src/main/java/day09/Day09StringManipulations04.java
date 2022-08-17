package day09;

public class Day09StringManipulations04 {

    public static void main(String[] args) {
        // Type a code to find the number of punctuation marks used in a String.

        String str= "Wow!... Ali is 13 years old, and he is a university student.";

        int totalNumOfChars = str.length();
        System.out.println(totalNumOfChars);

        String strWithoutPunct= str.replaceAll("\\p{Punct}", "");

        //regular expression for ALL punctuation "\\p"==> BY REPLACE ALL PUNCTUATİON MARKS WİTH NOTHING,
        // WE CAN FIND THE NUMBER OF CHARACTERS IN THE STATEMENT

        System.out.println(strWithoutPunct.length());

        System.out.println(totalNumOfChars - strWithoutPunct.length());

        //easy way...

        System.out.println(str.replaceAll("\\P{Punct}", "").length());

        //Create a method prints greetings by using the given name
        //Ali==> Hi Ali!         Tom ==> Hi Tom!



        greetingUser ("Ali");
        System.out.println(greetingUser("Ali"));
        System.out.println(limitDecimalPart(12.21212121f));


    }

    public static String greetingUser(String name){
        return String.format("Hi %s",name + "!");
        //String.format ==> If you put "%s" to your string, you can add a value into your main string...
        //You can add at the beginning, in the midddle and at the end.




    }
    //Create a method makes the decimal part has 5 digits.
    public static String limitDecimalPart(float number){

        //We should create a string class and use format ()...

        return String.format("The price is %.5f", number);

        //This percentage means use number and dot means how many number right after me.





    }





}
