package day28Exception;

public class Exception04 {
    //1)try block can not be used alone, can be used with 1 or more catch block
     //2)try block cannot be used alone, can be used without "catch block" with "finally block".

    public static void main(String[] args) {
        convertStringToInteger("2314");
        //what if we put a string value.
        convertStringToInteger("1a");//NumberFormatException
        convertStringToIntegerThenDivideByGivenNumber("2314", 2);
        convertStringToIntegerThenDivideByGivenNumber("1a", 3);
        convertStringToIntegerThenDivideByGivenNumber("12", 0);//if you have multiple exception issues you can use multiple catch blocks


    }

    public static void convertStringToInteger(String s){
        //Integer.parseInt(s); //it will get the String and convert it to integer
        //System.out.println(Integer.parseInt(s) +1); //2315==> if it cannot convert to integer we can not do addition.

        try{
            System.out.println(Integer.parseInt(s) +1);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());//technical mesg.==>For input string: "1a"
        }

    }
    //how to handle multiple exceptions
    public static void convertStringToIntegerThenDivideByGivenNumber(String str, int num) {
        try {
            System.out.println(Integer.parseInt(str) / num);//from the first param. we can get NumberFormatException and from the second param. we can get
            //ArithmeticException.In a single method we can get more than one exception.

        } catch (NumberFormatException e) {
            System.out.println("Issue occurred in conversion");
        } catch (ArithmeticException e) {
            System.out.println("Issue occurred in division");
        }//In the first param.s there will be no exception issue but in the second param.s there will be exception.To handle exception
    }    //If you use multiple catch blocks java will use just one of them.
}
