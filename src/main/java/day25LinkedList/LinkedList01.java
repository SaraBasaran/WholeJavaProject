package day25LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

    /*
    Using indexes are like having the address of the array element.
    arr[12, 5, 7] ==>array list are very successful in search operations bec when you type index
    array will give directly ahwt you are looking for. But array list are not good at adding or removing
    el.s.

    array list==> [ 12, 5, 7, 11, 25]==> here when you remove 5 from here all the existing indexes aill change
    if we have 1000 elements in array list if we remove just one of them the remaining 999 el.s will be indexed again...
    If we remove one more the indexing will be done again and so on.
    Also if we add an el. into the list all ele.s should be re-indexed agaian...
    To put a single ele. you have to re-index all ele.s

    To make add& remove easier for java, java created "LinkedList". For adding and removing ope.s use "LinkedList".
    When you create LinkedList java will create 2 parts for each ele.==> one for the element itself (value) and next to
    it its pointer for the following ele. Every ele. has a pointer part for the ele. next to it. For the very last ele. it has
    a pointer for a "Null" and for the very beginning ele. it has a "head" which is readily pointing to the first ele.
    Bec. of that strcuture its name is "LinkedList" all ele. part is like a vagoon and they are linked with the pointers.

    In a Linked list for elements we have two parts first part is for the value/data type/element second part is for the
    pointer part we say to this two part element structure ==>Node

    Pros & Cons
    **For search ope.==>LinkedList don't use indexes, if you want to find an ele. you need to check every ele.
     by one by this is so slow. Linked Lists are not successful in search operations bec. Linked List does not use "indexes", to find
     an ele. you should find the previous element and so on...
     **Linked Lİst are succesfull in removing operations, as java does not use indexes for LinkedList, if we remove a node from the LinkedList
     java will find the node and remove it and its previously addressing pointer java will create a new pointer for following node
     and will not touch other elements.
     **To add a node in existing LinkedList, java will break the place of addition and delete the old existing pointer and create a new pointer
     for the added node.

     head ==> 97 -pointer part ==> (if we add 8 here java) 8 -pointer for the foll. ele. ==> 15 -pointer for 21==> 21 pointer for ==> null
                                    will delete the pointer
                                    part and put new node
                                    and pointer for the following
                                    node.

             **here java worked with just two nodes. So Linked List are fast for adding and removing nodes.

     Till now we learned "Array Lists" and "Linked List"==> those are concrete classes.

     For Array List When we create a list we should type "ArrayList on the rigth part.If you can use the construstor
     from a class it means it is concrete.

     Linked List and Array List are lists. They have common characteristics...If two list have sth in common it
   means those common things should be put in a parent =>so those Arraylist and linkedlist has an interface
   Java created List interface and made it parent of ArrayList and LinkedList.
   Why did java make it interface? To be lists some characteristics are mandatory, so java put the mandatory
   characteristics in the interface to be a list.
  ( To be a human; a man and a woman both must have sth in common.
     If they do not apply some mandatory characteristics they will not be human.)

     to create a list the syntax is;

     List<String> list1= new ArrayList<>();
     or                                         ==>both syntax is possible
     ArrayList<String> list2=new ArrayList<>();

    The first way is shorter but when we come to the structure we use both ArrayList<>();on the right
    ==>bec. ArraysList is a concrete class and we can use the constructors from concrete class if we use
    constructor from interface "List" java will complain bec. in interfaces we can not have constructors.

    For the data type; if you want you can use data type from child class or from interface
    on the left part of the obj. creation syntax you can type
    List<String>
    or
    ArrayList<String>
    If you want to make your object more general use data type from "List"(interface) (I am Adam2s sonn)
     or ıf you want to make more specific you can use ArrayList<> from the child class.

     We have 2 options to create a list LinkedList(subclass) or List(superclass)...Data types can be chosen both from
     subclass or interface

     */

    public static void main(String[] args) {

//addAll method is for adding list into another list
//but with overloaidng methods in LinkedList we have more options

   LinkedList<String> linked= new LinkedList<>();
    List<String> list= new ArrayList<>();
    list.add("X");
    list.add("Y");

   linked.add("A");
   linked.add(0, "Bubble"); //we added B in index 0.
        linked.addAll(list); //we add list into linked==> addAll method with one parameter puts the ele.s to the end
                             //but there is one more addAll with index option.
        linked.addAll(1, list);//here we put list itself into linked element==>[B, X, Y, A, X, Y]
                                     //even if linkedlist doesnot use index when we type, java will accept the index and sct in the way it is asked
        linked.addFirst("K"); //adds the node to the first part
        linked.addLast("V");  //adds the ele. to the last part of the list

        System.out.println("Before removing: " + linked);  //[K, B, X, Y, A, X, Y, V]

        //removing operation in LinkedList

        //linked.remove();  //removes the first node and returns it to you

        System.out.println( linked.remove());  //[X, Y, A, X, Y, V] "K" node is removed

        linked.remove("X"); //object removal with boolean value . java will remove the first occurance of the ele.
                               //Removes the first occurence of the specified ele. from the list, it will return boolean
                               //==> true
        System.out.println(linked.remove("X"));
        //if we type a non-existing value from the list, java will tell false bec. it does not exist in the list...
        System.out.println(linked.remove("W"));// with boolean it will be printed false bec. there is no ele. as "W"...

        System.out.println(linked.remove(3)); //it will remove and return the ele.

        System.out.println(linked.removeAll(list)); //removes the list ele. from the linked list.For ex; if you have a student list and you wanrt to
        //remove some studen tnames if you want to remove you can easily remove those names from the list.

        linked.removeIf(t->t.length()<2); //if the condition is true java will remove the elements

        System.out.println("After removing node: " + linked);





    }







}
