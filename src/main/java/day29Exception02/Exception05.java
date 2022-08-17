package day29Exception02;

public class Exception05 {

    /*
    What is the difference between "Exception" and "Error"?

    When you get error in an app. there is nothing to do and app. stucks.
    Exceptions can be handled and the app. may go on working but when an error happens
    the app. stops/dies.

    1)Exceptions can be handled, your app can work after handling Exception
      Errors can not be handled, your app cannot work after getting any error
    Note: "Exception"s and "Error"s are the child of "Throwable"

    at the top there is "Object" class and under that "Throwable" class and then under it there are
    "Exceptions" and "Error"
    1) Exception==> a) RTE ==>NullPointerException, ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException,
                        IllegalArgumentException, ArithmeticException, NumberFormatException, ClassCastException

                    b) CTE ==> FileNotFound, IOException class

     2)Error ==> a) OutOfMemoryError==>occurs when Heap memory is full.You need to go back and check loops if
                                       infinite you need to change that coding
                 b)StackOverFlowError==>If you create too much primitive data your app. will not work
                 c)LinkageError==>when typing codes, classes will be dependent on other classes.Like Cat class will
                                  be dependent on Mammal class. When we create a parent class we have to link subclass
                                  to that parent class.During the runtime of dependent classes, java starts loading from
                                  bottom to the top if Cat class has an issue while loading then the parent class will
                                  have an issue too.This is called StackOverFlowError
             **Those are common errors.

      Now we will study "Custom Exception":We can create exceptions acc. to our need.Java does not put any limit for you
      about exceptions.When you work on an app. Architectures will decide which class will be parent class and which
      ones will be child class.In the app. devops types codes but coding may have risks so java lets us to type specific
      exceptions from "Custom Exception" class.
      For "Checked" Custom Exception class make it extend to Exception class.
      For "Unchecked" Custom Exception class make it extends to RuntimeException class.

      **We can create our own Exception Classes, they can be "Checked (CTE)" or "Unchecked(RTE)" exception.
        Checked==>java checks your code if has any errors
        Unchecked==>java checks after running the code.
        Benefits of Custom Exception
        a) To be able to create Custom Exceptions gives us flexibility
        b) To be able to create Custom Exceptions protect the app. from devop. mistakes


     */

    public static void main(String[] args) throws IllegalGradeException {

        //How to create "Custom Exception" Class we need to go to in the same page 2 classes.Here is we have a class
        //in the same page we can create "Custom Exception" class out of this class
//        int grade=120;
//        if(grade>100 || grade<0){                                                   //This is our own exception.
//
//            throw new IllegalGradeException("Grades must be from zero to one hundred");//Exception in thread "main" Grades must be from zero to hundred
//                                                                                   //at day29Exception02.Exception05.main(Exception05.java:54)
//
//        }else{
//            System.out.println("Your grade is " + grade);
//
            int age=-12;
            if (age<0){
                throw new IllegalAgeException("Age can not be negative");
            }else{
                System.out.println("Your age is " + age);

                /* The output:
                Exception in thread "main" Age can not be negative
            	at day29Exception02.Exception05.main(Exception05.java:63)

                 */
            }
        }
        /*
        What is happening here?
        Java comes to the first class part and checks the condition, if condition is not valid for the typed code
        we direct java to our exception class part.
        It was giving red underline for throw keyword, and we have to handle that issue we can choose "throws" Exception
        which is added into method signature-main method then it is giving the exception that we created under this class.

        By typing "throw new"  we create a new object and by putting constructor IllegalGradeException("Grades must be
        from zero to one hundred");.At this step we are telling java go to IllegalGradeException("Grades must be from
        zero to one hundred"); class and then use this constructor. the constructor is working with the message.java
        checks the message in IllegalGradeException("Grades must be from zero to one hundred"); class and then looks
        at the message it was null but we change the value of the message once the code works bec. we change message
        value with our Exception class message==>("Grades must be from zero to hundred");
        we put the message and the code according to our project requirement, and we put our exception class in the same
         page that we are planning to work with.

         */

    }

//How to create "Custom Checked Exception"
/*
    Steps to create "Custom Checked Exception"
   1)Make the class child of the "Exception Class"==>by adding throw keyword
   2)Use "String message" parameter in the "constructor"
   3)Create "toString()" method to be able to see the message on the console when the exception is thrown

 */
class IllegalGradeException extends Exception {

    String message;//null

    public IllegalGradeException(String message) {//use the message in this class
        this.message = message;
    }

    public String toString() { //prints the mesg. on the console
        return message;
    }
}
    class IllegalAgeException extends RuntimeException {  //not gives red underline

        String message;//null

        public IllegalAgeException(String message) {//use the message in this class
            this.message = message;
        }

        public String toString() { //prints the mesg. on the console
            return message;
        }
}








