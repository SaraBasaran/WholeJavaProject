package day17;

public class StaticKeyword02 {
    //If I want to access to static things from one class to another class just class name is enough



    public static void main(String[] args) {
        System.out.println(StaticKeyword01.sCounter); //0

        //To access non-static things you have to create object.

        StaticKeyword01 obj4 = new StaticKeyword01();
        System.out.println(obj4.counter);










    }







}
