package day12;

public class Day12DoWhile01Review {


    public static void main(String[] args) {

        //Compare the given loops...
        int i=1;
        while(i<1){
            System.out.println("Hey I am While Loop!");

            i++;
        }
        //here nothing will be printed on the console. while -loop get the data and condition first then acts.

        int k=1;    //but in do while loop, the act is done first then the condition is checked...

        do{
            System.out.println("Hey I am do-while Loop!");
            k++;
        }while(k>1);  //used in games mostly...

        //Note:Zero execution is possible in while-loop, but it is impossible in do-while-loop
        // do-while-loop body is executed at least once.




















    }










}
