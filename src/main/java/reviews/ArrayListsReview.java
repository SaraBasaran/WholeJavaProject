package reviews;

import java.util.ArrayList;
import java.util.List;

public class ArrayListsReview {

    public static void main(String[] args) {

        /*
        1)Arrays are fixed in length which is not good but Lists have flexible length.
        2)Arrays can store just primitives and references of but Lists stroe non-primitives
        3)Arrays is faster than Lists
        4)Arrays use memory less than Lists
        Multidimensional term is valid for only arrays but not for Lists
         */

        //How to create a List
        //1.way=Mostly used
        List<Integer> al= new ArrayList<>(); //preferable
        //2.way=It is true to use
        ArrayList<Integer> bl = new ArrayList<>();
        //How to print a List on the console
        System.out.println(al); //just put its name.==> []it is empty list...no element in it.

        //While you create array it is automatically giving 0,0,0s but in list there is empty list if you dont put anything in it.
        //==>add() puts the el.s in insertio order. java will put the el.s in the list in insertion method.
        al.add(12);
        al.add(21);
        al.add(5);
        System.out.println(al);
        //add(index, element) puts any element into any index
        al.add(2,99);//==>99 will be added at index 2.
        al.add(88);

        //How to get the number of el.s in a List
        //For lists to explain the number of elements use "size()"...***

        int numOfEl= al.size();//==< we use size for finding the length of lists
        System.out.println(numOfEl); //5

       //How to get a spesific el. from a list by using index

        int el = al.get(3);//==> we used get() it gave [5], normally 5 is wrapper class el. why?? unboxing is done by java automatically auto-boxing
        System.out.println(el); //no need to convert wrapper class to primitive or vice versa.

        //Create a List and add even int.s between 13 and 51 in descending order.
        //We should use loops bec. there is repeated action
        List<Integer> cl = new ArrayList<>();

        for (int i=51; i>12; i--) {

            if (i % 2 == 0) {
                cl.add(i);

            }
        } System.out.println(cl);
        System.out.println(cl.get(6));
            //to get the 7th number from list we should use the index at the get ().

            //How to remove a specific element.
            List<String> dl= new ArrayList<>();
            dl.add("A");
            dl.add("C");
            dl.add("B");
            dl.add("E");
            System.out.println(dl); //[A, C, B, E] ==>in lists removing el.s is a big work for java. bec. of the index change
            dl.remove("C");      //When you remove an object java will change all other elements

            System.out.println(dl); //[A, B, E]

            //Create an Integer list and remove an element from the list

            List<Integer> fl = new ArrayList<>();
            fl.add(12);
            fl.add(21);
            fl.add(32);
            fl.add(45);
            //Remove 21 from the list
           //1.way

            fl.remove(fl.indexOf(21));//if remove () works with "indexOf" method...To remove a spec. el. in list use indexOf() inside the remove.
                                      //use fl.indexOf(21)
            System.out.println(fl);//[12, 32, 45]

            //2.way. To remove a spec. integer el. from a list convert it to wrapper class.
            //remove() uses primitive int, index () as listed method overload

            fl.remove((Integer) 32);//==>java will use un-boxing automatically to wrapper class==>type-casting
            System.out.println(fl);//[12, 45]

            /*If you have repeated el.s remove() removes just the first one.

             */

            List<String> gl= new ArrayList<>();
            gl.add("A");
            gl.add("C");
            gl.add("C");
            gl.add("C");
            gl.add("C");
            gl.add("B");
            gl.add("E");
            System.out.println(gl);
            gl.remove("C");
            System.out.println(gl); //[A, C, C, C, B, E] ==>in lists removing el.s is a big work for java. bec. of the index change
                                     //one of the "C" s is removed not all of them.


            System.out.println("======================================================");

        System.out.println("=======================================================" );
        //Create a String list add el.s into it remove the el.s end with "a" and starts with "M".

            List<String> gl2 = new ArrayList<>();

            gl2.add("Maria");
            gl2.add("Mandalena");
            gl2.add("Karenina");
            gl2.add("Mexico");
            gl2.add("Casablanca");
            gl2.add("Mana");

            for(int i=0; i<gl2.size(); i++){  //**for each loop cannot be used for this task bec.
                                               // for each loop java will not be able to decrease the number of index.

                String element= gl2.get(i);
                if (element.startsWith("M") && element.endsWith("a")){

                    gl2.remove(element);

                   i--; //after checking the 1. index, index 0, java will get into next index so we have to use decrement.
                         // If java decreases the index to do the task so your code should include in your coding this point.
                         //After removing any element Java decreases the indexes of "remaining" el.s That's why
                         //we are decreasing the value of "i"...
                }

            }
            System.out.println(gl2);



























































































































































































    }
















}
