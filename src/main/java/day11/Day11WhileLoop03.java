package day11;

public class Day11WhileLoop03 {

    public static void main(String[] args) {

        //Task: Type code to print the sum of the digits of an integer.

        int i= 237;
        int sumofDigits=0;

        while (i>0){

            sumofDigits = sumofDigits + i%10;
            i/=10;


        }
        System.out.println(sumofDigits);

             //Type code to create a multiplication table for any given number..For ex: when typed 3 it will give the results
        //of all multiplication results upto 10.
        //3==> 3x1=3  3x2=6  3x3=9 ...........3x10=30

        int k= 3;  //No need to put repeated part in while part.Like 3x...while loop works different values of same integer or character.

        int m=1;  //we need to type 1 as this is the starting value.

        while (m<11){

            System.out.println(k + "x" + m + "=" + k*m);
            m++;

        }











    }







}
