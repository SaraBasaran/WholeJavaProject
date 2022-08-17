package day04;

import java.util.Scanner;

public class Day04Scanner03 {

    /*
    Ask user to enter the width, length and the height of a rectangular prism then find the volume.
    Volume = width * length * height
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the width of rectangular prism");

        double width = input.nextDouble();

        System.out.println("Enter the length of rectangular prism");
        double length = input.nextDouble();

        System.out.println("Enter the height of rectangular prism");
        double height = input.nextDouble();

        System.out.println("The volume of the prism is: " + (width*length*height));





    }
}
