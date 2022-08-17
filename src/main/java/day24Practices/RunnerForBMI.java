package day24Practices;

import java.util.Scanner;

public class RunnerForBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight");
        double weight=input.nextDouble();
        System.out.println("Enter your height");
        double height=input.nextDouble();

        PrintingBMI person = new PrintingBMI(weight, height);
        person.calculationOfBMI();
    }
}
