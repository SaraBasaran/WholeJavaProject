package day28Exception;

public class Exception01 {


      /*
    1)Exception is unexpected situation.When exc. happens you cannot go forward and everything stops.

    When java gives Exception error actually it asks for help...If we help java to save from being stuck
    it means we handle exception.
    2)There are 2 ways to work with Exceptions
    a) Throw exception==>Ask help**can be done by devops or java does
    b) Handle Exception==>Do it by yourself without asking help**the most important point...

    3)Mainly, there are two types of Exceptions
    a)Runtime Exceptions==>getting exception after running the codes
    b)Compile Time Exception==>you see them while you type your code




     */


    public static void main(String[] args) {

        divide(12, 3); //4==>no exception
        divide(0, 3);  //0
        divide(12, 0);  // RTE==>throws ArithmeticException//In math you can not divide a number by "0" so java throws exception==>/ by zero
                              //shows us the details about the line uf the error.

        /*In an interview, they will ask what is an Exception and its types..When you try to do sth in Math, you will get "ArithmeticException"
        For ex; when you try to do sth with squareroot with negative numbers you will encounter with "ArithmeticExceptions" many times
         */

    }
//
//    public static void divide(int a, int b){  //in general practice we name the methods with "verb" forms...Do not name in noun forms.It should have an action
//        System.out.println(a/b);
//
//    }
    public static void divide(int a, int b){  //in general practice we name the methods with "verb" forms...Do not name in noun forms.
                                             // Bec. It should have an action

        try{
            System.out.println(a/b);  //here we should tell java "try" this method and if you "catch" the issue give user that msg.
        }catch (ArithmeticException e){ //"ArithmeticException==> class name and e==>parameter(object) name**when we create a method we should type the class name
                                       // and the parameter==>inside the catch block we use class name and an object name
            System.out.println("A math rule was broken"); //for division with "0" or any rule not appropriate
                                                        // for math rules java will give msg==>A math rule was broken

        /*
        All math methods exceptions are in "ArithmeticException" class. But we can type those msg.s to non-technical people. If we want to type
        this exception to a technical person we should type ==>System.out.println(e.getMessage());it will tell the message from the console/by zero
         */
            System.out.println(e.getMessage()); //  in black==>/ by zero==>whatever the reason for exception prints on console for devops. and technical staff

            //Most of the times technical error mesg.s are red in console to do so instead of "out" type "err"

            System.err.println(e.getMessage()); //we type "err" to get the exc. in red bec. firstly; no need to focus on black lines which are error free
                                                //secondly; java puts "err" msg.s to another folder in your memory, if you want you can see just error msg.s
                                                //if you donot want to see msg.s in black or outputs without errors you can reach out to them from "err" files
           /*
           In an interv. they ask what do you do if your code does not work?
           I log the output. I look at the log. I can log the msg.s on the console.
            */
            e.printStackTrace(); //if you want to see the details in code issue use this method
            /*
            all in red==>/ by zero
           java.lang.ArithmeticException: / by zero
	       at day28Exception.Exception01.divide(Exception01.java:46)
	       at day28Exception.Exception01.main(Exception01.java:29)
             */




        }



    }















}
