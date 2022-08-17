package day22Overriding;

 /*
    To be able to use overriding we need to create parent-child rela
    Without inheritance overriding is impossible
    ***What is the prerequisite of overriding?==>Interview question
    It is inheritance.

    eat(); is common for all. If a cat eat()==>sout==>Animals eat.
                              If that cat feed()==> sout==>(In mammal class)feed ()==>"Mammals feed their babies with their milk."

     When we talk about cats we should tell "Cat" not "Animal" or "Mammal".

     Using "Animal" or "Mammal" is not wrong but not good. We should update eat() like "Cat eats" not "Animal eat".

    Updating a method after getting parent class is called "METHOD OVERRIDING". To make a general method a specific method is called "method overriding".

    Access modifiers of overriding is same no problem.
    but if private acc. mod. no relation/inheritance. Private acces modifier can not be inherited.

                    Child        Parent
                    public       public
                                 protected
                                 default
                    protected    XXX public XXX

                    Access modifier of "Overriding Method" child class can not be narrower than the access modifier of "Overridden Method".
                    Parents' must be narrower.
                    Return type should not narrower than the parents return type.


     */

public class Animal  {
     public void eat(){

         System.out.println("Animals eat");
     }
     public Animal createAnimal(){ //to create an animal

         return new Animal(); //we made the return type as "Animal".Every class can be used return type as well.
                              // A Class can be 1) a class
                                            // 2)Data type for a variable
                                            //3) Return type in a method ==>like a person can be a president a father and a son at the same time.


     }



}
