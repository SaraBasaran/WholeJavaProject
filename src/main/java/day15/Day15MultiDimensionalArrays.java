package day15;

import java.util.Arrays;

public class Day15MultiDimensionalArrays {

    public static void main(String[] args) {

        int mda[][] = new int[3][2];

        mda[1][1] = 11;
        mda[2][0] = -7;
        mda[0][0] = 12;
        mda[2][1] = 16;
        mda[0][1] = -3;
        mda[1][0] = 5;
        System.out.println(Arrays.deepToString(mda)); //[[12, -3], [5, 11], [-7, 16]]
        //for integer arrays java will assign default values for empty element places.

        //Find the sum of the first and the last inner array elements.

        int sum = 0;

        for (int i = 0; i < mda.length; i++) {  //outer array for loop

            if (i == 0 || i == mda.length - 1) { //solving the indexes and assigning inner indexes

                for (int k = 0; k < mda[i].length; k++) { //getting the values from inner indexes

                    sum = sum + mda[i][k];
                }

            }

        }
        System.out.println(sum);

        //Example 2: Type code to find the total number of elements in the multidimensional array.
        //[ [5, 2], [11, 13, 15], [6], [-2, 3, 5, 12] ]

        int arr[][] = {{5, 2}, {11, 13, 15}, {6}, {-2, 3, 5, 12}}; //more simple way to make an array

        //to be able to use for-each loop you need to type data type. That one is integer array.

        int totalNumOfElements = 0;
        for (int[] w : arr) {//in "w" value I am telling java to go to arr and java will put the first elem.of arr
            totalNumOfElements = totalNumOfElements + w.length;//add the number of elements into "w" and after finding
        }                        //0                2    =2  //assign the values to "totalNumOfEl".the number of elements 2
        System.out.println(totalNumOfElements);


        //Example 3: Print the elements which has "a" in it from a multidimensional array.

        String brr[][] = {{"Java", "is"}, {"easy", "to", "learn"}, {"if", "you", "study", "hard"}};

        for (String[] w : brr) {//first for is giving the arrays one by one.

            for (String u : w) { //u is the container for inner array elements...

                if (u.contains("a")) {
                    System.out.print(u + " ");
                }
            }
        }
        System.out.println("==================================================================");
        //Example 4: Convert two dimensional array to one dimensional array.

        String crr[][] = {{"Java", "is"}, {"easy", "to", "learn"}, {"if", "you", "study", "Alex", "hard"}};

        //First we need to create a new one array and java will assign "null" values in it.
        //{ null, null, null, null, null, null, null, null, null} = 9 elements.
        int numOfEl = 0;

        for (String[] w : crr) {

            numOfEl = numOfEl + w.length;
        }

        String drr[] = new String[numOfEl];//this is hard coding but for now we should know this...
        int idx = 0;

        for (String[] w : crr) { //"w" will contain the array of crr {"Java", "is"} and the other

            for (String u : w) { //u will be the container for each inner array.First "Java" will be put and then "is" and then other elems.

                drr[idx] = u; //we should create an idx container for the starting point of each array
                idx++;
            }


        }
        System.out.println(Arrays.toString(drr)); //[Java, is, easy, to, learn, if, you, study, hard]

        //Example 5: Find the sum of the max and min element in an integer multidimensional array.

        int err[][] = {{5, 2}, {11, 13, 15}, {6}, {-2, 3, 5, 12}};

        int max = err[0][0]; //the first array and the first element of first idx
        //1.way:
        for (int[] w : err) { //that one will give arrays one by one but we need each inner loop

            for (int u : w) {

                if (max < u) {
                    max = u;
                }

            }

        }
        System.out.println(max);

        //2.way:

        int maxx = err[0][0]; //any index can be selected but here we start from the first array and the first element of first inner array.
        for (int[] w : err) { //that one will give arrays one by one but we need each inner loop

            for (int u : w) {

                maxx = Math.max(maxx, u);
            }

        }

        System.out.println(maxx);

        //Find the minimum value

        int min = err[0][0];

        for (int[] w : err) {
            for (int u : w) {
                min = Math.min(min, u);

            }
        }
        System.out.println(min);

        System.out.println(max + min);


        //Example2:
        //Type code to find the total number of elements in the multidimensional array.

        int [][] arr2= {{5, 2}, {11, 13, 15}, {21, 35, 69,105,45,65}, {12,15,47,56,89} };

        //we need to make a new container for the total number...

        int totalNumOfEl2= 0;

        for (int[] w: arr2){

        totalNumOfEl2 = totalNumOfEl2 + w.length;


        }
        System.out.println(totalNumOfEl2);

        System.out.println("========================================================");


        //Find the elements which contains "n" in it.
        String [] []arr3= {{"Sara", "is", "really"}, {"keen", "on", "learning"}, {"Java", "and", "others"}};

        for (String [] w: arr3){

            for (String k : w){

                if( k.contains("n")){

                    System.out.print(k + " ");
                }
            }

        }






    }

}
