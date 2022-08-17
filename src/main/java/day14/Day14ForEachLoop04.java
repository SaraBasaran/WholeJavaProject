package day14;

import javax.naming.InitialContext;
import java.util.Arrays;
import java.util.Comparator;

public class Day14ForEachLoop04 {

    public static void main(String[] args) {
        //Find the longest word in the sentence.

        String sentence="JavaJava is easy if you study. Actually nothing is easy if you do not study.";

        //Remove the punctuation marks.
        //Put every word in an array==>[Java, is, easy, if, you, study., Actually, nothing, is, easy, if, you, do not, study,]
        //Sort the array elements according to the lengths==>[do, is, is, if, if, not, Java, easy, easy, study, nothing, Actually]
        //Last element will be the longest one.

        String sentenceWithoutPunctuation= sentence.replaceAll("\\p{Punct}", "");//regex"\\p{Punct} means the all punctuation in the sentence
        System.out.println(sentenceWithoutPunctuation);  //Java is easy if you study Actually nothing is easy if you do not study

        String words[] = sentenceWithoutPunctuation.split(" ");
        System.out.println(Arrays.toString(words)); //==>[Java, is, easy, if, you, study, Actually, nothing, is, easy, if, you, do not, study]

         Arrays.sort(words,Comparator.comparingInt(String::length).reversed());//instead of using -1 of the last index we used String::length.reversed.
        System.out.println(Arrays.toString(words));
        System.out.println(words[0]);//Actually

        //How to see all the longest elements if there are many

        for (String w: words){
            if(w.length()== words[0].length()){

                System.out.println(w + " ");//that code will print the element the first element and the equally has same numbers of chars of the words in a sentence

            }
        }
             String stuNames= "Garry Sementa, Aisha Karlyle, JavaJava Mary, Okabunga Kiwalay";
             String namesWithoutPunct = stuNames.replaceAll("\\p{Punct}", " ");
             String names []= {String.valueOf(namesWithoutPunct.split(" "))};



             String strName= "Tom Hanks";
        System.out.println(strName);

        String convFirstName= strName.substring(3);
        System.out.println(convFirstName);






    }




















}
