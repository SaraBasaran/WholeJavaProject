package day14;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Day14ForEachLoop02 {

    public static void main(String[] args) {

        //Sort the array elements according to their lengths
        //["Michale", "Ali", "Maria", "Veli"] ==> "Ali" - "Veli" - "Maria" - "Michael"
        //İf the character has less char.
       String arr[]= {"Michael",  "Ali", "Maria", "Veli"};
       System.out.println(Arrays.toString(arr));//["Michale", "Ali", "Maria", "Veli"]

        Arrays.sort(arr, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(arr));//"Ali" - "Veli" - "Maria" - "Michael"

        //Sort the array elements according to their lengths in descending order.

        String brr[] = {"Jackson", "Tom", "Dustin", "Mary", "Mariam"};
        Arrays.sort(brr, Comparator.comparingInt(String::length).reversed());//reversed method will put the numbers in descending order
        System.out.println(Arrays.toString(brr));


        //Sort the array elements in descending order acc. to their lengths.
        //If some elements are in the same length put them in alphabetical order
        //["Jack", "Mark", "Adam", "Jackson", "Marry, "Junior Thompson"]

        String crr []= { "Jack", "Mark", "Adam", "Jackson", "Marry", "Junior Thompson"};

        Arrays.sort(crr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        //after adding natural order java will give alphabetical order.
        System.out.println(Arrays.toString(crr));

        //Note:"natural order" means "alphabetical order" for Strings and "ascending order" in numbers.













    }























}
