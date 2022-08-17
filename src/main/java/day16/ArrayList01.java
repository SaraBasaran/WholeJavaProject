package day16;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {


    public static void main(String[] args) {

        /*
        1)Array list has no limits. After typing, you can enhance the array list. If you are sure that you will have limited
        number of elements you should use arrays only but if not you should use array lists.They are flexible.
        2)Arrays are fixed in length which is not good but Lists have flexible length
         3)Arrays can store only primitives and references but Lists store non-primitives
         4)Arrays use less memory than Lists.
         */

        //How to create a List(ArrayList)
        //1.way:Mostly used

        List<Integer> al= new ArrayList<>();

        //2.way:

        ArrayList<Integer> bl= new ArrayList<>();

        //How to print a list on the console.

        System.out.println(al);//just the name of the list. It is going to give us an empty list.==> []
                               //from here we can understand that it has no capacity

        //How to add elements into a list

        //add() puts the elements in insertion order, which one is going to be added first, it will be next in the listed
       //listeye element ekleme yapıyoruz addition operation değil...

                al.add(12);
                al.add(21);
                al.add(5);
                System.out.println(al);//[12, 21, 5]

                al.add(2,99);
                al.add(88);
                System.out.println(al);

                //How to get the number of elements in a list
                //
                int numOfElements=al.size();//5
                System.out.println("numOfElements: "+numOfElements);

                //How to get a specific element from list by using index

        //How to get a specific element from list by using index.
        //WE have "get()" ==> al.get(1);
                int el=al.get(1);
                System.out.println(el);

                //Create a list and add even integers between 13 and 51 in descending order
                //Then print the 7th element on the console

                   List<Integer> cl = new ArrayList<>();

                   for (int i=51; i>12; i--){

                       if(i%2==0){

                           cl.add(i);
                       }
                   }
        System.out.println(cl);
        System.out.println("7. element is: " + cl.get(6));

        List<String> dl= new ArrayList<>();
        dl.add("A");
        dl.add("C");
        dl.add("C");
        dl.add("C");
        dl.add("B");
        dl.add("E");
        System.out.println(dl); //[ A, B, C, C, C, E]
        dl.remove("C");
        //If you have repeated elements in List, remove () removes the first one.
        System.out.println(dl); //[ A, B, C, C, E]

         //Example: Remove 21 from the list

        List<Integer> fl = new ArrayList<>();
        fl.add(12);
        fl.add(21);  //==> we will remove this one by using index...
        fl.add(32);
        fl.add(45);
        System.out.println(fl); //List itself
         //1. way: To remove a specific element use "indexOf" inside the remove.
        fl.remove(fl.indexOf(21));//I will 21 even if the index of 21 which is 2 in case any other insertion is done.

        System.out.println(fl);

        //2.way:

        fl.remove((Integer) 32);

        //Task: Create a String list add elements into it then remove the elements start with "M" end with "a".

        List<String> gl = new ArrayList<>();
        gl.add("Maria");
        gl.add("Marina");
        gl.add("Cate");
        gl.add("Mehmet");
        gl.add("Carina");
        for (int i=0; i<gl.size(); i++){
            if (gl.get(i).startsWith("M") && gl.get(i).endsWith("a")){

                gl.remove(i);
                i--; //if we do decrement the whole list index will start from '0' again.
            }
        }
        System.out.println(gl);



















    }



















}
