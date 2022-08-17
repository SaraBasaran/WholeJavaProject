package day14;

import java.util.Arrays;

public class Day14MultiDimensionalArray {

    public static void main(String[] args) {

        //If we create arrays inside the outer array it is called multidimensional array.Inside the outer and bigger arrays
        //you wil see small containers and in those containers elements...Arrays can not include different data types
        //If you want type a multidimensional array you need to type two [] [] like this.The first bracket gives the index of inner array
        //and the second one gives the index of the element inside the inner array. No commas used...

        int arr[][] = new int[4][3];

        arr[2][1] = 5;//==>gives the element in the first index(2. one) at the second array.
        //**deepToString(arr) is to print multidimensional arrays
        System.out.println(Arrays.deepToString(arr));

       ////Example 1: Find the sum of the first and the last inner array elements.

        int [][] sara = {{2, 5, 8, 21}, {23, 56, 21, 89}, {45, 21, 86}, {21, 1, 23},{236, 56, 789}};

        System.out.println(Arrays.deepToString(sara));

        int sum = 0 ;
        for (int i=0; i< sara.length; i++){
            if(i==0 || i==sara.length-1){

                for ( int k=0; k<sara[i].length; k++){
                    sum = sum + sara[i][k];
                }
            }

        }
        System.out.println(sum);
         //Find the total number of elements in multidimensional array.
        int [][] sara2 = {{2, 5, 8, 21}, {23, 56, 21, 89}, {45, 21, 86}, {21, 1, 23},{236, 56, 789}};

        int totalNumberOfEl = 0;

        for (int [] w : sara2){    //burada for each loop kullandık ki java her inner arayin içine otomatik olarak
                                  // kontrol edecek sırasıyla. For each loop yani enhanced loop ile işlem yaparken
                                  //data type muhakkak belirtilmeli ve "w" container oluşturulmalı.

            totalNumberOfEl = totalNumberOfEl + w.length;
        }
        System.out.println(totalNumberOfEl);

          //Example 3: Print the elements which has "a" in it from a multidimensional array.

        String brr[][]= {{"Java", "is", "really"}, {"easy", "if"}, {"you", "study"}, {"hard", "enough"}};
         //we are going to use for-each loop here

        for (String [] w : brr){ //by using w container we can get the first array and second and so on.
                                 //but for the inner array search we need to create another container with another
                                 //for each loop to check every single element.
            for (String u : w){
                if(u.contains("a")){

                    System.out.print(u + " ");
                }

            }
        }
        System.out.println();
        //Convert two-dimensional array into a one-dimension array.

        String crr[] []= {{"Java", "is", "really"}, {"easy", "if"}, {"you", "study"}, {"hard", "enough"}};

        //For String default values is "null". To be able to create a one-dimensional array we should create a new string array...

        String[] drr = new String[9];

        int index= 0;

        for(String[] w: crr){

            for (String u : w){
                drr[index]= u;

                index++;

            }

        }
        System.out.println(Arrays.toString(drr));


          //Make a dynamic convertion of two dimensional array into one-dimensonal array.

        String [][] hrr= {{"Java", "is"}, {"perfect", "if"}, {"you", "learn", "it"}};

        int hrrlength=0;
        for (String[] w: hrr){
             hrrlength= hrrlength+ w.length;

            }

        String [] grr= new String[hrrlength];

        int index2=0;

        for(String [] w : hrr){

            for (String u : w){

                grr [index2] = u;

                index2++;
            }
        }
        System.out.println(Arrays.toString(grr));

         //Example: Find the sum of max and min element in an integer multi-dimensional array.
         //To find the max value our logic is to convert first into one-dimensional array and then use sort ().==>long process
        //A short way is to use compare element by assigning the index of 0.By putting the value in the first quoe java will select the one which has the
        //highest value.
        //We need for each loop.

        int [][] intArr = {{2, 5, 8, 21}, {23, 56, 21, 89}, {45, 21, 86}, {21, 1, 23},{236, 56, 789}};
        //To find the max value;
         //1.way:
        int max= intArr[0][0]; //==>starting point for loop and assing the max value...
        for (int[] w: intArr){  //==> that one will get arrays one by one but we need elements not arrays to reach max and min value.
                                   //so we need a second for each loop.
            for (int u: w){

                if (max<u){ ///==>if max is less than the next element make the max u...İf you find the greater one make the max the greater one....
                    max=u;
                }

            }


        }  System.out.println(max);

        //2.way:

        int maxValue= intArr [0][0];

        for (int [] w: intArr){

            for (int u: w){

                maxValue= Math.max(maxValue, u);

            }

        }

         //To find the min. value

        int min= intArr[0][0];

        for (int [] w : intArr){

            for( int u : w){

                min=Math.min(min, u);
            }
        }
        System.out.println(maxValue+min);

















    }



















}
