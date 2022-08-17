package day17;

import java.util.Arrays;
import java.util.List;

public class ArrayLists02 {


    public static void main(String[] args) {
        /*
        From a given list find all pairs whose sum is a given number
         {4, 6, 5, -10, 8, 5, 20}==>10
         For ex: 4+6=10, 5+5=10, -10+20=10
         Arrays are fixed...
         if you are sure the size will not change you can use asList() but if you are not sure use lists syntax.
        */
        //To create a list, following syntax can be used but if you create the list by using the following syntax, you cannot use list methods change the size
        List<Integer> list= Arrays.asList(4, 6, 5, -10, 8, 5, 20);//==>shorter way to create a list but if you change the size or sth else don't use this way.
                                                                   //actually it is array but it will behave like list
        //list.add(222);//==>gives error. ==> UnsupportedOperationException==>java doesnt let me change the size
        //list.clear();//==>gives error ==> UnsupportedOperationException
        //list.remove((Integer)5);==> UnsupportedOperationException

        for(int i=0; i<list.size(); i++){  //4, 6, 5, -10, 8, 5, 20==>starting from idx"0"

            for (int k=i+1; k< list.size(); k++){ //for inner loop starting point is "1"
                //starting with the next index is required

                if(list.get(i)+ list.get(k)==10){ //i =0 and k=1==> 4 + 6 ==10 then the code will be executed

                    System.out.println(list.get(i) + " and " + list.get(k));
                }

            }


        }












    }










}
