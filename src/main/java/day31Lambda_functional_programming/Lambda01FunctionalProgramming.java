package day31Lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01FunctionalProgramming {
    /*
    1)Lambda is "Functional Programming", we started using lambda in Java 8.
    2)In Functional Programming we focus on 'What to do?' but in Structured Programming we focus on 'How to do?'
    3)Functional Programming can be used just with Arrays and Collections.
    4)By using 'entrySet()' method you can convert Map to Set then you can use Functional Programming in Maps as well.
     */

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        System.out.println(l);
        printElementsStructured(l);
        System.out.println();
        printElementsFunctional(l);
        System.out.println();
        printEvenElementsStructured(l);
        System.out.println();
        printevenelementsFunctional(l);
        System.out.println();
        printSquareOfOddElements(l);
        System.out.println();
        printCubeOfDistinctOddElements(l);//729 2248091
        System.out.println();
        sumOfSquaresOfDistinctEvenEle(l);//168
        System.out.println();
        productOfCubesOfDistinctEvenElements(l);//4096000
        System.out.println();
        getMaxEle01(l);//131
        getMaxEle02(l);
        getMinEle01(l);
        getMinEle02(l);
        getMinGreaterThanSeven01(l);
        getMinGreaterThanSeven02(l);
        getMinGreaterThanSeven03(l);
        halfOfEleDistinctAndGreaterThanFiveInReverse(l);
    }

    //1)Create a method outside the main method to print the list ele.s on the console in the same line with space.
    // between two consecutive elements.(Structured)
    public static void printElementsStructured(List<Integer> list) {

        for (Integer w : list) {

        }
        System.out.print(list);

    }

    //1)Create a method outside the main method to print the list ele.s on the console in the same line with space.
    // between two consecutive elements.(Functional)
    public static void printElementsFunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));//t stands for ele. in lambda codes use this ele. and print it.
    }

    //2)Create a method outside the main method to print the even list ele.s on the console in the same line with space.
    // between two consecutive elements.(Structured)
    public static void printEvenElementsStructured(List<Integer> list) {

        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //2)Create a method outside the main method to print the list ele.s on the console in the same line with space.
    //between two consecutive elements.(Functional)
    public static void printevenelementsFunctional(List<Integer> list) {

        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }

    //3)Create a method to print the square of odd list ele.s on the console in the same line with space.
    // between two consecutive elements.(Functional)
    public static void printSquareOfOddElements(List<Integer> list){

        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t + " "));


    }
    //4)Create a method to print cube of distinct odd list ele.s on the console in the same line with space.
    // between two consecutive elements.
    public static void printCubeOfDistinctOddElements(List<Integer> list){

        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t + " "));

        //distinct() eliminates the duplicate ele.s==> to take unique ele.s==>using distinct() before filter()
        //makes java work less.Bec. first it eliminates the duplicate ele.s and then filters acc. to task.
    }

    //5) Create a method to calculate the sum of the squares of distinct even elements.
    public static void sumOfSquaresOfDistinctEvenEle(List<Integer> list){

        Integer sum=list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println(sum);

    }
    //6)Create a method to calculate the product of the cubes distinct even elements.
    public static void productOfCubesOfDistinctEvenElements(List<Integer> list){

        Integer product=list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
        System.out.println(product); //8 ve 10 küplerinin çarpımı==> 4096000
    }
         //7)Create a method to find the maximum value from the list ele.s
    //1.way
    public static void getMaxEle01(List<Integer> list){

        Integer max= list.stream().distinct().reduce(Integer.MIN_VALUE, (t,u)->t>u ? t : u );
        System.out.println(max);
    //with the help of distinct() we get unique ele.s
        //reduce() gives the only one result from the process
        //Integer.MınValue() gives min. value of the ele.,==> t and u are put one by one and we tell java to make comparison
        //with the help of ternary.If t is greater than u take t.Even if we seem to use min value we actually take the max. value of the ele.

    }//2.way
    public static void getMaxEle02(List<Integer> list){


        Integer max02= list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u)->u);//after sorting the ele.s java puts the
        //highest value to the end that is why we choose u ele. at the end.
        System.out.println(max02);
    }
    //Homework==>Create a method to get the min. value of the elements.
    //1.way
    public static void getMinEle01(List<Integer> list){
        Integer min01=list.stream().distinct().sorted().reduce(Integer.MAX_VALUE, (t,u)->u);
        System.out.println(min01);

    }

    public static void getMinEle02(List<Integer> list){
        Integer min02=list.stream().distinct().reduce(Integer.MAX_VALUE, (t,u)->t<u? t:u);
        System.out.println(min02);

    }
    //9)Create a method to find the min value which is greater than 7 and even from the list
    //1.way
    public static void getMinGreaterThanSeven01(List<Integer> list){
        Integer min=list.stream().distinct().filter(t->t%2==0).filter(t-> t>7).reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t: u);
        System.out.println(min);
    }

     //2.way
    public static void getMinGreaterThanSeven02(List<Integer> list){

        Integer min=list.stream().distinct().filter(t->t%2==0).filter(t->t>7).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println(min);
    }
    public static void getMinGreaterThanSeven03(List<Integer> list){

        Integer min= list.stream().filter(t->t%2==0).filter(t->t>7).sorted().findFirst().get();
        System.out.println(min);
    }
     //10)Create a method to find the half of each ele.s which are distinct and greater than 5. in reverse order in the list.
     public static void halfOfEleDistinctAndGreaterThanFiveInReverse(List<Integer>list){
       List <Double> result= list.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
         System.out.println(result);
     }



}









