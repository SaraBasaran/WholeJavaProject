package day09;

import java.util.Scanner;

public class Day09StringManipulations02 {

    public static void main(String[] args) {
        /*
           Check if a password has the following conditions;
           a)It should not be empty
           b)It should not be just a single spaces
           c)It should not have spaces at the beginning and at the end
           d)'i' should be a character in pwd and first occurence of 'i' should be at index 4.
           e)'K' should be a character in pwd and last occurence of 'K' should be at index 5.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password");
        String pwd = input.nextLine();

        //***isEmpty() checks the String if it is empty or not. If the string is empty
        // it will return true, otherwise it will return false so we should put"!" before pwd variable.

        if (!pwd.isEmpty()) {
            System.out.println("Password is not empty");
        }else {
            System.out.println("Password can not be empty");
        }
        //isBlank();Returns true if the string is empty or contains only spaces, otherwise it will be false.isBlank() covers isEmpty().
        if (!pwd.isBlank()){
            System.out.println("Password has no space");
        }else {
            System.out.println("Password should not be blank");
        }
        if (pwd.length()>0 && pwd.length()==pwd.trim().length()){
            System.out.println("Password has no space at the beginning and at the end");
        }else{
            System.out.println("Password should have spaces at the beginning and at the end");
        }
        if (pwd.indexOf("i")==4){
            System.out.println("Password has 'i' at index 4");
        }else{
            System.out.println("Password  should have 'i' at index 4");
        }
        if (pwd.indexOf("K")==5){
            System.out.println("Password has 'K' at index 5");
        }else{
            System.out.println("Password should have 'K' at index 5");
        }









    }







}
