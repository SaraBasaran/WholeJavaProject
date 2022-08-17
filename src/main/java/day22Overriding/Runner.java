package day22Overriding;

public class Runner {
    /*
    /*
        1)"Method Overriding" means updating "method body" to make the implementation specific for the "Child Class"
        2)Mostly we do not touch "access modifier", and "return type" of the "overridden method"(The method in the parent class)
        3)In "Method Overriding", method name cannot be changed.
          If you change the method name it means you are creating a new method
        4)Inheritance is prerequisite for "Method Overriding". If there is no parent-child relationship,
          there will be no "Method Overriding"
        5)The method in child class is called "Overriding Method"
        6)Access modifier of "Overriding Method" cannot be narrower than the access modifier of "Overridden Method"
        7)Return Type cannot be narrower than the data returned
        8)Return type of "Overriding Method" cannot be wider than the @Override
        Note: Normally return type can be "Object" everytime but in "Method Overriding" it can be the return type of the "Overridden Method" at most.
        Example: The return type of the "Overridden Method" is Mammal.
                 What can be the return type of the method produces a Dog object ==> Dog and Mammal ==>you cannot use Object as return type here.

                 *****If you make a method "final", it means the method body connot be updated. In overriding we should updaate the method body
                 but final teels us you cannot update final method . Java does not let us to update if we type final next to method name.

               ***If you type "static" keyword in the method line ==> CTE bec. static things are common for all. If you let any child classes to update
               a static method, then all other classes will be affected. "static" methods are common for all objects, if you update the body by "Overriding"
               other obj.s will be affected from that. To protect other objects' consistency, Java does not let you to override "static method".

               **main methods are also static so we can not override main methods too.
               **Between the return types we should have parent - child relationship.When you use "primitive data types" in overriden methods==>in parent
               class, you cannot change the return type in overriding method - child class. When you use “primitive data types” in “Overridden Method”,
                you cannot change return type in “Overriding Method”
     */
              /* Same rule is valid for “void” return type as well.
               When you use “Wrapper Classes” in return types, you cannot change it to another “Wrapper Class” because Java did not create
               “parent-child” relationship between “Wrapper Classes”


              Method Name and Parameters are called "Method Signature".

              Static, Private and Final methods can not be overridden but they can be overloaded...

              If we donot type @Override, then java will not check if the methods are same or not . Java will think in every class there are different
              methods.
              But we put annotation sign to let Java check the correctness of our method overriding and overridden rules.
              We can override the methods between parent - child classes even if we donot type @Override but that time there is risk
              so it is better for us to let Java check the rules method names acc. mod.s and return types are all matching to apply overriding.
              In overriding, child classes acc. mod. can not be narrower than ğarent class' acc. mod.

     */






    public static void main(String[] args) {

     Cat cat1=new Cat();
     cat1.eat(); //Cats eat

     Dog d= new Dog();
     d.eat(); //(Animals eat + Dogs are animals so they eat as well)
               //by using super. ==>super keyword means "parent class" ==> go to the parent find eat method and then execute it
    }



}
