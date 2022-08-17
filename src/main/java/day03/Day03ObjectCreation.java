package day03;

public class Day03ObjectCreation {

    /*We learned how to create a template so far;

    1)How to create a class==>passive features = variables and active features= methods (actions)
    2)How to create methods in a class
    3)how to create variables
    By doing so we learned ''Template'', now it is time to learn ''Object''. Java is an Object Oriented Programming Lang.

     */
    public static void main(String[] args) {

        //Create an object to be able to use non-static class members (means methods+variables)
        //you will type= ClassName  + Object Name = new ClassName();

                    Day03ObjectCreation  myObject = new Day03ObjectCreation();

        System.out.println(myObject.calculateAge(1990));
        System.out.println(myObject.printName("Mark" , "Twain"));
        System.out.println(myObject.height);
        System.out.println(myObject.id);

    }

    public String printName(String firstname, String lastname){

        return firstname + " " + lastname;
    }

    public int calculateAge(int dob){

        return 2022 - dob;
    }

    int height = 185;
    String id = "Sp2022-001";




}
