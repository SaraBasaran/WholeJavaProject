package day18passbyvalue;

public class VarArgs {

         /*
         How can I add multiple int.s?

         VarArgs is like an endless pit. If you put 1 value it is ok if you out 2 to unlimited value VarArgs will
         help you to do endless number of addition. Even if you dont put any value varArgs will work as well.
         When you create an addition method you should not define the numbers you should use varArgs.

         **1)VarArgs are used to handle multiple param.sin a single method
         **2)Any param.s can not be used after VarArgs==> int a..., int b XXXnot acceptable by Varargs
         **3)Before Varargs we can use param.s different from Varargs==> int b..., ain a==> accepts and works Varargs
         **4) In a method we can use just a single varargs, it must be the last param. everytime...

          */
   /* public static void main(String[] args) {

       // add(3, 5);
        //System.out.println(add(3, 5)); //8==> but if we need to add three or four int.s??

    */
         public static void main(String[] args) {

             System.out.println(add());//0
             System.out.println(add(5));//5
             System.out.println(add(3, 5));//8
             System.out.println(add(3, 5, 7));//15

             //We can not use a c-second parameter after VarArgs.


         }

    public static int add(int... a) { //by putting 3 dots after an int data means it is VarArgs
                                      //VarArgs are like Arrays bec. behind the VarAgs java uses Arrays
         int sum= 0;
         for (int w:a){

             sum=sum + w;
         }
        return sum; //after typing "return" for the last time you cannot add any other code or method
    }



}
