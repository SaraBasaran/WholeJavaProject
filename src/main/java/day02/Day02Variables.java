package day02;

public class Day02Variables {

    public static void main(String[] args) {

        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);


        //If you create a variable inside the main method, Java will automatically accept as 'static' as
        // inside the main method it is written as 'static'.
        //Create a char variable.
        //DO NOT FORGET TO PUT THE VALUE BETWEEN SINGLE CODES='...'
        // TIRNAK İÇİNDE YAZILIR TEK KARAKTERLER.
        //Default value of char is the character whose value is zero.

        char initial = 'S';

        //Create a boolean variable.

        //The value can only be in 2 ways; true or false.
        //What s the default value ? It is False...

        boolean isOld = true;
        boolean isAlive= false;

        //Create a byte (data type) variable.

        byte ageOfStu = 13;

        //Create a short (data type) variable.

        short populationOfVillage = 21000;

        //Create a long (data type) variable.

        long populationOfWorld = 7123456789L;
        //*When you type a greater number, if you type L at the end of the value Java will accept.

        long populationOfWorldL = 7123456789L;
        //it means you insist on to make the number in long.
        //If we type small numbers for long data type, it is ok for Java to save the integers in this way,
        // but the memory will be reserved in vain in that huge reserve area.
        //When you create a long variable do not forget to put L at the end of the value.


    }

    //How to create a variable
    //You should type Data Type - Write Variable Name - Use Equal Sign - Value - Semi Column
    static               int          age                     =              12      ;
    static int height = 183;

    //Create a double variable
    public static double weight = 85.7;

    //If you do not type any ''access modifier'', it means the access modifier is ''default''.

    /*Data types in Java

    There are 2 types in Java;

    1)Primitive Data Types

            i)Those data types were created by Java, we can not create any primitive data type.

              Primitive data types are 8;

            a)byte = It is used for the values from -128 to 127.It is for whole numbers.

            For ex; while creating for a school system student age you should define byte type.

            b)short = It is used for -32000 sth to 32000. For ex; for an app to define the population of a
            village.
            ***In app creation memory management is very important. If you use memory without saving memory, your
            app can freeze, can be slow. If 'byte' is enough, no need to use 'short'.


            c)int : It is used for the values -2 billion to 2 billion sth. It is used for whole numbers
            For ex; the number of people in a country ...

            d)long: It is used for the values from ........ to ....... It is for whole numbers.
            For ex; the population of the world.

            e)float: It is used for decimal. Float uses memory less than double.
            When you use float as the data type, you have to put ,'F' or 'f'.
            Among the numbers you will have a letter but the developers don't like this and
            the developers prefer double data type.
            Float has 7 digits at most in decimal numbers


            f)double:It is used for decimals. double is used for scientific researches
            Double has 16 digits at most in decimal parts


            float - double (which are all for numbers) / char (single characters
             like upper case, dot, exclamation sign...etc.) - boolean (True or False values. For ex; Are you
             retired? I would answer - No . If smb asks are you a Java Instructor? when answering yes it means
             we should define data type as boolean

    2)Non-Primitive Data Types

    //Those data types can be created by Java and Java developers.

             /*  String is a non-primitive data type and used for multiple characters in limitless numbers.

               String is a source code.For Ex; while creating student names and Id numbers of the students
               in a school the data will have different characters...

            */


    /* //***What is the difference between primitive and non-primitive data types?

            a)Primitive data types start with lowerCases, non-primitive ones start with UpperCases...
            b)Primitive data types can be created just by JAva and Non-primitive data types can be created by
            Java and Java developers.
            c)Primitive data types use different size of memory, but non-primitive data types use memory same.
            d)Primitive data types have just ''values'' but non-primitive data types have ''values'' and
            ''methods'' in it.

        */

    String nameOfStd= "Mark Twain";
    String stdId= "22-01 Id";

            //In Strings without coding, there are many ways to create a variable and methods

       char c = 'c';








}
