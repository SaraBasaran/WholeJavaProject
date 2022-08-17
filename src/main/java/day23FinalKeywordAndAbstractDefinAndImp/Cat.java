package day23FinalKeywordAndAbstractDefinAndImp;

public class Cat extends Mammal{
    public Cat(){

        //super();  //==>go to the parent
        super(12); //if we put super() java complains. super() has to be the first line in constructor body.
                        //in a constructor body you can do just a single constructor call, multiple calls are not allowed.
        System.out.println("Cat constructor worked");

    }

    public Cat(boolean b){
        //super();  //this will direct to ==> Mammal class constructor without parameter is used==>super() without parameter is optional
                   // if you type your code will be more readable.
        System.out.println("Cat constructor with boolean parameter worked...");
    }


}
