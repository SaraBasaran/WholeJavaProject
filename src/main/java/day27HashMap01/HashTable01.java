package day27HashMap01;

import java.util.Hashtable;

public class HashTable01 {

    /*
    //HashMap is not thread-safe and not synchronized.Bec. of that java created "hashTable".
    What is the diff. between hashMap and HashTable?
    1)HashTable is thread-safe and synchronized (but HashMap is not thread-safe and synchronized)
    2)HashTable puts the ele.s in random order (As you know hashMap puts the ele.s in random order too)
    3) HashTabele does not allow using "null" neither in key nor in value part.
    4)HashTable is slower than hashMap bec. it is thread-safe(has to deal with multi threads) and synchronized
    and always has to check the ele. not to be "null".

     */
    public static void main(String[] args) {

        Hashtable<String, Integer> ht=new Hashtable<>();

        ht.put("Tom", 3);
        ht.put("Hanks", 5); //{Tom=3, Hanks=5}

       // ht.put(null, 0); //gives NullPointerExceptionError bec. hahstable does not accept "null" value.
       //ht.put("Tom Hanks", null);////gives NullPointerExceptionError bec. hahstable does not accept "null" value.
    System.out.println(ht); //gives NullPointerExceptionError bec. hahstable does not accept "null" value.
        //In hashMap you can use "null" you can put in value part more than one but in hashtable you can not use.
        //If we are asked "when do you need hashtable?
        //If the task requires to use multi-thread in Map we can use it.Bec. hashMap doesnot let you use multi-thread





    }










}
