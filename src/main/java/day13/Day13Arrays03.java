package day13;

import java.util.Arrays;

public class Day13Arrays03 {

    public static void main(String[] args) {

        //[0, 2, 3, 0, 12, 0] put the zeros to the end ==>[2, 3, 12, 0, 0, 0]

        int arr[]={0, 2, 3, 0, 12, 0};//==>this is given array I will create a new array from this...
                                      // When you create a new array java will put 0sin the new array.we will tell java if element quals to 0 dont touch.

        int newArr[]= new int [arr.length]; //if the first given arr value has 6 elements new arr must have 6 elements too.
                                            //while creating an array when you give the number of the elements java will put automatically 0 in it.
        int idx = 0; //we created this container we should put the first index of the given array to the new array by order.
                     //check for "0" value for each element because of this repeated required action we use for loop.
        for (int i=0; i<arr.length; i++){

            if (arr[i] != 0){
                newArr[idx]= arr[i]; //we transfer the array elements to the new array acc. to their indexes and putting the zeros to the end.
                idx++;

            }

        }
        System.out.println(Arrays.toString(newArr));















    }


















}
