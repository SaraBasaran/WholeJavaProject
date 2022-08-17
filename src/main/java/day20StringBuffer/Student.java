package day20StringBuffer;

    /* 1) OOP has 4 main principals.

    i)Encapsulation
    ii)Polymorphism
    iii)Inheritance
    iv)Abstraction
  **Those are used in framework. Framework is when you create an app you will need all these principals.

        2)Encapsulation means data hiding.

        Why do we need to hide data?
        a)Some info needs to be protected highly.SSN, password, username...
        b)Another reason for hiding data is to make your code readable...
        c)Other reason encapsulation gives usage flexibility

        3)How to hide data

        By using "private" access modifier, I can hide the data

        4)After hiding data how can you use it?

        After hiding the data by the help of the getters I can access to encapsulated data.

       Note: **Getter methods should have "public" access modifier
             **Its return type must be same with the data type of the variable
             **Getter methods are named like "get + Capitalized variable name". But if the data type is boolean variables are named like "is+subject name"...
             **Getter methods do not use any parameter bec. they return the value of existing variable.
         5)To do encapsulation follow the given steps in class part.

         1)Create private variables
         2)Create constructors you need.
         3)Create getters
         4)Create setters
         5)Create toString()

         Note: In this class getters and setters are called "Java Beans".

         7)If you donot create any setter the class will be "immutable class". Just by removing setter class you can
         create an immutable class.

         **If you remove getters no one can access to that data.

         **The other name of the default is package private

 */

public class Student {

    //1)Create private variables

    private  String name="Tom Hanks";

    private int age= 13;
    private boolean succesful= true;

    public Student(String name, int age, boolean succesful, boolean successful) {
        this.name = name;
        this.age = age;
        this.succesful = succesful;
        this.successful = successful;
    }

    public Student() { //Create the constructor you need
    }

    //Create a variable for student age, encapsulate it, create getter for it.


    //3)Create getters
    public int getAge() {
        return age;
    }
    //==>rigth click on this part, choose generate, click on getter and ok

    public String getName() {
        return name;
    }
// name variable is not accessible but by the help of getter() you can access it
//setters will update the values in one object...

        //Create a boolean variable for student success, encapsulate it,


    //Create setters
    public boolean successful=true;


    public boolean isSuccessful() {
        return successful;
    }
    public void setAge(int age){ //by using setter you can set the age value every year

        this.age=age;


    }
    public void setSuccessful(boolean successful){

        this.successful= successful;

    }
      //
    @Override //If you want to see object details on the console, create "toString()" method.
              //if you dont you cant see any details of the object
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", successful=" + successful +
                '}';
    }
}



