package day06;

import java.util.Scanner;

public class Day06InterviewQuestion01 {

    public static void main(String[] args) {

        //Ask user to enter 2 numbers then swap the numbers
        // a=12 and b= 13==> a=13 and b=12.There are two ways

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        double a = input.nextDouble();

        System.out.println("Enter second number");
        double b = input.nextDouble();
//        //1.way: we create a temp container to put the b value in it and then we put a into b container and then
//        //we put b into a container.
//
//        double temp= 0;
//        b = temp;
//        b = a;
//        a = temp;
//        System.out.println( a + " " + b);

        //2.way:a=12   b=13 >>a = a + b ==> a = 25 b = 13
        //      b = a - b ==> a = 25  a-b=13  a=13 b=12

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println( a + " " + b);







    }


}
