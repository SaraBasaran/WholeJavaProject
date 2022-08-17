package day13;

import java.util.Arrays;

public class MinAndMaxValueInArray {

    public static void main(String[] args) {
        //Type code to print the sum of the min and max value of an integer array.

        int arr[]={23, 12, 34, 10, 78, 19};
        System.out.println(Arrays.toString(arr));
        //Put the elements in ascending order
        //**sort method in Arrays class put the elements in ascending order.

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int minValue= arr[0];  //from the array first elelemnt will have zero index...
        int maxValue = arr[arr.length-1];//length -1 gives us the last index all the time==>dynamic code
        System.out.println(minValue + maxValue);//88==>













    }
}
