package Day21ReviewsInheritance;

public class RunnerInhReview {
    /*
    1) "Private" class members(variables and methods) can not be inherited from Parent class (impossible to inherit)
    2) "Public" class members can be inherited from Parent class (always can be inherited)
    3) "Protected" class members can be inherited from parent class (can be inherited by another package by sub-classes)
    4) "Default" class members can be inherited only by the classes in the same package if you want to use that function then you should import the class
    of that function. (can be inherited from same package)

    Object Class is the parent of all classes.
    In java how many classes does not have a parent class?
    only one==> Object Class.

    "Single inheritance" ==> means having only one parent class.
    "Hierarchical Inheritance" ==> If a parent class has multiple subclasses is said "Hierarchical Inheritance".
    "Multi-level" inheritance ==> is to have multi subclasses under other classes.

     */

    public static void main(String[] args) {

        CatReview cat1= new CatReview();
        cat1.meow();
        cat1.eat();
        cat1.drink();
         cat1.weigth();

        DogReview dog1 =new DogReview();

        dog1.bark();
        dog1.eat();
        dog1.drink();


    }







}
