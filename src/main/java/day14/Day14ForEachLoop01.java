package day14;

import java.util.Arrays;

public class Day14ForEachLoop01 {


    public static void main(String[] args) {

        /*

        There is 1)development environment==> where the product is developed and produced
                 2)Test envi.==>job to find errors..
                 3)Product envi.==>the step of usage of the product
                 you may need to check if the arrays are well-organized or not...

         */
        //Type codes to check if two given arrays have exactly same elements.
        //For ex: arr[] = [12, 3, -5, 14]          brr[] = [ 14, -5, 12, 3]
        //Note:Arrays class has a method to check if 2 given arrays are same (Elements and orders are same)
         //[12, 4, -1]  [12, 4, -1]

        //Type code to check if 2 given arrays have exactly same elements
        //arr[] = [12, 3, -5, 14]        brr[] = [14, -5, 12, 3]

        //Note: Arrays Class has a method to check if 2 given arrays are same(Elements and orders are same) or not
        //      [12, 4, -1] != [12, -1, 4]   [12, 4, -1]==[12, 4, -1]==>the order is important as well.
        int arr[] = {12, 3, -5,14 };
        int brr[] =  {14, -5, 12, 3};

        Arrays.sort(arr);//[-5, 3, 12, 14]//if you want to check only the chrs. are same or not only one
                                          // Arrays.sort and Arrays.equal is enough but if you want to check both the chars are same
                                          //and the order of the chars are same then you need to type twice Arrays.sort(arr)
                                          // and then we should use Arrays.equals()

        Arrays.sort(brr);//[-5, 3, 12, 14]
        boolean areTheySame = Arrays.equals(arr, brr);//for true or false assesment we need to create a new boolean container.
        System.out.println("Are the arrays same? " + areTheySame);


        //Type code to check if a specific element exists in an array or not.

        String crr[]= {"Java", "Selenium", "Api", "SQL"};

        int counter=0; //this is called "FLAG" and it is used to check if a specific scenario occured in an array or not.
        String expectedElement= "Selenium";

        for (String w: crr){ //we have to put a variable name into "if"..as it is a String value we put String and we need to create a new container.
            if (w.equals(expectedElement)){
                counter++;

            }
        }
        if (counter>0){

            System.out.println("The array has the expected element");
        }else{
            System.out.println("The array does not have the expected element");
        }
        System.out.println("==================================================");

        //For an existing element in arrays java will give you the index of the element==>starting from 0
        //****but if the element does not exist java will give the "expected order of element" in array..==starting from the first el.
        // as number 1.
        //Negative Scenario

        String drr[]= {"Java", "Selenium", "Api", "SQL"};

        int counter2=0;//this part is "Flag Part".
        String expectedElement2= "Apex";

        for (String w2: drr){ //we have to put a variable name into "if"..as it is a String value we put String and we need to create a new container.
            if (w2.equals(expectedElement2)){
                counter++;
                break;

            }
        }
        if (counter>0){

            System.out.println("The array has the expected element");
        }else{
            System.out.println("The array does not have the expected element");
        }
        System.out.println("=============================================================");

        //Type codes to check the number of usage of specific element in an array
        //[12, 2, 23, -5, 12, 23, 12]==> 12 was used 3 times
        //                           ==>-5 was used 1 time
        //                           ==> 200 was used 0 time

        int arr2[]= {12, 2, 23, -5, 12, 23, 12};
        int flag= 0;
        int expected=12;

        for(int w: arr2){

            if(w==expected){
                flag++;
            }

        }
        System.out.println(expected + " was used " + flag + " time/s");












    }

















}
