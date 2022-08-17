package day31Lambda_functional_programming;

import jdk.jshell.execution.Util;

import java.util.stream.IntStream;

public class Fp_04 {

    public static void main(String[] args) {
        System.out.println(getSumFromSevenToHundred01());
        System.out.println(getMultiFromTwoToEleven());
        System.out.println(calculateFactorial(4));
        System.out.println(sumOfEvenIntInGivenRange(2, 5));
        System.out.println();
        System.out.println(findSumOfDigitsFromGivenIntegers(10, 13));


    }
    //Create a method to find the sum of numbers from 7 to 100.
    public static int getSumFromSevenToHundred01(){

        return IntStream.range(7, 101).reduce(0, Math::addExact);

    }

    //2)Create a method to find the multiplication of the integer from 2(inc) to 11 (inc)

    public static int getMultiFromTwoToEleven(){
        return IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact);

    }
   //3) Create a method to calculate the factorial of a given number.
    //5 factorial= 1*2*3*4*5==>5!
    public static int calculateFactorial(int x){  //dynamic code
        if (x>0){
            return IntStream.rangeClosed(1,x).reduce(1, Math::multiplyExact);
        }
        System.out.println("Do not use negative numbers for factorial operations");
        return 0;
        //When we type negative numbers for factorial calculation java gives just 1 as result
        //bec. for factorial operations negative num.s can not be used
    }
    //4)Create a method to calculate the sum of even integers between given two integer

    public static int sumOfEvenIntInGivenRange(int s, int e) {
        int x=0;
        if(s>e){
            x=s;
            s=e;
            e=x;
        }

        return IntStream.rangeClosed(s, e).filter(UtilsNt::checkToBeEven).sum();
    }
    //Create a method to calculate the sum of digits of every integers between given two numbers
    // 23 and 25==> 2+3 , 2+4, 2+5
    public static int findSumOfDigitsFromGivenIntegers(int s, int e){
        int x=0;
        if(s>e){
            x=s;
            s=e;
            e=x;
        }


        return IntStream.rangeClosed(s,e).map(UtilsNt::getSumOfDigits).sum();


    }









}












