package day29Exception02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception02 {

    public static void main(String[] args) throws IOException {

        /*When typing codes, we can use files and its content to use them in our coding
        There is a file in the same package and we should tell java to read the file first we have to give the address
         of the file.
        java created a class to access files.It is FileInputStream class. It is coming from "io" (input-output operations).When you read
        a file it is output operation bec. you get the file from java class and put it on the console

        By creating obj java can access to the file but if java cannot find the file then we should come over the FileInputStream class word on the left
        and then choose more actions option and ask for add throw Exception to the main method.
        **When we type "throws" keyword with an Exception class name it means if you find the file in the given address use it
        but if the address of the file is wrong or does not exist then throw .... exception.

        1) "throws" keyword is used in method signature line
        2) If you use child and parent after "throws" keyword, java will let you use just the parent.
        3)After "throws" keyword we can use multiple exceptions can be used.
         4) After "throws" keyword", we do not use "new" keyword and "constructor", we use just the Exception Class Names.
         5)"FileNotFoundException" is thrown by Java, if the path is wrong or if the file does not exist
         6)"IOException" handles all the issues related with "input" and "output" operations
         7)"IOException" is the parent class of "FileNotFoundException"
         */

        FileInputStream fis= new FileInputStream("src\\main\\java\\day29Exception02\\TextFile01");//nothing typed on console
                                                 //java will check two conditions1)if the path is true 2)existence of the file
       // FileInputStream fis2= new FileInputStream("src\\main\\java\\day291Exception02\\TextFile01");//if we tell wrong address to java then throws exce.

        int i= 0;//we created an int cont. bec. java will check ascii values of the letters

        while ((i=fis.read()) != -1){ //java removed throws FileNotFoundException and put IOException bec. IO covers FileNotFound. Bec. IO can do
                                      //everything including FileNotFoundException. IO is the parent class of FileNotFoundException.
            System.out.print((char)i); //i==>ascii value and (char) will print letters one by one that is why we do type casting from int to char.
        }

                                                                                                           //FileNotFoundException
    }


}
              /*
    If they ask us to type code to read a text...We should say do you want me to type reading code with read()
    letter by letter or readLine().They do think that you know enough knowledge about java.
    Firstly create a text file==>for reading one by one
    public static void main(String[] args) {
        try {
            FileInputStream fis=  new FileInputStream("src\\main\\java\\day29Exception02\\TextFile01");

                    int i=0; //to check ascıı value of the typed char.s
            while ((i= fis.read()) != -1){ //while typing read() gives CTE bec. java is worried if there is no file or file is deleted. so we choose more
                                           //actions and then "Add try-catch" clauses to the syntax
                System.out.println((char)i); //telling java to check the typed char.s if their ascii value is greater than -1 java will print each char.
                                            //after converting them into char data type.If there is no char at the end then java will give -1 value
                                            //which means while ((i=fis.read()) != -1))==> this is false then the remaining part of the code not executed.
            }
        } catch (IOException e) { //by choosing IOException class we are telling to java if there is a problem with the address of the file,
                                // ask for help by using "Add try-catch blocks" when read() is typed
                                //you can type multiple "catch blocks"
            e.printStackTrace();
        }
    }
}

            If they ask to type code readLine() long lines instead of reading one by one
            firstly create a long text for readLine().
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
    }*/
