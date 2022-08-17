package day11;

public class Day11Whileloop02 {

    public static void main(String[] args) {

        //Type code to check if a given integer is palindrome or not
        //Palindrome: 121 <==> 121  123321 <==> 123321 nalan <==>nalan

        String strI= "Nalan";
         //==>we converted the value into a string value...
        String reverse = "";
        int idx = strI.length()-1;
        while (idx>-1){
            reverse = reverse+strI.charAt(idx);
            idx--;
        }
        if(strI.equals(reverse)){
            System.out.println("Palindrome");

        }else {
            System.out.println("Not Palindrome");
        }

        System.out.println("=========================================");

        String strI2= "ey edip adanada pide ye";
        //==>we converted the value into a string value...
        String reversedFormat = "";
        int idx2 = strI2.length()-1;
        while (idx2>-1){
            reverse = reversedFormat+strI2.charAt(idx2);
            idx2--;
        }
        if(strI.equals(reverse)){
            System.out.println("Palindrome");

        }else {
            System.out.println("Not Palindrome");
        }







    }










}
