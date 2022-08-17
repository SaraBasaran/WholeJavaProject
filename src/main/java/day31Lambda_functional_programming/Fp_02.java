package day31Lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp_02 {
    /*
   1) "variable or variables or zero variable" -> "logic"
    This structure is called "lambda expression"

   2)In "functional programming" we can use lambda expressions, is allowed but not recommended.
     Instead of lambda expression, we prefer to use "method reference"

   3)Method Reference is "class name::Method name".
   For ex; "String::length"(Do not use method parenthesis, type just method name)
           "Arrays::toString"
   You can  use your own class as well, for ex; you create an "Animal Class" and you have "eat()" method in animal class
   "Animal::eat"


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

           printElementsFunctional(l);
        System.out.println();
           printevenelementsFunctional(l);
        System.out.println();
        printSquareOfOddElements(l);
        System.out.println();
        printCubeOfDistinctOddElements(l);
        System.out.println();
        sumOfSquaresOfDistinctEvenEle01(l);
        System.out.println();
        sumOfSquaresOfDistinctEvenEle02(l);
        productOfCubesOfDistinctEvenElements(l);
        getMaxEle01(l);
        getMinGreaterThanSeven01(l);
        halfOfEleDistinctAndGreaterThanFiveInReverse(l);


    }
    //1)Create a method outside the main method to print the list ele.s on the console in the same line with space.
    // between two consecutive elements.(Functional with reference)
    public static void printElementsFunctional(List<Integer> list) {

    list.stream().forEach(UtilsNt::printSameLineWithSpace);
    }
    //2)Create a method outside the main method to print the list ele.s on the console in the same line with space.
    //between two consecutive elements.(Functional with reference)
    public static void printevenelementsFunctional(List<Integer> list) {

        list.stream().filter(UtilsNt::checkToBeEven).forEach(UtilsNt::printSameLineWithSpace);
    }
    //3)Create a method to print the square of odd list ele.s on the console in the same line with space.
    // between two consecutive elements.(Functional with reference)
    public static void printSquareOfOddElements(List<Integer> list){
        list.stream().filter(UtilsNt::checkToBeOdd).map(UtilsNt::getSquare).forEach(UtilsNt::printSameLineWithSpace);

    }
    //4)Create a method to print cube of distinct odd list ele.s on the console in the same line with space.
    // between two consecutive elements.
    public static void printCubeOfDistinctOddElements(List<Integer> list){
        list.stream().distinct().filter(UtilsNt::checkToBeOdd).map(UtilsNt::getCube).forEach(UtilsNt::printSameLineWithSpace);
    }
    //5) Create a method to calculate the sum of the squares of distinct even elements.
    //1.way
    public static void sumOfSquaresOfDistinctEvenEle01(List<Integer> list){
       Integer sum= list.stream().distinct().filter(UtilsNt::checkToBeEven).map(UtilsNt::getSquare).reduce(0,Math::addExact);
        System.out.println(sum);
    }
    //2. way
    public static void sumOfSquaresOfDistinctEvenEle02(List<Integer> list){
        Integer sum= list.stream().distinct().filter(UtilsNt::checkToBeEven).map(UtilsNt::getSquare).reduce(0,Integer::sum);
        System.out.println(sum);
    }
    //6)Create a method to calculate the product of the cubes distinct even elements.
    public static void productOfCubesOfDistinctEvenElements(List<Integer> list){
      Integer product=list.stream().distinct().filter(UtilsNt::checkToBeEven).map(UtilsNt::getCube).reduce(1,Math::multiplyExact);
        System.out.println(product);
    }
    //7)Create a method to find the maximum value from the list ele.s

    public static void getMaxEle01(List<Integer> list){
        Integer max=list.stream().distinct().reduce(Integer.MIN_VALUE, Math::max);
        System.out.println(max);
    }
    //8)Homework==>Create a method to get the min. value of the elements.(method reference)

    //9)Create a method to find the min value which is greater than 7 and even from the list
    //1.way
    public static void getMinGreaterThanSeven01(List<Integer> list){
        Integer min= list.stream().distinct().filter(t-> t>7).filter(UtilsNt::checkToBeEven).reduce(Integer.MAX_VALUE, Math::min);
        System.out.println(min);
    }
    //10)Create a method to find the half of each ele.s which are distinct and greater than 5. in reverse order in the list.
    public static void halfOfEleDistinctAndGreaterThanFiveInReverse(List<Integer>list){
        List <Double> result= list.stream().distinct().filter(t->t>5).map(UtilsNt::getHalf).sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(result);
    }










    }
