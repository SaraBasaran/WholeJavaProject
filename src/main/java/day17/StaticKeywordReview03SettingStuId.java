package day17;

import java.time.LocalDate;

public class StaticKeywordReview03SettingStuId {

    public static int counter=1000;

    public StaticKeywordReview03SettingStuId(){

        counter++;//in every stu reg. creation counter will increase by one
    }

   /*
   Create unique student ids for every registered stu.

   If the stu name is "Tom Hanks" and registered to Maths(901) ==>TH20229011001

    */

    public static void main(String[] args) {
        StaticKeywordReview03SettingStuId std1= new StaticKeywordReview03SettingStuId();
        std1.setStuId("Tom Hanks", "Math");
          StaticKeywordReview03SettingStuId std2= new StaticKeywordReview03SettingStuId();
        System.out.println(std1.setStuId("Tom Hanks", "Math"));
        System.out.println(std2.setStuId("Jane Jackson", "Art"));

    }

    public static String setStuId(String stdName, String courseName) {

        //1.step:getting the first initials of first and last name
        String firstIni = stdName.split(" ")[0].substring(0, 1);
        //here we split the given name by spaces...and we get the first letter of substring
        String lastIni = stdName.split(" ")[1].substring(0, 1);

        //TH is received from stu. and year will be added to Id automatically by java
        //2.step: //Date
        LocalDate date = LocalDate.now();
        int year = date.getYear();

        //3.Coding the courses acc. to their names bec. stu dont know the codes...

        int courseCode=0;

        switch (courseName.toLowerCase()) {

            case "math":
                courseCode = 901;
                break;
            case "science":
                courseCode = 902;
                break;
            case "art":
                courseCode = 903;
                break;
            case "computer":
                courseCode = 904;
                break;
            default:
                System.out.println(courseName + " does not exist");




        }
        //after this step teacher added the counter to the class part....

        return firstIni+lastIni+year+courseCode+counter;
        //and after this step teacher created a new object under main method...


        /*A method should not have many tasks in one method bec. if any tasks is broken others should not be affected
        so we should type codes in atomic structure. Here we have 3 diff. tasks in one method that is not expected.
        So we should make every task in one method. Do not create huge projects

         */











    }


}






















