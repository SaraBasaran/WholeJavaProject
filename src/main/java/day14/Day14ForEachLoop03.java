package day14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Day14ForEachLoop03 {


    public static void main(String[] args) {

        //Check if the array element are in natural order or not.
        //  "A", "B", "C" ==> TRUE - "A", "C", "B"==>FALSE

        String arr[] = {"A", "C", "B"};  //==>we will keep this array and create a new container the copy of the
        //we will copy the first array to here and sort the elements and put them in alphabetical order.
        //after sorting alphabetically ,ı will ask java to sort and put in alphabetical order
        //and then ask java if they are same or not.

        //How to create a copy of the given array.
        //1.way by using loops.
//       String copyOfArr[] = new String[arr.length];//[null, null, null]==>copy must be in the same length of the the first given array
//          int idx=0;
//
//          for(String w : arr){
//
//              copyOfArr[idx] = w;
//
//              idx++;
//
//          }
//            System.out.println(Arrays.toString(copyOfArr)); //[A, C, B]
//
//            //now we should sort the copied one an then compare if it is same or nor
//          Arrays.sort(copyOfArr);
//        System.out.println(Arrays.toString(copyOfArr));//[A, B, C]
//
//        if (Arrays.equals(arr, copyOfArr)){
//
//            System.out.println("Array elements are in alphabetical order.");
//        }else{
//            System.out.println("Arrays are not in alphabetical order");
//        }
//

        //2.way : By using existing method

        String copyOfArr[] = Arrays.copyOf(arr, arr.length); //**there is a copy method in Arrays class.By using"copfOf()
        // you can create a copy of the given array.
        Arrays.sort(copyOfArr);
        System.out.println(Arrays.toString(copyOfArr));//[A, B, C]
        if (Arrays.equals(arr, copyOfArr)) {

            System.out.println("Array elements are in alphabetical order.");
        } else {
            System.out.println("Arrays are not in alphabetical order");
        }
        //binarySearch() in array class: used to check existence of a specific element in an array.

        int brr[]={12, 13, 5, 11, -2};
        Arrays.sort(brr); //using sort method, it is must to be able to get meaningful respond from binarySearch().
                         // when you sort the array, java will put the numbers in ascending order
        int response = Arrays.binarySearch(brr, 13); //here we will type array container that we are looking into and the element that we are looking for.
        System.out.println(response);//after sorting[-2, 5, 11, 12,13]==>acc. to index//4==>binarySearch returns the index if the element exists.
                                      //So 0 or positive integers results mean that the element exists in the array.
                                     //In positive scenario you will get the index of the element.
        //**In the negative scenario you will get negative number and order of the non-existing order of the number
        //If we type 14 for checking by binarySearch() will give you -6 because it would exist in the sixth line and the result would be -6.

        int response2= Arrays.binarySearch(brr, 14);
        System.out.println(response2);

        //Check if a specific element exists in an array.
        //If the element exists return the index of the element
        //If the element does not exist return a message

        int crr[] = {13, 41, 2, 543};

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the element to check if it exists or not");
        int i = scan.nextInt();
        Arrays.sort(crr);
        int response3= Arrays.binarySearch(crr, i);
        if(response3<0){
            System.out.println("Element does not exist");
        }else{
            System.out.println("Index of element "+ i+ " is " +response3);
        }











    }
}





