package day12;

import java.util.Scanner;

public class Day12Q7 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter 2 numbers to swap");

        int n1= scan.nextInt();
        int n2= scan.nextInt();
        System.out.println("Before swapping " + n1 + "-"+ n2);

        //1.way
        int temp = n1;
        n1=n2;
        n2=temp;
        System.out.println(n1 + " " + n2);





















    }











}
