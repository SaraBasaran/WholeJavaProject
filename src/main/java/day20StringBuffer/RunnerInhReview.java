package day20StringBuffer;

import Day21ReviewsInheritance.CatReview;
import Day21ReviewsInheritance.DogReview;

public class RunnerInhReview {
    /*
    1) "Private" class members(variables and methods) can not be inherited from Parent class
    2) "Public" class members can be inherited from Parent class
    3) "Protected" class members can be inherited from parent class
    4) "Default" class members can be inherited only by the classes in the same package if you want to use that function then you should import the class
    of that function
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
