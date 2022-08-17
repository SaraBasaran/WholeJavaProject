package day04;

import java.util.Scanner;

public class Day04Scanner01 {

    //We use Scanner to interact and get the data from the user. To get the user's name, password,
    // date of birth and so on.

    /*
    To interact with the user by using Scanner class follow the steps
    1) Create a scanner class object
    2) Give a message to the user
    3)Put the data coming from the user into memory
     */

    public static void main(String[] args) {
        //Scanner is the name of the class input is the variable and when creating an object in the system
        //the keyword is "new". Java puts every data from the user into Scanner class.
        //Whenever I need a math operation ı need to look at math class.

        //1)Create a Scanner class
     Scanner input = new Scanner(System.in);

     //2)Give a message to the user
        System.out.println("Enter your age");

        //3)Put the data coming from the user into memory
        //by typing variable inside the input there is data type coming from the user so we should reserve the
        // like int or double you will reserve an area from the memory

        int age = input.nextInt();
        System.out.println(age);




    }
}
