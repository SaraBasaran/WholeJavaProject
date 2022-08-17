package day24Interface;

   /*
   You can not create object from interfaces.
   Interfaces do not have constructors but remember "abstract classes" have both astract and concrete methods.
    */

   /*
   If parent class has many methods in it, it will be so large and slow. Bec. of that that structure
   is not preferable. To solve this problem Java developed interfaces which has an atomic structure in them/
   smaller pieces move faster. But what if a subclass needs to get methods from multiple parent class??
   For java, multiple inheritance is not supported but sometimes to maintain atomic structure of the classes' java
   created interfaces and by the help of interfaces, a subclass may have multiple superclasses.
   For classes multiple inheritance is not supported but for interfaces java supports multiple inheritance.

   Interfaces are not classes they have diff. structures.Interfaces support multiple inheritance.Interfaces are
   like relatives like having uncles, aunts and cousins at the same time. In an interface you may put variables
   or methods but when put they have to be static final and public.
   Protected or default or private are not accepted.

   Variables:

   1)Every variable is "public", "static" and final in interfaces.
   2) Mostly we do not type "public", "static", "final" explicitly because it is well known by everyone.
   If you want to type "public", "static", "final" explicitly to make your code more readable.

   3)"final" variables must be initialized bec. of that every variable must be initialized in an interface.
   4)If you have same variables whose signatures are same in parent interfaces, when you call them you have to declare
   the name of the interface otherwise java will give error.
   **Once we need a variable from interfaces with the same name, we can choose the variable acc. to the sourcing interface
   For ex; if we need a variable that has a same name variable from HondaEngine interface==>
    HondaEngine.variable==> will give us the variable from HondaEngine interface not from others
   If we donot choose interface to get the variable having the same name java will give error bec. there are multiple variables
   in multiple interfaces, java does not know which one to choose.We should tell java which one will be used from interfaces.
   here every super class has same variables.
   If variable names are unique then no need to type interface name

   */
public interface HondaAC {  //if subclasses don't override the abstract methods from super class java gives CTE.

    public final String make="Samsung"; //variable doesn't accept any other acc. mod. other than public
                                         //even if we type or not every variable is static
                                          //even if we type or not every variable acc. mod. is public java knows that they are static and public

      double price= 890.00;

       /*
       For Methods in interfaces==>
       1) All methods in an interface must be abstract.
       2)Using "abstract" keyword for methods is optional in interfaces
       3)All methods in an interface must be "public".
       4) Normally we can not put methods in interfaces but java created "default method", you can use them in an
        interface default methods have body.
       Subclasses will override any same method from interfaces==>any cool(); from Interfaces. When we use interfaces
       if there are methods having same name;
       subclass will override anyone of them. There will be no problem.
       When you use interfaces as parents you may put same methods in interfaces. There will be no problem.

        b) "static" keyword is for creating a method with body in interfaces.

        */

       public  void cool();

       void run();

       //"default" over here is not acc. mod. it is for creating a method body in an interface.
       public default void bacteriaKiller(){
           System.out.println("This AC kills %99.99 of bacteria");
       }

       //by using "static" keyword, you can create method with body in an interface.
       static void climateCool(){
           System.out.println("This AC cools according to the climate");
       }




}
