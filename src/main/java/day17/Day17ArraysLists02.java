package day17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Day17ArraysLists02 {

    public static void main(String[] args) {
        //When we create the object inside the main method after object creation outside the main method you can add static feature
        //to your method.
        /***clear () removes all elements from the list.After removing elements, then your list will be empty list...
         * *
         *
         * Lists work with non-primitive data types...
         *
         * when you type code if you do not see any red lines and run the code if java gives error it is run time error.
         */

        //Task 1: Find the closest two integers in the given list.
        //[12, 15, 10, 11, 20]==> 12-11, 10-11

        ArrayList<Integer> list = new ArrayList<>(); //first sort the el.s, you have 10, 11, 12, 15 ,20
        list.add(12);                                //second; minDifference=11-10==>second el. minus first element
        list.add(15);                                //third; go to Math.min()==>inside the parameter will be (min.difference, third-second)==>
        list.add(10);                                //we should create a loop to check the differences
        list.add(11);
        list.add(20);
        //sort the list el.s==> you should go to "Collections" this will sort all el.s in the arraylists...

        Collections.sort(list); //when you sort==>[10,11,12,15,20]==>if it is required only one min or max no need to sort but for the list "must"
        System.out.println(list);

        //Select a min difference value

        int minDiff= list.get(1) - list.get(0);//list.get(1)==>11 and list.get(0)==>10
                                               //when you do subtration==1

        //Create a for-loop to compare all differences

        for (int i=1; i<list.size(); i++){      //ı will start from the second number bec. we already checked index "0" in the former step
                                                //that is why we started with "1" . there will be increment and put 2 for i element at index 2 is 12 element at index one it is11
                                                //there will be subtraction and result will be 1

           minDiff= Math.min(minDiff, list.get(i)- list.get(i-1)); //to complete all checking for all elements
        }
        System.out.println(minDiff);

        for (int i=1; i<list.size(); i++){

            if(list.get(i) - list.get(i-1)==minDiff){

                System.out.println(list.get(i)+ " - "+ list.get(i-1));
            }
        }
















    }













}
