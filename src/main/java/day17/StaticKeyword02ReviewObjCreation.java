package day17;

public class StaticKeyword02ReviewObjCreation {
  /*we are over here but we want to access from another class(I am in the world I want to access sth on the moon)

    Just class name is enough to access "static" things.

    System.out.println(StaticKeyword01.Scounter); ==>no need to create object
                                                 ==> 0...bec we didn't create an object so we just get the Scounter...

    */

    public static void main(String[] args) {

        System.out.println(StaticKeywor01ReviewHowToReachStaticAndNonStatic.Scounter);////0

        //To access non-static things you have to create an object

        StaticKeywor01ReviewHowToReachStaticAndNonStatic obj4= new StaticKeywor01ReviewHowToReachStaticAndNonStatic();
        System.out.println(obj4.counter);//1

        System.out.println(obj4.Scounter);//1

        //we donot prefer to access by using object creation bec. it is long way to access static things...USE CLASS NAME!!!
        //To access static things using class name is enough.









    }
}
