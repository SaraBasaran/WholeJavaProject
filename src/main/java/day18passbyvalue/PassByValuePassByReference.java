package day18passbyvalue;

public class PassByValuePassByReference {


    public static void main(String[] args) {

        /*
        If you are selling a shirt for $ 100 and if you do discount for stu.s 10% yhen the shirt price will be 90 usd
        If you do discount for veterans 20% the shirt price will be 80 usd
        If you do discount for Seniors 5% then the shirt price is 95 usd.

        Discounts should not affect initial price.
        We have to protect the initial value.
        Java protects the first given price by PassByvalue.

        1)Java creates copy of values in method calls to protect original value of the variables.
        That process is called "PassByValue". In every status Java protects the first value.The process can be done in stack or heap
        memory as it may include prim. or non-prim. data.

        2)PassByReference: For some other prog. lang.s; just the reference of the value is copied and do the actions on original value
        but java does not use this way. PassByValue is characteristics of Java but some other programs use PassByReference process and
        using the references of the value has risks and using the copy of the reference will take you to the same address of the value and will make the
        change over the original value , which we do not want to happen actually...The original value should be protected.

        By the help of the "Pass By Value", we are able to protecet original value.
        3)Some programming lang.s may use "Passby reference", if you use it, be careful about protecting original values.





         */

      int shirt=100; //java creates a copy of this variable value and processes the discount over the copied value
                     //this is called PassByValue
      doDiscount("veterans", shirt); //java used shirt variable's copy to do discount.
        System.out.println(doDiscount("veterans", shirt)); //80
        System.out.println(doDiscount("students", shirt));//90
        System.out.println(doDiscount("seniors", shirt));//95

        String greeting= "Wooow";

        addExclamaitionMark(greeting);
        System.out.println(addExclamaitionMark(greeting)); //Wooow!
        System.out.println(greeting);//copy will be put inside the method==> Wooow==>Pass by value



    }

    public static int doDiscount(String status, int price){//this is the method to count the discount

        switch (status){

            case"students":
                price= price-10;
                break;
            case "veterans":
                price= price-20;
                break;
            case "seniors":
                price=price-5;
                break;
            default:
                price=price;

        }
        return price;

    }

    public  static String addExclamaitionMark(String greetings){

        return greetings + "!"; //we are using non-primitive data.


    }








}
