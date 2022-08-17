package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysList03NumOfUsageOfLetters {

    public static void main(String[] args) {

        /*
        Count the number of usage of words in a String one by one
        String is "Ali came to school and Ayse came to school"
        Ali=1, came=2, to=2, school=2, and=1, Ayse=1

         */

        String str= "Ali came to school and Ayse came to school";

        String strWithoutPunct = str.replaceAll("\\p{Punct}", "");
        System.out.println(strWithoutPunct); //==>Ali came to school and Ayse came to school

        strWithoutPunct.split(" ");

        String words[] = strWithoutPunct.split(" ");
        System.out.println(Arrays.toString(words));//[Ali, came, to, school, and, Ayse, came, to, school]
             //**we can not use remove() in arrays so we change the value into lists...
        List<String> wordsList = new ArrayList<>();//now list is empty but when we add we will got the el.s one by one asList
          for (String w : words){
              wordsList.add(w);
          }
        String word= ""; //to store the new string value

        int counter= 1;   //counter should start with "1" because we are counting an existing number or value

        for ( int i=0; i< wordsList.size(); i++){
            word= wordsList.get(i); //while "i" is zero k will be "1"

            for(int k=i+1; k< wordsList.size(); k++){ //inner loop for condition

                if(word.equals(wordsList.get(k))){
                    counter++;
                    wordsList.remove(k);
                    k--;  //we are decreasing k value bec. we need to pass the next idx which is getting less number as proceeded.
                }


            }
            System.out.println(word + " = "+ counter);

           counter=1;
        }













    }

















}
