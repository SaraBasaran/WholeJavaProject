package day17;

public class StaticKeyword01 { //this is the template
         /*
         Q1: How do you use non-static things inside the main method?

         Answer: there are 2 ways.
         1)Make it static
         2) Create an object then by the help of the object use it in "main" method

        Q2: How do you access to static and non-static things from outside the class?

         1)Just class name is enough to access static things
         2)You have to create object to access non-static
          */
    public static int sCounter =0; //if you type static for counter variable it will be common for all counter variables for all following parts.
    public int counter= 0;


    public StaticKeyword01(){ //this is the constructor part

        sCounter++;
        counter++;

    }

    public static void main(String[] args) {

         //There are 2 types of things related with the world.If you do sth on the moon it will affect all the people
        //but if one's eye is affected the others will not be affected.The things like moon in Java is called static.
        /* characteristics of static things
        1)are common for all objects.If you think people are objects moon is common for all and can be seen.
         2) Any update on "static" things will effect all objects and will be visible by all objects.
         For ex; if a person, called John and has an application for police department company and has an insurance
         company relation and health and government.
         Insurance com. knows his name is John government knows his name as well.
         All people have relations with diff. parts of life.
         If John changes his name as "Alex" he must inform police dept. and govt and ins. company.
         But instead of doing this, if he puts his name "static"==> every part will be informed automatically.
         In Java " static" means
         if you make name John static it will be common for all related parts automatically
         you will attach "static" in class.

         */

        StaticKeyword01 obj1 = new StaticKeyword01(); //when those objects are created java will go to constructor and
                                                      // make object will be related that objects typed in main method
                                                      //this part changed value of sCounter to 1
        StaticKeyword01 obj2 = new StaticKeyword01();//this part changed counters value to 1
        StaticKeyword01 obj3 = new StaticKeyword01();
        System.out.println(sCounter); //3 ==> static in constructor part
        System.out.println(obj1.counter); //1 ==> non-static in constructor part

        System.out.println(obj2.counter); //1 ==> non static in constructor part.

        //To access "static" things using objects is allowed but not recommended







    }























}
