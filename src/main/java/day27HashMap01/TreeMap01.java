package day27HashMap01;

import java.util.TreeMap;

public class TreeMap01 {

    /*
    1)TreeMap is not thread-safe and not synchronized**Tree means in natural order...
    2)TreeMap puts the ele.s in natural order acc. to the keys.==>when you want to create the list in descending
                                                                  order you may use treemap and then reverse the list
    3)TreeMap does not accept "null" in key part.
    4)TreeMap accepts multiple "null" in value part.
    If you want to forbid "null" in keypart and value?==>we have to use hashtable
    5)TreeMap is the slowest map==>Bec. has to check null or not and put the ele. in order.

    **We have "Map Interface" and it has 3 child classes
    1)HashMap
    2)Hashtable
    3)TreeMap
    Why did java put "Map" at the top of those?
    Bec. all of them are maps and have common features are stored in "map" (the rules)
    Unique keys are must for all maps that is why java put map as interface.

     */

    public static void main(String[] args) {

        TreeMap<Integer, String> tm= new TreeMap<>();

        tm.put(103, "Tom");
        tm.put(105, "Hanks");
        tm.put(104, "Tom Hanks");//{103=Tom, 104=Tom Hanks, 105=Hanks}==>puts the ele.s in ascending order/in natural order

        //tm.put(null, "Is it null"); //gives NullPointerException error

        tm.put(102, null); //{102=null, 103=Tom, 104=Tom Hanks, 105=Hanks}
        //in key part hashtable does not accept any null value but in value part it allows...
        tm.put(106, null); //you can put multiple null values in value part...
        System.out.println(tm);






    }











}
