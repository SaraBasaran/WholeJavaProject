package day13;

public class Day13Arrays04 {


    public static void main(String[] args) {

        //Create an integer array and print all the elements less than 5.
        //[12, 3, -3, 5, 23]   ==>>3,-3,

        int arr [] = {12, 2, 3, -3, 5, 23};

        //1.way; use regular loops(for - while- do while loops)

        int i=0;//this is starting value
        while (i< arr.length){

            if (arr[i]<5){ //if the element of arr is less than 5 then print it

                System.out.println(arr[i] +" ");
            }
            i++;

        }
        //2.way: Use for-each loop (other name of for-each loop is Enhanced Loop)
        // Enhanced loop is used (for each loop) can be used just with arrays and collections.
        // Collections include many structures and multiple data.
        //Arrays are primitive but collections are non-primitive, they are improved.

            for (int w: arr) {
                //generally name of variable name is used as"w" for enhanced loop.
                if (w < 5) {
                    System.out.println(w + " ");
                }

            }















    }









}
