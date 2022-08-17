package day20StringBuffer;

 /*
        1)Constructors are used to create an object from a class.For ex; There is cake dough and a mold on the table you cannot
        have a cake without a cookerIf there is no constructor it is impossible to create an obj.

        2)Java knows classes are for obj. creations bec. of that Java puts constructors in every class automatically.When you c
        create a class java puts a constructors automatically. Constructors coming from Java are default/invisible constructors.

        default Constructors==> public ConstructorsVehicles(){}==>this the syntax of default constructor, no name and no parameters in body.
        a)Its name must be same with the class name
        b)It is public
        c)No parameters inside {}

        3) Java is jealous, when you create your own constructor java deletes the default one.

        4) What are the diff. between methods and cons.s?

        a) Constructors are for obj. creations but methods are for some actions...
        b) Constructors do not have return type but methods must have return type.
        c) The name of Constructors must match with the name of the class, but "methods" can use any name.

        We put the constructors above the main method most of the time.

         */

public class ConstructorsVehicles01 {

   String make;
   String model;
   int year;
   double price;

   //When you create a cons. you will put a name for the cons.


    public ConstructorsVehicles01(String make, String model, int year, double price){ //same cons. with the default one.
                                                                                       //
        this.make = make; //I am telling java to put the same "make" to this class's name...User will give you a make name and make this name same with the
                          //make name given by user.==> make is the same with the make in cons. paranthesis
        this.model= model;
        this.year= year;  //if the year is not given by the user we should construct another constructor for this...
        this.price= price;


    }

    public ConstructorsVehicles01(String name, String model, double price){  //in case the user does not care about the price we need to create another constructor...
        this.make= make;
        this.model=model;
        this.price= price;

    }
    public ConstructorsVehicles01(String name, String model, int year){  //in case the user does not care about the year we need to create another constructor...
        this.make= make;
        this.model=model;
        this.year=year;

    }  //on a car app.==>inside the app. we can see many filter options...Any class may have zero cons. any class may have many cons.s

    public ConstructorsVehicles01(){  //in case the user does not care about the year we need to create another constructor...


    }







}
