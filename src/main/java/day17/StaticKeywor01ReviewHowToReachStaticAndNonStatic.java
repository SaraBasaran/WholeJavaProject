package day17;

public class StaticKeywor01ReviewHowToReachStaticAndNonStatic {//this is the template part
 public static int Scounter= 0;//as it is static it will be visible for every object

    public int counter= 0;//non-static
    public StaticKeywor01ReviewHowToReachStaticAndNonStatic(){  //this is the constructor part,inside the cons. part you can do some actions.Constructors are for creating
                                    //objects and you can do actions with them here.

       Scounter++;
       counter++;


    }


    public static void main(String[] args) {
        /*
        There are many things related with the world. There are people and many objects. Tom and Jane are people
        from world.Tom's eyes are green and Jane's eyes are black. Moon is away from th eworld but if the moon is splitted
        Tom and jane can see from world.But if Tom gets blinded he cannot see the moon splitted but jane can see even if she
        is in Europe.If you do sth on moon it will be seen by all people except for Tom.The things like moon in java
        is called static.
        What are the characteristics of static things in java?

        1)"static" things are common for all objects
        2)Any update on "static" things will effect all objects and will be visible by all objects.


         */

          StaticKeywor01ReviewHowToReachStaticAndNonStatic obj1= new StaticKeywor01ReviewHowToReachStaticAndNonStatic();//TO create an object==>class name object name new keyword and constructor name();
                                                                //when you type StaticKeyword01Review();==>java will go to constructor part upward.
                                                                //You will not attach static things to the objects you will attach the static things to the world.
          StaticKeywor01ReviewHowToReachStaticAndNonStatic obj2 = new StaticKeywor01ReviewHowToReachStaticAndNonStatic();

          StaticKeywor01ReviewHowToReachStaticAndNonStatic obj3= new StaticKeywor01ReviewHowToReachStaticAndNonStatic();

          //after creating 3 objects we need to see the value of Scounter and counter
       System.out.println(Scounter);//3


       //if we type the same thing for non-static like; System.out.println(counter);//it complains bec. main method is static and the counter is non-static
       //it is not possible to use counter in main method.But I can use it by the help of objcets...

       System.out.println(obj1.counter);//1
       System.out.println(obj2.counter);//1
       System.out.println(obj3.counter);//1

        /*Q1)How do you use non-static things inside the main method?
            **There are two ways
       1)Make it static
       2)Create an object then by the help of that object use it in main method.

        **Q2)How do you access to static and non-static things from outside the class?
        There are two options
        * Just class name is enough to access static things
        * You have to create object to access non-static things

        (from a class to a data in another class==> if it is static just class name is enough to access static things.

        * classname is staticKeyword01Review.==>in the list we can see static things...
        To access non-static things you have to create object.

        */


        System.out.println(StaticKeywor01ReviewHowToReachStaticAndNonStatic.Scounter);//3==> just class name is enough to reach static things...

        //To reach non-static things you have to create object...

        StaticKeywor01ReviewHowToReachStaticAndNonStatic obj4 = new StaticKeywor01ReviewHowToReachStaticAndNonStatic();

        System.out.println(obj4.counter);// 1 ==> it is giving counter in the list automatically.






















    }




















}
