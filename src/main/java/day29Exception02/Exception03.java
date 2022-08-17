package day29Exception02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception03 {

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
