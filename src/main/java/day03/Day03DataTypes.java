package day03;

public class Day03DataTypes {

    /*

    Type casting; converting a number primitive data type to another number primitive data type.For ex;
    while using data type convert as 'byte' convert to 'int'. Normally it is byte but it will behave like
     byte. (You can't change char or boolean data types, as they are not numeric data types).



    byte - short - int - long - float-double

    For ex;

    **If you convert small data type to large dat type it is called 'Auto widening'.
    **If you convert large data type to small data type it is called 'Explicit Narrowing'.

         */

    public static void main(String[] args) {

        /*Auto Widening
        You can put a small box into a large box easily. No risk. Putting a small box into a big box
        is easier than putting big box into a small box.(to go from left order to right is easy)
        directly put byte variable into int variable
        */

        byte age =12;
        int myAge = age;


        short populationOfVillage= 21000;
        double myPopulationOfVillage= populationOfVillage;

        //Explicit Narrowing

        double x=23.45;
        long y= (long) x;


        /*Wrapper Classes: Java created Wrapper classes for primitive data types.For ex;

             primitive: byte, short, int, long, float, double, char, boolean
               Wrapper: Byte, Short, Int, Long, Float, Double, Character, Boolean
         */

        //If a method is static,you can access to the method by using class name.
        //Wrapper Class:
        //when the letter is in UpperCase, it means it is a class name.

        System.out.println(Float.MIN_VALUE);

        String name= "Mark Twain";

        name.toUpperCase();

        System.out.println(name.toUpperCase()); //MARK TWAIN
        System.out.println(name.toLowerCase());//mark twain
        System.out.println(name.length());//10(the number of characters in name variable with space)
        System.out.println(name.length()-1);//9(without space)


        System.out.println(Byte.MIN_VALUE);

        System.out.println(Float.MIN_VALUE);


    }
}
