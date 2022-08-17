package reviews;

import java.util.ArrayList;
import java.util.List;

public class Day16ArrayLists02Review {

    public static void main(String[] args) {

        //Create an integer list, add 5 el.s in it, remove the even el.s change the odd elements 22.
        //[12, 3, 7 24, 11] ==>[22, 22, 22]

        List<Integer> al =new ArrayList<>();
        al.add(12);
        al.add(3);
        al.add(7);
        al.add(24);
        al.add(11); //for removing even ele.s, we need to use for loop

        for(int i=0; i<al.size(); i++){

            if (al.get(i)%2==0){
                al.remove(i);
                i--;
            }else {
                al.set(i, 22); //set() is for updating the elements in the lists.
                               //set() is for changing the value of variable by using index value=i and new value.
                               //here updating the odd numbers to 22.
            }
        }
        //Create an integer list which has repeated el.s then remove the duplicates.
        //[2, 3, 2, 2, 5] ==> [2, 3, 5]

        List<Integer> originalList =new ArrayList<>();
        originalList.add(2);
        originalList.add(3);
        originalList.add(2);
        originalList.add(2);
        originalList.add(3);
        originalList.add(5);

        List<Integer> uniqueList= new ArrayList<>();

        for (Integer w: originalList){

            if (!uniqueList.contains(w)){
                uniqueList.add(w);
            }

        }
        System.out.println(uniqueList);




    }










}
