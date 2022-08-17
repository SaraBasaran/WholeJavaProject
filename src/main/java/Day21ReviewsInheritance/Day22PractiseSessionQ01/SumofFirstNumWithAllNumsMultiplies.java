package Day21ReviewsInheritance.Day22PractiseSessionQ01;

public class SumofFirstNumWithAllNumsMultiplies {

    /*
       Create a method that adds given integers except the first one and multiplies the sum by the first integer.
         a*(b+c+d+f)
    */

    public static void main(String[] args) {
       myMethod(7, 4, 6, -7, 100); //721
       myMethod(0, 1111, 54); //0==> "a" is zero...
        myMethod(-1, 5, 7, 89); //-101

    }

      //We will use varargs
    public static void myMethod(int a, int... numbers){

        int sum= 0;

        for (int w: numbers){
            sum+= w; //Sum will be increased by "w".

        }
        System.out.println(sum*a);


    }




}
