package day06;

public class Day06Ternary {

    public static void main(String[] args) {

        //ternary does the same with if else by using a different syntax.
        //Type code to check if a number is positive or not
        int x = -12;
        //1.way: by using if statements

        if(x>0){
            System.out.println("Positive");
        }else {
            System.out.println("Not Positive");
        }
        //2.way: By using ternary

        String result = x > 0 ? "Positive" : "Not positive";
        System.out.println(result);

        //Type code to check if an integer has 3 digits or not
        //**We should check the integer with positive and negative numbers too.
        // Not to have a bug in method we should add absX(absolute value of the integer)
        //do not forget!!! always test with -1000, -999, 100, -99, 0, 99, 100, 999, 1000==>Boundary Value analysis.

        int y = -234;
        int absY = Math.abs(y);
        String result2 = absY>99 && absY<1000 ? "It has 3 digits" : "It does not have 3 digits";
        System.out.println(result2);




    }



}
