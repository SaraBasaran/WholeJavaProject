package day28Exception;

public class Exception05 {

    public static void main(String[] args) {

        String str= "I love Java";
        getCharacterFromStringByIndex(str, 4);  // v

        String st= "I love Java";
        getCharacterFromStringByIndex(st, 12); // StringIndexOutOfBoundsException
                                                     //Non-existing index was used
        String s= null;
        getCharacterFromStringByIndex(s, 0); //NullPointerException
                                                 //The other exception occurred
    }
    public static void getCharacterFromStringByIndex(String s, int idx){

        try {
            System.out.println(s.charAt(idx));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Non-existing index was used");
        }catch (RuntimeException e){
            System.out.println("The other exception occurred");
            /*
            If we put parent class exception first and then here "StringIndexOutOfBoundsException" is child and
             "RuntimeException" is parent class. From the top exc. are raining so the bigger parent class gets
             all the exception issues by this way sub-class can not be used bec. all the problematic issues will be handled
             by bigger class. If you put parent class first at catch block java will complain bec. it will not use any
             or no need to use sub-class from exception classes any more.Java doesnot like this way.If you want to handle
             multple exceptions with multiple "catch" blocks then you need to type  subclass first and then parent class
             to the end/bottom.

             Note: If there is parent-child relationship between Exception Classes and you need to use multiple
             catch blocks make the child class first otherwise you will get CTE.
             */
        }
    }

















}
