package day09;

public class Day09StringMAnipulations03 {

    public static void main(String[] args) {

        /*
        String shirtPrice = "12.99";
        String bookPrice = "35.99";
        Type code to find the sum of the shirt and book prices.
         */
        String shirtPrice = "$ 12.99";
        String bookPrice = "$ 35.99";

        String s = shirtPrice.replace("$", "");//by replacing $ we have only double values...
        String b = bookPrice.replace("$", "");

        //How can I convert string to 'Double'?? I will go to Double wrapper class and put dot...
        //We converted strings to double because it is not possible to operate math operations with strings so
        //** we have to convert strings to double...
        double sd= Double.valueOf(s);
        double bd=Double.valueOf(b);

        System.out.println(sd+bd);














    }



}
