package day20StringBuffer;

/*
    Polymorphism = Overloading + Overriding

    Poly=Multi  Morph=Form Polymorphism= Sth in multiple form

    We need methods with "same name" and "different parameters" to make our codes more readable. For ex; you want to
    get substring from "Java", you can work on diff. scenarios. You may want to get the first char or start the second
    char and not take the last char.

    For ex; you can do addition with int.s doubles or even with Strings...action name is same but param. can be different.This is called "overloading"

     Overloading is
    If I do addition firstly I should focus on add method and then the param.s

    2)How can make parameters different?
    a) By changing the number of parameters
    ==>public static int add (int a, int b){} and add public static int add (int a, int b, int c){}

    b) By changing data types of the parameters

   ==> public static int add (int a, int b){} and change it to acc. to need ==>public static double add (double a, double b){}

    c)By changing the order if the data types are different

    ==>  public static String add (String a, int b){} and  public static String add (int a, String b){}

    3) Can you overload "private" methods? //private is not problem when you are in the class, it will be a prob. if you go outside the class.

     Method Overloading is done in a single class, "private " access modifier creates issue if you are outside the class.
     Therefore, doing method "overloading" will not be an issue for private methods.

   4) Can you overload "static" methods?

   Static methods can be overloaded.Static things will be attached to the class.

   5)Method Overloading is a part of polymorphism because we create method in multiple forms


     */

public class PolymorphismOverLoadingReview {

    public static void main(String[] args) {
        String s= "Java";

    }

    public static int add (int a, int b){

        return a+b;
    }
    public static double add (double a, double b){

        return a+b;
    }

    public static String add (String a, String b){

        return a+b;
    }









}
