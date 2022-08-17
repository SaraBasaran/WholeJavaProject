package day23FinalKeywordAndAbstractDefinAndImp;

public class HTruck extends Truck{
    @Override
    public void engine() {
        System.out.println("HTruck uses electrical engine...");
    }

    @Override
    public void fourWheels() {
        System.out.println("HTruck is super 4 wheels...");
    }
}
