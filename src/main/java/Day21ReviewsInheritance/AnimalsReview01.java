package Day21ReviewsInheritance;

import day20StringBuffer.Creatures;

public class AnimalsReview01 extends Creatures {

public void eat(){  //if we change acc. mod. to private it will be invisible to other classes.
                     //if we change acc. mod. to "protected" it can be seen by subclasses.
                      //if we convert acc. mod. to "default" or not type any acc. mod. you should import that class
                      //in "default" acc. mod. you cannot reach out to the common functions
    System.out.println("Animals eat...");
}
public void drink(){


    System.out.println("Animals drink...");
}




}
