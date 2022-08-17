package day22Overriding;

public class Dog extends Mammal {
    @Override
    public void eat() {
        super.eat();//Animals eat
        System.out.println("Dogs are animals so they eat as well");//we are using the method from parent as it is and then we are adding sth to it by
                                                                   //using super.methodName().
    }
}
