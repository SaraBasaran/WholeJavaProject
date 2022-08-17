package Day21Inheritance;


   /*
   If we think about live creatures they all eat, drink and give sounds...

   Cat==> eat, drink, gives meow
   Dog==> eat, drink, barks
   Bird==> eat, drink, teews

   There are common features for all animal classes. We can put all common actions that do all animals in one class.
   After creating a class for bird we can add its common actions=methods to the animal (super) class.
   We can remove eat() from child class and get it from parent class. So they will have the same methods within them too.
   The Protected access specifier is visible within the same package and also visible in the subclass whereas the Default is a package
   level access specifier and it can be visible in the same package.

***Protected Access Specifier
Protected will acts as public within the same package and acts as private outside the package.
Protected will also act as public outside the package only with respect to subclass objects.
Protected fields or methods cannot be used for classes and Interfaces.
The Fields, methods, and constructors declared as protected in a superclass can be accessed only by subclasses in other packages.
The classes in the same package can also access protected fields, methods and constructors as well, even if they are not a subclass
of the protected member’s class.***

    */
public class Inheritance01Bird {




}
