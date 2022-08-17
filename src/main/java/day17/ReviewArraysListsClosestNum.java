package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReviewArraysListsClosestNum {

    public static void main(String[] args) {
        //Find the closest 2 integers in the given list.
        //[12, 15, 10, 11, 20] ==> 12-11, 10-11

        ArrayList<Integer> list= new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(10);
        list.add(11);
        list.add(20);
        //closest ones does not always means 1 it can be 0 too
        //Firstly we need to sort the el.s
        //Secondly we will use minDif = second el. - first el.
        //Third step==>from Math class==>Math.minDif, third-second==>for this step we need to create a loop to check
        //the logic for every element.We will compare the differences not the values then type the closest integers.

        //1.step:Sort the list el.s
        //in Arrays there is sort method but for lists we use "Collections.sort(the name of the list)==>puts the list in ascending order

        Collections.sort(list);
        System.out.println(list);

        //2.step:Select a min difference value

        int minDiff= list.get(1)- list.get(0);//2.el. ile 1.sıradaki elementi çıkarmak için gerekli logic.Böylece ilk iki rakam arasındaki
                                              // diff. elde edilmiş olur.
        //3.step: Create a loop to compare all differences
        for(int i=1; i< list.size(); i++){ //as we got the first num difference nı need to check again so we start from int i=1;
                                          // we need to create a new container for the minDiff value if java can
                                          // find the min value put it into minDiff container
            minDiff= Math.min(minDiff, list.get(i) - list.get(i-1));

        }
        System.out.println(minDiff);

        for (int i=1; i< list.size(); i++){

            if (list.get(i)- list.get(i-1)==minDiff){
                System.out.println(list.get(i) + " - "+ list.get(i-1));//whose difference is equal to minDiff value those will be printed

            }

        }

        System.out.println("=======================================================");

        /*
        From a given list find all pairs whose sum is a given number
        {4, 6 , 5, -10, 8, 5, 20}
        for ex; 4+6=10, 5+5=10, -10+20=20
         */

       //we have to use nested loop bec. of repeated action for each number

        //1.step create int list
        //To create a list, following syntax can be used but if you create the list
        //by using following syntax you cannot use list methods to change the size.
        List<Integer> list1=Arrays.asList(4, 6 , 5, -10, 8, 5, 20);//other syntax to create a list in short. asList() sth like list but act. it is array
                                                                     //act. that is array..we can not add anything as it is act. an array.For some you can do operation
                                                                    //but you can not make any change


        //if you want to add sth into this Arrays.asList in this way it will give error
        // list.add(222);==>gives error=>UnsupportedOperationException
        //or list.clear==> gives error=>UnsupportedOperationException
        //or list.remove==>gives error=>UnsupportedOperationException

    for (int i=0; i< list.size(); i++) {

        for (int k = 1; k < list.size(); k++) {

            if (list.get(i) + list.get(k) == 10) {

                System.out.println(list.get(i) + " and " + list.get(k));

            }
        }
    }


    }








}
