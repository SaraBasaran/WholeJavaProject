package day27HashMap01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMap01 {
   /*
   Hashing tecnique creates unique coding for each value. If we put 'A' to the list java will take its ASCII value
   and put that element according to its own logic. For ex; if we have characters in key part like "AB" java
   will add ASCII value of the letters and put them according to its own logic. But what if "BA" comes to the list
    bec. their values will be same with "AB". No worries bec. java has its own logic and will give different value
    to "BA" due to their order and then put them in randomly to the list. "AB" and "BA" will not have the same values...
    */

    public static void main(String[] args) {

        Map<String, Integer> hMap= new HashMap<>();

        hMap.put("A", 12);
        hMap.put("B", 35);
        hMap.put("r", 6);
        hMap.put(null, 13);
        /*
        put() puts the ele.s acc. to hashCode() which java does automatically once java gets key value. Every
        time the map is created java gives 16 empty boxes (till idx 15) to put the data in map. Once the hashCode()
        is done the indexes will be defined by java with the help of the hashCoding technique bitwise operator.
        HashMap's construction is like LinkedList. Every index has 4 parts...
        First part==>ASCII Value part-hashCode() starts
        Second Part =>.Key part
        Third part=> Value part
        Fourth part=> pointer of the next element

              **null keyword can be put at index 0 only but it can have value in it at the same time
        65 - A - 12 - pointer for the next element but acc. to java one index can have multiple nodes in it
        and at the end of every node pointer points out the following node.This is the mechanism behind put().
        If you want 1 million nodes can be put in 16 boxes.But to increase efficiency java can create another 16
        boxes.The important thing here to know that how java identifies indexes (in Maps) and every index may have
        multiple nodes at the same time.If we want to get a node for ex. "A" from the list java will check first
        ASCII value then key then value part and then give the value of the key.In HashMAp, at every index java puts
         LinkedLists...and find the indexes of the keys and their values.

         */

          hMap.get("A"); //12 bec. key A has 12 as value
        hMap.get("r");//6

        //Type code to find the number of occurences of letters in a String.
        // "13, toms are phantoms?" ==>t=2, o=2, m=2,  =2 (spaces) s=2 and so on...==>requires map
        String s= "13, toms are phantoms?";

        //first remove punctuation marks and spaces and digits and symbols
        // s.replaceAll("[^a-zA-z]", ""); //if we just type in this way, our syntax will not be able to change the String value bec.String class is immutable
                                          //but if we assign this formula to s then it will work.
       s= s.replaceAll("[^a-zA-Z]", "");
        System.out.println(s); //tomsarephantoms

        //Get the characters one by one
        String [] letters=s.split("");  //after splitting create an String Array bec split() returns Array.
        System.out.println(Arrays.toString(letters)); //[t, o, m, s, a, r, e, p, h, a, n, t, o, m, s]

        //Count the occurrences==>Create a Map

        //Now we need to create a map to get a "key and value" structure.We tell to java first to check the letters and
        // if the ele. does not exist to put the keys into the map with the value "1".
        // For ex; At the first letter check and can not find element bec. the map is empty. But once java checks and does not see any ele. in the map,
        // we tell to java if the ele. does not exist put the ele. with value "1".
        // java will check if map has "t" or not java will see there is no "t" ele. (false bec. map empty) in the map so
        // java will put "t" with the value "1"==> t=1 (1 value) but if java finds repeated ele.s java will add +1 to key/ele.'s value by overriding the key.
        // For this process we need for each loop with a condition and with an adding operation
        //Our logic here is: Once you check the ele. and you see that there is no elemnt like this one add it to the map list with the value "1".
        // For the first adding make the value 1 and for the next addings increase the value by 1...

        Map<String, Integer> result= new HashMap<>();//we created a map "result" and should tell java to find the first value
                                                        //we put data types as "String, Integer" bec. of key and value parts.
        for (String w: letters) { //we create for each loop bec. for Arrays, we can use for each loop
            Integer numOfOccurrence= result.get(w);//then create a container for the number of occurrences ==>go to the result map and use "get()"
                                                   // find the value of "w".If it does not exist it will give "null".
            if (numOfOccurrence==null){ //if numOfOccurrence equals to null add it into "result" map with the value "1".
                result.put(w, 1);
            }else {
                result.put(w, numOfOccurrence+1);//otherwise if the ele. exist in map increase numOfOccurrence by "1"...
            }
        }System.out.println(result);  //{p=1, a=2, r=1, s=2, t=2, e=1, h=1, m=2, n=1, o=2}

        //HashMap is not thread-safe and not synchronized.Bec. of that java created "hashTable".





    }





}
