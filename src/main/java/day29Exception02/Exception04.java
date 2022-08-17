package day29Exception02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception04 {
    /*
    It is not good practise to read all char.s one by one in a file==>too much task for java
    For each cahr. you need to type for loop
    There is another way to read the text line by line==>BufferedReader class
     BufferedReader() constructor works with FileReader object so we need to type;
     BufferedReader br= new BufferedReader(new FileReader("address of the file/path"))

     **When we have a text with multiple lines, readLines() first java will read first line==>first line does not equal to
     "null" so java will print it and then java will use readLine() again so all the lines will be printed as long as they
     do not equal to "null".If the line =null then the code will be stopped

     */
    public static void main(String[] args) {
        try { //normally we just typed ==>BufferedReader br= new BufferedReader(new FileReader("src\\main\\java\\day29Exception02\\TextFile01"));
               //java gave CTE bec. it is not sure about the correctness of the path for the file or the existence of the file so we come over
            // FileReader class name and chose add try-catch clauses.

           BufferedReader br= new BufferedReader(new FileReader("src\\main\\java\\day29Exception02\\TextFile01"));

             String line= br.readLine();
             while (line != null){
                 System.out.println(line);
                 line= br.readLine(); //by this way java will repeat the action, each line will be printed in order.
             }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
