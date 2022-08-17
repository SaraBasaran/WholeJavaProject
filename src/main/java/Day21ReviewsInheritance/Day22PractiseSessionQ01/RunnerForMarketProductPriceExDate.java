package Day21ReviewsInheritance.Day22PractiseSessionQ01;

public class RunnerForMarketProductPriceExDate {

    public static void main(String[] args) {

        MarketProductPriceExDate obj1= new MarketProductPriceExDate("Cheese", 10, 14);
        System.out.println(obj1.productName+ " " + obj1.productPrice+"$"+ " "+ obj1.expirationDate);

       MarketProductPriceExDate obj2= new MarketProductPriceExDate("Milk", 4.99);
        System.out.println(obj2.productName+" "+ obj2.productPrice+"$");

        MarketProductPriceExDate obj4= new MarketProductPriceExDate("Salt", 3.5);
        System.out.println(obj4.productName+" "+ obj4.productPrice+"$" + "expiration date");


    }




}
