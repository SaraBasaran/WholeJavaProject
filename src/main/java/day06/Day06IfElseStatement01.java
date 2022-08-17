package day06;

import java.util.Scanner;

public class Day06IfElseStatement01 {

    /*
    If the score is less than 50 then you will fail
    If the score is greater than 50 then you will pass,

    If the score is less than 50 then you will fail otherwise you will pass.(this way is better as it is shorter)
    here only one condition will be checked.

    if the first part is true then the first action eill occur but
    if the first condition is false then the second action eill occur,this is the logic of "if else".
     */
    public static void main(String[] args) {

        //Ask user to enter the score, if the score is less than 50 print "Fail" otherwise print "Pass" on the console

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = input.nextInt();


        if (score < 50) {
            System.out.println("Fail");

        } else {

            System.out.println("Pass");
        }//else kısmında cond. kullanmaya gerek yok..1. kısımdaki koşul false ise girilrn değere göre else'ye yönlendiriyor bizi.

        //2.way multiple if, not recommended.else way is a better way.

        if (score < 50) {
            System.out.println("Fail");
            //in the task it says equal to 50 or otherwise, otherwise means equals to or bigger than that number!!!!

        }
        if (score >= 50) {
            System.out.println("Pass");
        }

        //Ask user to enter the number of day, then print the name of the day whose number was given
        //example: 2 ==> Monday , 5==> Thursday

        System.out.println("Enter day number");
        int dayNum = input.nextInt();

        if (dayNum == 1) {
            System.out.println("Sunday");//For scenarios more than 2 you need to use else if..
        } else if (dayNum == 2) {
            System.out.println("Monday");
        } else if (dayNum == 3) {
            System.out.println("Tuesday");
        } else if (dayNum == 4) {
            System.out.println("Wednesday");
        } else if (dayNum == 5) {
            System.out.println("Thursday");
        } else if (dayNum == 6) {
            System.out.println("Friday");
        } else if (dayNum == 7) {
            System.out.println("Saturday");
          //After finding true action java will stop looking to other steps of conditions.
          //We should consider the numbers less than and more than between 1-7 as the number of days of the week.
            //To stop that un resulting position we should add"else" to limit the actions and give message to the user.
            //else means if user gives weird numbers or other values...else means if the values are different from the
            //expected values...

        }else {
            System.out.println("Please enter a valid day number");
        }


    }
}
