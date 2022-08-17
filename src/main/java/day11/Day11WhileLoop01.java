package day11;

public class Day11WhileLoop01 {

    public static void main(String[] args) {

        //Type code to print the integers divisible by 4 and 6 from 13 to 211.
        //1. way:for-loop way

        for (int i= 13; i<212; i++){

            if (i%4 == 0 && i%6 ==0){

                System.out.print(i + " ");
            }

        }
        System.out.println("=================================");
          //While loop ==>starting value will be before the put at the top and then condition will be put inside the parenthesis and
        //increment and decrement value will be put to the last line of the while loop. Logic line with "if" does not change.
        //Every code can be solved by using for-loop and while-loop
        int i=13;
        while (i<212){

            if(i%4==0 && i%6==0){
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println("=================================");
        //Type code to print integers from 3 to 5 by using while-loop.

        int k= 3;
        while (k<6){
            System.out.print(k + " ");
            k++;
        }

        System.out.println("=================================");













    }







}
