package Day18PractiseSessionTernary;

import java.util.Scanner;

public class TernaryPractise01 {

    public static void main(String[] args) {

        //Ask user to enter an integer and print "even" on the console for even integers, increase the value by 3
        //for odd integers and print it on the console by using ternary.

        //1.way
        Scanner input= new Scanner(System.in);
        System.out.println("Enter an integer");

        int num= input.nextInt();

        System.out.println(num%2==0 ? "Even" : num+3);

        //Object class is all over the other classes.Object class covers all other classes.
        //You can put any data type into object class.

        //2.way

        Object obj= num%2==0 ? "Even" : num+3;
        System.out.println(obj);

        //Object is just like the father of all classes.You can create object from all classes.

        //String.valueOf(num+3);//all numbers given by user java will put the integer value into my String value

        //3.way
        String str= num%2==0 ? "Even" : String.valueOf(num+3);

        System.out.println(str);














    }


















}
