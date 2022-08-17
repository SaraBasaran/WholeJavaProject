package day28Exception;

public class Exception03 {

    public static void main(String[] args) {

        String str= "Java is easy";
        getNumOfCharsInString(str);//12

        String st="";
        getNumOfCharsInString(st);//0

        String s= null; //diff. from "";
        getNumOfCharsInString(s); //NullPointerException==>RTE**If you use length() with "null" you will have an Exception
                                   //so we should type try catch.


    }
    public static void getNumOfCharsInString(String s){
        try {
            System.out.println(s.length()); // length() can be used with Strings having multiple characters and even empty String but null is diff.
                                           // from the others
        }catch (NullPointerException e){    //if you use length() with null it throws "Exception" //you can use RuntimeException class too...
            System.err.println(e.getMessage()+ "length() was used with null String"); //this is very important to log the error with a message bec. managers
                                                                                      //are checking all the app codes from the beginning to the end to see
            //if there is any prob. in the app. when he runs the codes in the app. you will have many mesg.s on the console it can be 200 pages
            // if you follow what happened in the app. that kind of mesg.s in the app. are so important to log the code with these mesg.s
            // otherwise manager has to read 200 pages every morning.
            //We need to put logs after every method/output of the method. For ex; when we type a code to add numbers==>first typr the codes for addition
            //and then add logs==> output mesg.s like; "Addition was done successfully". One code one log one code one log should be
            // followed for each step of coding.
            //if in the intv. they ask you what is NullPointerException give us some examples?
            // you can say if a String is "null" when we use length() with it java throws NullPointerException.We should put
            // try-catch method and log my code for "null" pointer exception. NullPointerException is a subclass of RTE and over it Exception.
        }
    }









}
