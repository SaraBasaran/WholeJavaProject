package day23FinalKeywordAndAbstractDefinAndImp;

public class Civic extends Honda{


    @Override  //overriding mandatory/abstract method is a must
    public void engine() {
        System.out.println("Civic uses 1.6 eco engine");
    }
}
