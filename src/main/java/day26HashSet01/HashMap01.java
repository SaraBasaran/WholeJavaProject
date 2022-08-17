package day26HashSet01;

import java.util.*;

public class HashMap01 {

    /*
    Map==>very similar to dictionary structure
    When we type ==> Cat ==> explanation for cat
                     Dog ==> explanation for dog
                     Fly ==> explanation for fly
    In a dict. left part will be definitely unique. Like; (Unique)Cat= explanation.
                                                      unique key part   Value part - may be repeatedly

    When telling about countries populations;
     left part                  right part
    (Unique-Key Part)==>  USA = 400 ==>Value part-repeatedly
                           UK = 70

       Types of Maps

       1)Hash Map==>The Fastest type of Map. It has fewer features. Every element is unique means all entry is unique.
              Hash is "not-thread safe".
       2) HashMap is "non-synchronized".
       3) HashMap doesn't put entries in any order. Like HashSet order of the elements will be in random.
       4) YOu can use a single " null" in key part.
       5) You can use multiple "null" in values part on the right part.
     */

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Tom Hanks", 13);
        hashMap.put("Brad Pitt", 24);
        hashMap.put("Angelina Julie", 48);
        hashMap.put("Cuneyt Arkin", 55);
        hashMap.put("Alex De Souza", 33);

        System.out.println(hashMap);//{Alex De Souza=33, Tom Hanks=13, Brad Pitt=24, Angelina Jolie=48, Cuneyt Arkin=55}==>MAp uses curly braces

        //How to work with "key"s ==> keySet() gives you the unique key parts will let me set the elements.

        //Example 1: How many letters were used in all names?

        Set<String> keys = hashMap.keySet();

        int totalNumOfLetters = 0;
        for (String w : keys) {
            //System.out.println(w + "!");//to print all unique key parts with "!"

            totalNumOfLetters = totalNumOfLetters + w.replaceAll("[^a-zA-Z]", "").length(); //the number of characters

        }
        System.out.println(totalNumOfLetters);

        //How to work with "value"s
        //Example 2: Find the average age of the students

        Collection<Integer> values = hashMap.values();  //will give you just the values part
        double sum = 0;
        double average = 0;

        for (Integer w : values) { //values: 33, 13, 24, 48, 55 there are five ele.s they will be divided by five

            sum = sum + w;//we are adding ages into "sum"

        }
        average = sum / values.size(); //if we divide sum to size the result will give average of age
        System.out.println(average);

        //values() use method with all values

        //How to get a specific value

        Integer age1 = hashMap.get("Cuneyt Arkin");
        System.out.println(age1); //55

        //if we enter a non-existing ele. java gives "null" in hashmap
        hashMap.getOrDefault("Cuneyt ArkinXL", 0); //if "Cuneyt ArkinXL" does not exist give me "0"

        Integer age2 = hashMap.putIfAbsent("Angelina Jolie", 32);

        System.out.println(age2);  //if the element does not exist /absent hashMap will put the ele. into the map.

        //to get entry set one by one

        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet(); //every entry has two data first String second Integer.Entry data comes from Map
        //entry and stores into "Set" interface. Every entry is unique

        System.out.println(entries);  // [Alex De Souza=33, Tom Hanks=13, Brad Pitt=24, Angelina Jolie=32, Cuneyt Arkin=55, Angelina Julie=48]==>Collections
        //use brackets
        //Example 3: Get the initials of first 3 entries

        String initials="";
        int counter=0;

        for (Map.Entry<String, Integer> w:entries){ //all ele.s will be processed one by one

           initials= initials+ w.getKey().charAt(0);  //giving us the first char.
                                //Tom Hanks  ==> T
            counter++;
          if (counter==3){
              break;
          }

        }
        System.out.println(initials); //ATB

        //if we use entrySet() you can see all methods to work with for the keys and the values
        //to work with the keys we use keySet and for value part we use values().
        //keySet belongs to Set, values belongs to Collections, entryset belongs to Map.Entry.

        boolean exist1= hashMap.containsKey("Angelina Jolie"); //we will see boolean value, if the key part exists or not

        System.out.println(exist1);  //true

        boolean exist2= hashMap.containsValue(55); //true
        System.out.println(exist2);

        //replace after checking key and value

        hashMap.replace("Cuneyt Arkin", 55, 63); //if the old value does not match no updates done.
        System.out.println(hashMap);

         //replace after checking just key

        hashMap.replace("Alex De Souza", 57);  //{Alex De Souza=57,
        System.out.println(hashMap);


    }
}