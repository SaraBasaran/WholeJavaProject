package day10;

import java.util.Scanner;

public class Day10ForLoop02TypingStringInReverse {

    public static void main(String[] args) {

        /*Type code to reverse a string.

        Tom Hanks==> sknaH moT****very common int. question
        last char is being the first char.
        second last char is being second first
        When you create a loop you should start to get the chars from the end and then you will go back.
        Your starting value will be the last char in the loop your ending value will be the first char.

         */

        String s ="Tommy";  //by this you ctreate the container for string value
        String reversed = "";  //==> //by this you create a container and put empty string in it.
        // when you type reserved it means you create a container and put empty string in it

        //for ( int i= s.length()-1; ==> to get the index of string
        // i >=0 ==> to start from the last char of the reverse
        //i-- ==>used for the decrement of index number
        // we should decrease as we will begin from the end to the beginning

        for (int i = s.length()-1; i>=0; i--){
        reversed = reversed + s.charAt(i);
         //                          i>=0;        i-- ==> Java will begin checking from the last index number to the first index
        //             is empty       4>=0

        }
        System.out.println(reversed);

        //Type code to find the sum of the digits of a number
        //2543==>14  ==>> the number will be divided by %10 which means division by /10...237%10=7
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer to find the sum of the digits");

        int num= input.nextInt();
        int absNum = Math.abs(num);
        int sumOfDigits = 0;//when you calculate sum put "0" as initial value...

        for (int i= absNum; i>0; i=i/10){  //237 is greater than zero + when you use for 237/10=23 and then 237%10=7, there is assignmet operator...
                                        // Assingment operator will put the new value in sumOfDigits.Then 23 will be left for next %10 value
                                        //First divide by 10 then modulus%10...and assignment will be done in order.Finally addition operation will be processed
            sumOfDigits = sumOfDigits + i%10;
        }
        System.out.println(sumOfDigits);







    }







}
