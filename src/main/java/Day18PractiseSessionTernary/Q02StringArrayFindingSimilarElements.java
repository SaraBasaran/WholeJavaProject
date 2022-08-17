package Day18PractiseSessionTernary;

import java.util.ArrayList;
import java.util.List;

public class Q02StringArrayFindingSimilarElements {

    public static void main(String[] args) {

        /*
         * Type code to find the common elements between two String Arrays
         * (without case sensitivity)
         * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
         * Output : [brad,sofia,emily]
         */

       String []arr = {"John", "Brad", "Angel", "Sofia", "Emily"};
       String [] brr= {"sofia", "brad", "grace", "emily" , "hazel"};

       List<String> list=new ArrayList<>();
       //to check all el.s one by one we need for loop.

        for (String w: arr){
            for (String u:brr){  //nested for loop

                if (w.equalsIgnoreCase(u)){

                    list.add(u);
               }

            }
        }
        System.out.println(list);











    }
























}
