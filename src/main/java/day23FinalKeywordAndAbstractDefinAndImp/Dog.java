package day23FinalKeywordAndAbstractDefinAndImp;

public class Dog extends Mammal{

    public Dog(){
        super(11); //it will direct us to "Mammal " class constructor with int parameter

        System.out.println("Dog constructor worked");
    }

    public Dog(int x){
        this(); //java will come cons. without param it is used is
        System.out.println("Dog constructor with int parameter");
    }

}
