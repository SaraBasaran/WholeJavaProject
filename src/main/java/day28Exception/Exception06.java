package day28Exception;

public class Exception06 {



    public static void main(String[] args) {

        Object obj= 70;

        convertObjectToString(obj); //ClassCastException==>if you try to convert Object class object to String java will give RTE.
                                   // Object class is wider than String class.RTE
    }
    public static void convertObjectToString(Object obj){
        try {
            String s= (String) obj;
            System.out.println(s);
        }catch (ClassCastException e){
            System.out.println("Object class can not be converted to String Class");
        } //you protect your app. to be blocked by handling exceptions.
        //Every app. uses DataBase.It goes to Database gets the data from there and uses data in the app.For ex; when you go to ATM machine,
        // you enter your username and password. The app. goes to database gets your username from there and if they match app. allows you to enter
        // into your account. If any codes goes to database and fetches the data this is called "hit" the database.
        // Most of the companies do not buy database and work with servers from cloud system and uses database from there.
        // Once you create an engine designed for your company from cloud you should get the data.
        // After using data we are supposed to pay some amount for the
        // time of usage of the engine if we do not stop the time of usage ==>break the connection after finishing our work with the database
        // the time counter of the cloud database will give us the bill acc. to that time. We have to break the hit after using the app. everytime.
        // So we need to use "finally" keyword to stop the time counter of the cloud engine.
        finally {
            System.out.println("Break the connection"); //when you put "finally" it will certainly work for every scenario.when you complete all the work
            //with ATM finally will work and stop the connection with database.In every execution of the method finally part works.

        }




    }




}
