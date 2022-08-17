package day29Exception02;

public class Exception01 {
    /*IllegalArgumentException==>argument is the value when you call a method
    Actual data when you use a method is called argument.IllegalArgument means you have an error when you
    use inappropriate arguments for the methods.For ex; when asking age of the user, the list of numbers
    should not include negative numbers in it.To stop the execution for the next parts of the app. we should type this exec.

    ** When do you use "throw" keyword?
       We can use throw keyword in specific methods.
       When we want to throw any Exception in a method body , we use "throw" keyword.
       You can use "throw" keyword many times in a method body.
       After using "throw" keyword you have to create an Exception object. because of that it is a must that for every
       method you have to use "throw" keyword in each method and create an Exception object from appropriate Exception class
       for "throw" keyword.

       ==> throw new IllegalArgument(); ("new" + "constructor")
     */

    public static void main(String[] args) {

        try{
            setAge(12);//12
            setAge(-12); //IllegalArgumentException

        }catch (IllegalArgumentException e){
            System.out.println("Ages can not be negative");
        }


    }
    public static void setAge(int age){

        if (age<0){
            throw new IllegalArgumentException(); //if we need to throw exception we create a new object from Illegal
                                                  //argument exception class.
        }else {
            System.out.println("The age is " + age);
        }

    }




}
