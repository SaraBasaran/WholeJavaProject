package Day21ReviewsInheritance.Day22PractiseSessionQ01;

import java.util.Arrays;

public class StringToArray {

    /*
     * create a method accepts a name as parameter
     * and prints the name as a char array
     *
     * (do not use toCharArray() method)
     *
     * Input : John
     * Output : [J, o, h, n]
     */

    public static void main(String[] args) {

        System.out.println(Arrays.toString(convertToCharArray("Ali Can")));


    }


    public static char[] convertToCharArray(String name){
           name.replace(" ", "");
        char[] arr= new char[name.length()]; //getting the length of the name if we print ==>null character literal '\0'
        for (int i= 0; i<name.length(); i++){
            arr[i] = name.charAt(i);

        }
        return arr;

    }




}
