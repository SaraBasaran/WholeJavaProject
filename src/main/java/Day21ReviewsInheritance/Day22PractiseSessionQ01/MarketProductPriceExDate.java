package Day21ReviewsInheritance.Day22PractiseSessionQ01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MarketProductPriceExDate {

        String productName;
        double productPrice;
        String expirationDate;

        MarketProductPriceExDate(String name, double price, int monthLeft) {

            productName=name; //not static so the other will not be affected...
            productPrice=price;
            String expirationDate= LocalDate.now().plusMonths(monthLeft).toString();

        }

//        List<Arrays> product= new ArrayList<>();
//
//        List<Arrays> price= new ArrayList<>();

        MarketProductPriceExDate(String productName, double productPrice){
           this.productName=productName;
           this.productPrice=productPrice;

        }





}

