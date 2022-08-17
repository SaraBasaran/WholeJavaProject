package day20StringBuffer;



    /*
    1) OOP has 4 main principals.

    a) Encapsulation     b) Polymorphism     c) Inheritance   d) Abstraction

    2) Encapsulation means "data hiding"...

    We do encapsulation to hide data for safety, readability and flexibility in using the app. When you see the hidden data in an open way
    then you may be distracted.

    What are the benefits of data hiding?

    a)Some data needs to be hidden like SSN, password, user name...
    b) By hiding some data we make our codes more readible..
    c) Encapsulation gives usage flexibility.

    3)How to hide data?

    By using "private" access modifier, I can hide the data.

    4)After hiding the data how can you use it?

   After hiding data by the help of the getters I can access to encapsulated data.

   5)How can I put the getters?==>
   Click on right button of the mouse over the private part of the class and select generate and then the getter and click on ok you get the hidden data.

   Note: getter() a) should have "public" access modifier.
                  b) Its return type must be same with the data type of the variable
                  c) are named like "get + Capitalized variable name"
                  d) do not use any parameter because they return the value of existing variable.

   6) After hiding the data how can you update it?

   After hiding data by the help of the setters I can update to encapsulated data.

    7)To do encapsulation follow the given 5 steps
    1.Create private variables
    2.Create construtors you need
    3.Create getters
    4.Create setter
    5.Create toString()

    Note: In this class, getters and setters are "  Java Beans".

    **If we remove setter from here then the data will be "immutable".

   8) If you do not create any setter() then the class is "immutable".
   **If we donot want anyone outside the class to see the details then donot create getters...

   **instance variables==non-static objects
   **package private== default

     */

public class EncapsulationStudentReview {

    //1) Create private variables

    private String name= "Sara Basaran"; //by putting "private" acc. mod. you hid the data.In every encapsulation there is a way to access that encapsulated data.

    private int age = 14;
    //If do not want anyone to see the age variable we can use
    // " private int encode(){
    //   this.age = encode the age;    }        ==> 1A2?*hyu ==> example...java will encode the age variable and then you can get the encoded data

    private boolean isSuccessful = true;

    //2) Create constructor we need
    public EncapsulationStudentReview() {  //default cons. if we do not select any variable names
    }

    public EncapsulationStudentReview(String name, int age, boolean isSuccessful) {  //given by intellij automatically if we select cons. and select all variables.
        this.name = name;
        this.age = age;
        this.isSuccessful = isSuccessful;
    }
     //3. We created getters
    public String getName() {  //getter method==> name variable is private which means it is hidden but we created a method it is for getting
                              // the hidden data and it is public if it is public then it is accessible from anywhere of the project.
                              //Get() will give us the hidden data, it will help you to read the hidden data.No parameters inside get() bec. it gives the value
                              //Getter () should be public everytime.
        return name;  //no action just gets the encapsulated data.
    }

     //Create a variable for student age, encapsulate it  and create getter for it.

    public int getAge() {
        return age;
    }


    public boolean isSuccessful() {  //just for booleans java doesnot name "get+Name" only the name of variable...
                                     //for boolean values in java it is required to type method name as " is + variable name"....
        return isSuccessful;
    }

    //4) We created setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {  //we will put new value for "age" in this class, return type is always void bec. it gives the same data that is
                                   // existing already
        this.age = age;
    }

    public void setSuccessful(boolean successful) {
        isSuccessful = successful;
    }

    //5)Create toString() to see details of the object.
    @Override
    public String toString() {   //if you want to see object details on the console create "toString". ==>generate and toString() gives details of the object variables
        return "EncapsulationStudentReview{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isSuccessful=" + isSuccessful +
                '}';
    }
}

