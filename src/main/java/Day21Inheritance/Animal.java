package Day21Inheritance;

import day20StringBuffer.Creatures;

public class Animal extends Creatures {

    //By using extend method we will have "parent class/ super class".The other classes (bird, dog and cat)
    //will be child class/subclass. Commonly used methods should be put in parent class and all child classes can reach
    //out to parent/core project's common function by this way less coding and maintenance are conducted.
    /*
    For ex; clicking on a button functionality is a common method.If devop puts click functionality on parent class
    the other classes cannot use it but as it is a common function required for every class, the shortest way to apply
     "clicking" functionality for all classes is to put that function in core/parent class.
     */

    public void eat (){

        System.out.println("Animals eat...");

    }

    public void drink (){

        System.out.println("Animals drink...");

    }
    public void move (){

        System.out.println("Animals move...");

    }











}
