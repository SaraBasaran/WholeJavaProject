package day22Overriding;

public class Cat extends Mammal{


    @Override
    public void eat(){

    System.out.println("Cats eat");
}

//    @Override  //Inside the class, right click and select generate and then overriding methods and select the createAnimal();
//    public Animal createAnimal() { ==>we cannot put here return type as "Mammals"...
//        return super.createAnimal();
// ****Be careful while creating the object about the return type bec. return type can not be narrower than the data type of the returned
// All mammals are animals but all animals are not mammals...
//    }

    @Override
   public Animal createAnimal(){

        return new Cat();  //smaller classes can be put inside the parent/bigger classes
   }




}
