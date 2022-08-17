package day23FinalKeywordAndAbstractDefinAndImp;

public class RunnerClass {
    /*
    1)super() is used to call constructors from parent class.
    a) If the parent class has multiple constructors by the help of the parameters you can select any cons.
    b) Typing "super()" is optional but if you use super() with parameters you have to type them.
    c) super() must be in the first line in constructor body
    d) super() can be used just once in a constructor body

    2) this() is used to call constructors from the class itself.
      a) If the parent class has multiple constructors by the help of the parameters you can select any cons.
    b) Typing "this()" is not optional you have to type it with or without parameters.
    c) this() must be in the first line in constructor body
    d) this() can be used just once in a constructor body

    Note: this() and super() can not be used together in the same constructor body

    3) "super" keyword is used to select any variable or any method from parent class==> super(eat);==>cons to parent class
                                                                                         super.eat()==>the result of the method
                                                                                         super.x==> variabşe from parent class


   3)"super" keyword is used to select any variable or any method from parent class
     "this" keyword is used to select any variable or any method from the class itself

     Note: What is the difference between "this" and "this()"?
        "this" is used to call variable or methods,
        "this()" is used to call constructors from the class itself

    Note: What is the difference between "super" and "super()"?
        "super" is used to call variable or methods,
        "super()" is used to call constructors from the parent class

     */

    public static void main(String[] args) {
        /* Cat c=new Cat(); //Animal constructor worked...
                          // Mammal constructor worked...
                         // Cat constructor worked ==> constructors worked from top to down...

        */


       // Bird b= new Bird();  //Animal constructor worked...
                             // Bird constructor worked...

        //Cat c= new Cat();

        //Cat vanCat= new Cat(true);

        //Dog e= new Dog();


        //Dog f= new Dog(14);



    }
}
