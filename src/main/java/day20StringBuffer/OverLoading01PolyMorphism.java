package day20StringBuffer;


/*
        Polymorphism = Overloading + Overriding

        Overloading means; We need methods with "same name" and "diff. parameters" to make our codes more readable.
        Within one method diff. scenarios may happen. add() may be used for diff. parametes like
        int + double or int + int or String + String

       1) MethodOverLoading: Giving same method name for diff. parameters.
       2) How can you make the parameters diff.?
       a) By changing the number of param.
       ==> int a, int b, int c
       b) By changing the data types of the param.
       public static double add(double a, double b){

        return a+b;
        c) By changing the order of if the data types are diff.
        public static String add(String a, String b){

        return a+b;



 */

public class OverLoading01PolyMorphism {

    public static void main(String[] args) {

    }

    public static int add(int a, int b){

        return a+b;
    }

    public static double add(double a, double b){

        return a+b;
    }
    public static String add(String a, String b){

        return a+b;
    }
    public static String add(String a, int b){

        return a+b;
    }







}
