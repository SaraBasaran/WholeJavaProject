package Practise04;

import java.util.Arrays;
import java.util.Scanner;

public class PractisesQ5 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int length = input.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element of index" + i);
            arr[i] = input.nextInt();
            System.out.println(Arrays.toString(arr));

        }
        System.out.println("Enter the index you want to remove");
        int removeIdx = input.nextInt();//[
        int brr[] = new int[arr.length-1];

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {

            if (i == removeIdx) {
                continue;

            } else {
                brr[idx] = arr[i];
                idx++;
            }

        } System.out.println(Arrays.toString(brr));





    }
}
