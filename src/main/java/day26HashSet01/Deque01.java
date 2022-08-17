package day26HashSet01;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {

    /*
    Last In First Out


     */

    public static void main(String[] args) {

        Deque<String> dq1= new LinkedList();
        dq1.add("As");
        dq1.add("Bt");
        dq1.add("Cu");

        dq1.pop();

        System.out.println(dq1.pop()); //As
        System.out.println(dq1); //[Bt, Cu]

        //dq1.push();  //equivalent to addFirst().









    }














}
