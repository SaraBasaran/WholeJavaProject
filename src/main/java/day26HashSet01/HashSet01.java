package day26HashSet01;

import java.util.HashSet;

public class HashSet01 {

    /*
    1)When you see the word "Set" in java, it means no repeated elements or all elements are unique.
    **
    HashSet==> elements are unique
    TreeSet==> elements are unique
    When you need to store unique elements use Set.If you want to store email addresses for facebook users
    you need to use Set.
    2) "Set" is an interace and it has 3 concrete child classes.
    a) HashSet
    b)LinkedHashSet
    c)TreeSet==>elements sorted (put in natural order)

    a)HashSet==> i) It is the fastest set=>means has less features
                 ii) It does not put any elements in any order, elements will be in random order.
                 HashSet does not do any action for the elements just stores the elements
                 If you need natural order you should not use HashSet. For natural order put the elements
                 in TreeSet.
                 iii) All elements are unique
                 iv) HashSet allows to use just a null elements. Null cannot be repeated as well


     */

    public static void main(String[] args) {

        HashSet <String> hSet= new HashSet<>();
        hSet.add("A");
        hSet.add("Z");
        hSet.add("M");
        hSet.add("B");
        hSet.add("Y");
        System.out.println("First H: " + hSet.add("H")); //true means first "H" was added
        System.out.println("Second H: " + hSet.add("H"));  //"false" means second H could not be added.==> only unique ele.s are accepted
        System.out.println(hSet); //prints in random order==> [A, B, H, Y, Z, M]








    }



}
