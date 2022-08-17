package day12;

import java.util.ArrayList;
import java.util.Arrays;

public class Day12Arrays01 {

    public static void main(String[] args) { //==>array declaration

        //In an array you can store same data types with different values.
        /*
        1)Arrays are for storing multiple data.
        2)An array can have just a single data type.
        3)arrays can store primitive data types or references of non-primitive data types
        4)An array con not have non-primitive data types in it.
        5)When you create an array you have to declare its length(number of elements)
        Because you have to tell how many elements you will store in an array.
        6)Arrays use indexes like Strings
         */
           //Create an array.I want to store integers in an array.After the variable name []...
        //How to create an array

        int ages[] = new int[4];//I put four because I will put four different values...

        //How to print an array on the console

        System.out.println(Arrays.toString(ages));//[0,0,0,0]

        // How to assign values one by one..1.way

        ages[0] = 12;
        ages[1]= 20;
        ages[2]= 11;
        ages[3] = 9;

        System.out.println(Arrays.toString(ages)); //[12,20,11,9] but...
        //How to put values one by one on the console
        System.out.println(ages[2]);//11


        //How to create assign values in short.

        String names[] = {"Tom", "Jim", "Alex", "Karl"}; //generally we put [] after the name of array variable

        System.out.println(Arrays.toString(names)); //Tom, Jim, Alex, Karl
        System.out.println(names); // gives the addresses of the elements ==> this reference is for java

        //How to print elements one by one

        System.out.println(ages[2]);//11

        //Print the sum of the ages array elements on the console
          //1.way;
        System.out.println(ages[0] + ages [1] + ages [2] + ages [3]);//==>hard coding

        //2.way==>

        int sum=0;

        for (int i= 0; i<ages.length; i++){ //here length is not a method it is avariable given by java.

            sum= sum + ages[i];
        }
        System.out.println(sum);

        //Find the total number of characters in array elements
        int total = 0;
        for(int i=0; i<names.length; i++){
            total = total + names[i].length();
        }
        System.out.println(total);//14












    }


















}
