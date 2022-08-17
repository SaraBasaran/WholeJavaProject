package day16;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

    public static void main(String[] args) {

        //Create an integer list, add 5 elements in it, remove the even numbers, change the add elements to 22
        //[12, 3, 7, 24, 11] ==> [22, 22, 22]

        List<Integer> al= new ArrayList<>();
        al.add(12);
        al.add(3);
        al.add(7);
        al.add(24);
        al.add(11);

        System.out.println(al);

        for (int i= 0; i< al.size(); i++){

            if (al.get(i)%2==0){
                al.remove(i);
                i--;
            }else{
                al.set(i, 22);//
            }

        }
        System.out.println(al); //all even numbers removed and 22 is put in place of odd numbers.


        //Task:Create an integer list which has repeated elements and remove the duplicates.
        //[2, 3, 2, 2, 4] ==>[2, 3, 4]

        List<Integer> originalList = new ArrayList<>();

        originalList.add(2);
        originalList.add(3);
        originalList.add(2);
        originalList.add(2);
        originalList.add(4);

        List<Integer> uniqueList= new ArrayList<>();

        //if the original list has duplicate numbers do not put...

        for(int w: originalList){

            if (!uniqueList.contains(w)){ //if we put "!" if w does not have ...

                uniqueList.add(w); //if w has duplicate number

            }
        }
        System.out.println(uniqueList);

    }




}
