package day13;

import java.util.Arrays;
import java.util.Scanner;

public class Day13Arrays02 {

    public static void main(String[] args) {

        //Create a string array by getting elelemnts from user
        //Type codes to put elelemnts in Alphabetical order.
        //Type code to print the total number of characters in the first and the last string.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store in the array");

        int length= input.nextInt();
        String arr[] = new String[length];//when you create a string array java will put zeros in it.
                                         // when the user enters the value of characters java will reserve array contaioner with "0"s
                                        // in the length array container
        for(int i=0; i<length; i++) { //to go from the first index to the last index you have to increase

            System.out.println("Enter the " + (i + 1) + ". element");
            arr[i] = input.next().toLowerCase();

        }
        System.out.println(Arrays.toString(arr));

       //Type codes to print the array elements in alphabetical order
        Arrays.sort(arr); //if you use Array.sort() for numbers it will put numbers in ascending order
                          //if you use Arrays.sort() for string it will put the elements in alphabetical order.

        System.out.println(Arrays.toString(arr));

        int numOfCharsInFirstElement= arr[0].length();//this is the first element's length
        int numOfCharInLastElement  = arr[arr.length-1].length();//if you put the last index-1 inside the array parenthesis,
                                                                //it will give you the last element's indexand adding length()
                                                                //  after it will give the length of the last element

        System.out.println(numOfCharsInFirstElement + numOfCharInLastElement);











    }







}
