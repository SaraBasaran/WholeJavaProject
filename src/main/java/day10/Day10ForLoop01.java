package day10;

public class Day10ForLoop01 {

    public static void main(String[] args) {
        //Type "Hi!" on the console 5 times...
        /* by typing 5 times with copying...is too long.
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");

        In real app.s you may need to type 5000 times it is almost impossible. Sometimes Repetion makes
        the task impossible to work.
        ***Loops are used for repeated actions without repeating codes...
        By using "loops" you can do repeated actions without repeating your codes.
        There are 4 loops..
        1) for-loop
        2)  while-loop
        3) do-while-loop
        4) for-each-loop

        1)for-loop==> like if syntax..
        for (Starting value ; Condition to run loop ; Increment/Decrement){
        }
         */
        //For general usage for variable name should be i , j , k...

         for (int i = 1; i<=5; i++ ){

             System.out.println("Hi!");
             System.out.println("=============================");
         }
         //Task: Type integers from 10-3 on the console by using for-loop.
        for( int i =10; i>= 3; i--){  //not in the same line
            System.out.println(i); //if you remove .ln from sout then all thr numbers will br typed next to each other without any space in the same line.
        }
        System.out.println("==========================");
        for( int i =10; i>= 3; i--) {
            System.out.print(i + " ");//==> 10 9 8 7 6 5 4 3
        }
        //Task 2: type even integers from 4 to 15 on the console by using for loop
        //1.way==>is a better way to show that you are a programmer...
        System.out.println("======================================");
        for ( int i = 4; i<16; i++){
            if (i%2==0){
                System.out.print(i + " ");
            }
        }
        //2.way
        System.out.println("=====================================");
        for ( int i= 4 ; i<16; i=i+2){
            System.out.print(i + " ");
        }
        //Task three:Type odd integers from 4 to 15 by using for-loop

        System.out.println("=====================================");

        for (int i = 4; i<16 ; i++){
            if (i%2!=0){
                System.out.print(i + " ");
            }
        }
        System.out.println("=====================================");

        for (int i = 4; i<8 ; i++){
            if (i%2!=0){
                System.out.print(i + " ");
            }
        }
        System.out.println("=====================================");
        //Task 4: Print all integers from 10 to 32 except 17 on the console
        //1.way:

        for (int i =10; i<33 ; i++ ){
            if (i!=17){
                System.out.print(i +" ");
            }

        }
        System.out.println("=====================================");
        //2.way
        for (int i =10; i<33 ; i++ ){
            if (i==17){
                continue; //==>continue keyword; means skip that value and go on...
            }
            System.out.print(i +" ");
        }
        System.out.println("=====================================");


        //Task  5: Type a code to print all integers from 10 to 32 except if the integer is less than 21 greater than 18

        for (int i =10; i<33; i++){

            if (i>18 && i<21){
             continue;
            }
            System.out.print(i+" ");
        }


        //Example 5 : Type String chars. one by one on the console. If you see"x" stop printing.
        // Publix is the best==> your code start and start when it comes to "x"==>Publi
        //If there is no "x" in the string it will go on.
        System.out.println("=====================================");

        String str = "Publix is the best";

        for (int i=0; i<=str.length()-1; i++){
            if ( str.charAt(i)=='x'){
                break; //==> we use break in "loops" and "switch" statements.When we use break, it breaks the loops and switch for a specific reason
            }
            System.out.print(str.charAt(i));

        }




        }










}
