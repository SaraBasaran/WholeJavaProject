package Day18PractiseSessionTernary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q7SumOfGreatestAndLeastNum {

    public static void main(String[] args) {

        /*
    Find the sum of the least and the greatest price given in a String list
    Example: List<String> myList = new List<String>{"$12.99", "$8.25", "$23.60", "$54.45"}; ==> 62.70
    */

        List<String> list= Arrays.asList("$12.99", "$8.25", "$23.60", "$54.45");
        System.out.println(list);

        List<Double> doubleList=new ArrayList<>();//I need maths operation so I need to put them new empty list...

        for (String w:list){

           double price=Double.valueOf(w.replace("$", "")) ;//valueOf method gives the number value...

            doubleList.add(price);
        }
        System.out.println(doubleList);
        Collections.sort(doubleList);
        System.out.println(doubleList);
        System.out.println(doubleList.get(0)+ doubleList.get(doubleList.size()-1));











    }







}
