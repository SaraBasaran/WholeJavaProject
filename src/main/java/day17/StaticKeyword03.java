package day17;

import java.time.LocalDate;

public class StaticKeyword03 {

     /*
        Create unique student ids for every registered student.
        For ex: If the student name is Tom Hanks==> Tom Hanks registered to Math Course.==>TH2022==>year will be dynamic data.
         TH20229011001

         */

    public static int counter=1000; //if no reg. then no need to increase the counter==> in every stu reg counter will be increased by 1.
    public StaticKeyword03(){

        counter++;
    }


    public static String setStId(String stdName, String courseName) {

        //1.step==>get the initials

        String firstInitial = stdName.split(" ")[0].substring(0, 1);//with first split by space you will get "Tom" and the next 0,1 you will get "T"

        String lastInitial = stdName.split(" ")[1].substring(0, 1);//we are getting the first initial of the last name

        //2.step==> should be given automatically by java

        LocalDate date = LocalDate.now();//gives the local date of the area
        int year = date.getYear();//will give year component,
         //İf java is supposed to do same method for the same parts, java does the multiple tasks synchronising.
        //Multiple threat process
        //3. step ==>define the course code by course name

        int courseCode = 0;

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
                System.out.println(courseName + " " + " does not exist");
        }

        return firstInitial + lastInitial + year + courseName + counter;








    }
}