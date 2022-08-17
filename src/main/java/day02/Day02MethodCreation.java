package day02;

public class Day02MethodCreation {

        public static void main(String[] args){

            System.out.println(addIntegers(3, 5 ));
            System.out.println(subtractIntegers(7, 5));
            System.out.println(multiplyIntegers(7,3));
            System.out.println(divideIntegers(24.6, 2));
        }

        public static int addIntegers(int a, int b){
            return a+b;
        }

        public static int subtractIntegers(int a, int b){

            return a-b;

        }

        public static int multiplyIntegers(int a, int b){

            return a*b;
        }

        //Create a dynamic division method

        public static double divideIntegers( double a, int b){

            return a / b;

        }


        //Note: If you use same data types for all values in a mathematical operation, the result will
        //      the result will be in the same data type.

        //Note: If you use different data type in a mathematical operation, the result will be in the largest
        //      data type . Example; double / int ==>>double


        /*
          What did we learn so far?
          1)How to create a dynamic methods.
          2)How to use a method in ''main method''.
          3)How to print the result of the on the console.
          4)How to return type when you create a method.
          5)How to work data types in mathematical operation.
         */


}
