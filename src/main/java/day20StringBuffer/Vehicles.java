package day20StringBuffer;





     /*
        1) Constructors are used to create an object from a class.
        If there is no constructor, it is impossible to create an object from a class.

        2)Java knows classes are for object creations, bec. of that Java puts "constructor" in every class
        automatically.
        Constructor coming from Java will be invisible, it is called "default" constructor".

        default constructor==> public Vehicles(){  }==>when you create syh in Java should have access modifier, Java will automatically puts public
        this is invisible.
        **its name must be same with the class name

        method ==>public int add(){  }

        3)Java is jealous, when you create your own constructor Java deletes the default one.

        4)What are the diff. between consructors and methods
        a)You should mention about the functionality==>con.s are for object creations, methods are for actions

        b)"Constructors" do not have return type but methods must have return type.
        You may type whatever you want between cons. body. Inside the con.s parenthesis you can use parameters.

        c) The name of "constructors" must match with the name of the Class, but "methods" can use any name.



      */

public class Vehicles {

        String make;
        String model;
        int year;
        double price;

        public Vehicles() {

        }

        public Vehicles(String make, String model, int year, double price) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.price = price;
        }

        public Vehicles(String make, String model, double price) {
            this.make = make;
            this.model = model;
            this.price = price;
        }

        public Vehicles(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;





    }

}










