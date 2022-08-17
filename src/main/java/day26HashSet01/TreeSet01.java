package day26HashSet01;

import com.sun.source.tree.Tree;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {

    /*
    1)TreeSet is for starting "unique elements" in "natural order.
    2) TreeSet is very slow bec. of that we do not want to do adding and removing operations with TreeSet.

     */

    public static void main(String[] args) {

        TreeSet<String> tSet= new TreeSet<>();
        tSet.add("Apple");
        tSet.add("Mango");
        tSet.add("Orange");
        tSet.add("Palm");
        tSet.add("Apricot");
        tSet.add("Palm");

        System.out.println(tSet); //all elements in natural order ==> [Apple, Apricot, Mango, Orange, Palm]
        //Repetition not allowed in TreeSet..

        tSet.subSet("Apricot", "Orange");


        TreeSet<String> sub1= (TreeSet<String>) tSet.subSet("Apricot", "Palm"); //First inclusive 2. exclusive

        System.out.println(sub1); //[Apricot, Mango, Orange] ==> not putting Palm ele. it is exclusive

        TreeSet<String> sub2= (TreeSet<String>) tSet.subSet("Apricot", false, "Palm", true);

        System.out.println(sub2); //[Mango, Orange, Palm]

        //for subSet method java uses overloading same name with diff. parameters
        //ceiling() returns the element after the given element. If the element does not exist, it returns
        // the given element.

        tSet.ceiling("Mango"); //ıf we want to see what is the next ele.
                                     //the element after mango is orange

         String el1= tSet.ceiling("Nancy");//==> Orange
        System.out.println(el1);

        String el3= tSet.ceiling("Man");
        System.out.println(el3); //Mango

        String el2= tSet.ceiling("Mango");
        System.out.println(el2);//Orange

        String el4= tSet.floor("Nancy"); //returns the previous element acc. to alphabetical order if the element
                                           //does not exist.
        System.out.println(el4); //Mango bec. nancy doesnot exist

        //if the element exist it returns the given element

        String el5 =tSet.floor("Mango");
        System.out.println(el5);//Mango gives the given name

        //[Apple, Apricot, Mango, Orange, Palm]
        //headSet() returns the ele.s from the beginning to the given element(exclusive)

       // tSet.headSet("Orange","")
        TreeSet<String> sub3 = (TreeSet<String>) tSet.headSet("Orange"); //from beginning element to the end
        System.out.println(sub3); //Apple, Apricot, Mango

        SortedSet<String> sub4= tSet.headSet("Orange", true);
        System.out.println(sub4); //[Apple, Apricot, Mango, Orange]

        //headSet gives from the beginning element to the end

        //tailSet() returns the ele.s from the end to the given element(inclusive)
       SortedSet<String> sub5= tSet.tailSet("Mango");
        System.out.println(sub5);

        tSet.tailSet("Mango", false);
        System.out.println(sub5); // from [Orange, Palm] as we typed false then java will not give Mango











    }














}
