package day26HashSet01;

import java.time.LocalTime;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet02 {


    /*
        Question: What do you do to store unique elements in natural order?
                  I use TreeSet
        Question: As you know TreeSet is so slow in adding and removing elements, what do you do to make it fast?
                  i)Create a HashSet
                  ii)Add the elements into HashSet
                  iii)Convert HashSet to TreeSet
     */

    public static void main(String[] args) {
               HashSet<String> hSet = new HashSet<>();
                TreeSet<String> tSet2 = new TreeSet<>();
                //1.Way
                int time1 = LocalTime.now().getNano();
                hSet.add("A");
                hSet.add("C");
                hSet.add("B");
                hSet.add("T");
                hSet.add("M");
                TreeSet<String> tSet1 = new TreeSet<>(hSet);
                int time2 = LocalTime.now().getNano();

                //2.Way
                tSet2.add("A");
                tSet2.add("C");
                tSet2.add("B");
                tSet2.add("T");
                tSet2.add("M");
                int time3 = LocalTime.now().getNano();

                System.out.println("HashSet + TreeSet: " + (time2 - time1));
                System.out.println("TreeSet: " + (time3 - time2));
            }
        }


//
//        //1.way
//        int time1= LocalTime.now().getNano();
//
//        HashSet<String> hSet = new HashSet<>();  //1.step==> we created a HashSet
//        for(int i = 1000; i>0; i--){  //gives numbers in descending order
//            hSet.add(i + "X");
//        }
//        TreeSet<String> tSet = new TreeSet<>(hSet);
//        int time2= LocalTime.now().getNano();
//        //that timing part is to see the diff. between time1 - time2
//
//        //2.way
//        TreeSet<Integer> tSet2= new TreeSet<>();
//        for(int i = 1000; i>0; i--){  //gives numbers in descending order
//            tSet2.add(i);
//        }
//
//        int time3= LocalTime.now().getNano(); //that part is to get time3-time 2
//
//        System.out.println("HashSet + TreeSet: " + (time2- time1));
//        System.out.println("TreeSet: " + (time3 - time2));
//