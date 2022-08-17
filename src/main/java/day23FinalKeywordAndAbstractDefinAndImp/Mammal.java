package day23FinalKeywordAndAbstractDefinAndImp;

public class Mammal extends Animal{


    public Mammal(){
        super("Wooow!");
        System.out.println("Mammal constructor worked...");

    }

    public Mammal(int num) {
        super("Hi!");

        System.out.println("Mammal constructor with int parameter worked...");

    }

    public Mammal(String s){
        this(); //you want to call cons. from this class.==>without any parameters==> first cons. in this class is directing to "Wooow!"
                //as there is no parameter in this cons.
        System.out.println("Mammal constructor with String parameter worked...");
    }
}
