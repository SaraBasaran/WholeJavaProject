package day23FinalKeywordAndAbstractDefinAndImp;

   /*

   1) If you do not put body for a method it will be abstract method.
   2) To make a method "abstract" you have to use "abstract" keyword before the return type
   3) Abstract methods can not be put into a regular/concrete class, when you create an abstract method you have to make the class "abstract" too.
   4) To make a class abstract use abstract keyword before the class keyword.
   5) The method without body is called "abstract", the method with body is called "concrete/regular" method...
   We are concrete but angels are abstract...
   6) Concrete child classes must "override(implement)" abstract methods from all parent classes, otherwise
    Java gives CTE. It is not mandatory for "abstract child classes".
   7) Abstract classes may have both abstract methods and concrete methods. Bec. parents are telling to their kids sth is mandatory and sth not mandatory.
   8) If you want to make a functionality mandatory for all "concrete child classes " make the method "abstract" in parent class.

    9) Can we make an "abstract class" final class?

    No. Bec it is not possible to make an abstract class final class.Final classes cannot have child classes but
    we create "abstract classes" to do something mandatory for child classes. This is contradiction bec. of that
    Java does not allow to make an abstract class final class.

    10) Abstract method were created to "override", if you make an abstract method private it can not be overriden.Therefore, Java does not allow to make
    an abstract method "private".

    11) We cannot create objects from "abstract classes" because "abstract classes" have sth un-completed like
     "abstract method"==>no cons. ==> curly braces no body

     Note: Abstract classes are classes , therefore they have "constructors", but the constructors cannot create objects.
     "Abstract classes" are created just for child classes to override/use.

     12)If any abstract method was overridden by any "concrete class (A)", it is not mandatory to override the abstract method for the
           concrete child classes of the "concrete class (A)"

*/
public abstract class Honda {

    public abstract void engine();  //mandatory method

    public void musicSystem(){  //optional method
        System.out.println("The most updated music system...");
    }




}
