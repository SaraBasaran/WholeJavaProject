package day11;

public class Day11ForLoops01 {


    public static void main(String[] args) {

        //Task 1: Type code to find the sum of integers from 10 to 14.

        //1.way:
        //System.out.println(10+11+12+13+14);
        //2.way:

        int sum= 0;  //**==> a container should be to put the new data..

        for (int i=10; i<15; i++){

            //System.out.println(i); //==>no addition operation yet..

            sum = sum+i;
            System.out.println(sum);
        }

        //Type code to find the multiplication of integers from 10 to 14

        int multiplication= 1; //as it is a multiplication we cannot put 0 here.To get the right value we should put 1.

        for (int i=10; i<12; i++){
            multiplication = multiplication * i;
        }
        System.out.println(multiplication);
        //Type code to sum up the even numbers between 20 and 36
        int sum2=0;

        for (int i = 20; i<25; i++){
            if (i%2==0)
            sum2=sum2 + i;
            }
            System.out.println(sum2);
        //Type code to find the sum of the odd numbers from 10 to 14.

        int sum3= 0;
        for(int k=10; k<14; k++){
            if(k%2!=0);
            sum3= sum3 + k;

        }  System.out.println(sum3);








    }








}
