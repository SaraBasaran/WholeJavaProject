package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysListReviewWordUsageHowManyTimesChecking {


    public static void main(String[] args) {



        /*
        Count the words in a String one by one
        String is "Ali came to school, and Ayse came to school."==>school, and school. ==> each will be considered as
                                                                   one complete word.So we need to replacAll method
        Ali=1, came=2, to=2, school=2, and=1, Ayse=1

         */


        String str= "Ali came to school, and Ayse came to school.";
        String strWithoutPunct= str.replaceAll("\\p{Punct}", "");
        System.out.println(strWithoutPunct);
        String words[]= strWithoutPunct.split(" ");
        System.out.println(Arrays.toString(words));//==>our logic in here is to get the first one and compare the first one with the next word
        //and then put a counter container to count the same ones counter container will work for each word differently
        //once the word count is completed you should remove it.

        List<String> wordList=new ArrayList<>();//to get the el.s all elements one by one in an epmty list then we should create a container
        //to check one by one

        for (String w: words){
            wordList.add(w);
        }
        String word= ""; // ==>we created this bec. we will check the first word and count
        int counter= 1; //==> we should start from 1 bec. we start counting from an existing number.

        for (int i=0; i<wordList.size(); i++){

            word= wordList.get(i);
            for (int k=i+1; k< wordList.size(); k++){

                if (word.equals(wordList.get(k))){

                    counter++;
                    wordList.remove(k);
                    k--;

                }

            }
            System.out.println( word+ " = "+ counter);
            counter=1;



        }
























    }











}
