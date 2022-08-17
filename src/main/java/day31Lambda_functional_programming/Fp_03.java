package day31Lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Fp_03 {


    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");
        System.out.println(l);
        printInUpperCase(l);
        System.out.println();
        //printInUpperCase02(l);
        printEleSortedByLength(l);
        System.out.println();
        printEleInReverseAccToLength(l);
        System.out.println();
        printDistinctSortedByLastChar(l);
        System.out.println();
        printSortedByLengthThenInitials(l);//Ali Ali Mark Amanda Tucker Alberto Jackson Mariano Benjamin Christopher
        System.out.println();
        //removeIfLengthGreaterThanFive(l);//[Ali, Ali, Mark]
        System.out.println();
        //printRemoveIfStartingWithAOrEndingWithN(l); //[Mark, Christopher, Mariano, Tucker]
        printRemoveIfStartingWithAOrEndingWithN02(l);
        System.out.println();
        removeIfLengthBetween8and10orEndsWith0(l); //[Mark, Christopher, Tucker]
        System.out.println(checkLengthToBeLessThanTwelve(l));//true
        System.out.println(checkInitialsNotX(l));//true
        System.out.println(checkIfAnyEleEndsWithr(l));//true




    }

    //1)Create a method to print all list ele.s in uppercase
    //1.way
    public static void printInUpperCase(List<String> list) {

        list.stream().map(String::toUpperCase).forEach(UtilsNt::printSameLineWithSpace);
    }

    //2. way
       /* public static void printInUpperCase02(List<String> list){

        list.replaceAll(String::toUpperCase);
            System.out.println(list);
        }*/
    //2)Create a method to print the elements after ordering acc. to their lengths.
    public static void printEleSortedByLength(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length)).forEach(UtilsNt::printSameLineWithSpace);
    }

    //3)Print the ele.s after ordering acc. to their lengths (In reverse order)
    public static void printEleInReverseAccToLength(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(UtilsNt::printSameLineWithSpace);
    }
    //4)Sorting the distinct ele.s by using their last char.s

    public static void printDistinctSortedByLastChar(List<String> list) {
        list.stream().distinct().sorted(Comparator.comparing(UtilsNt::getLastChar)).forEach(UtilsNt::printSameLineWithSpace);
    }

    //5)Create a method to sort the ele.s acc. to their lengths then acc. to their first char.
    public static void printSortedByLengthThenInitials(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(t -> t.charAt(0))).forEach(UtilsNt::printSameLineWithSpace);

    }
//    //6)Remove the ele.s if the length of the elemnt is greater than 5.
//   public static void removeIfLengthGreaterThanFive(List<String > list){
//           list.removeIf(t->t.length()>5);
//       System.out.println(list);
//   }
    //7Remove the ele.s if ele. start with "A", "a" or ending with "N", "n"

    //1.way
//  public static void printRemoveIfStartingWithAOrEndingWithN(List<String> list){
//
//           list.removeIf(t->t.charAt(0)=='A' || t.charAt(0)=='a' || t.charAt(t.length()-1)=='N' || t.charAt(t.length()-1)=='n');
//      System.out.println(list);
//  }
    //2.way
    public static void printRemoveIfStartingWithAOrEndingWithN02(List<String> list) {
        list.removeIf(t -> t.charAt(0) == 'A' || t.charAt(0) == 'a' || t.endsWith("N") || t.endsWith("n"));
        System.out.println(list);

    } //8) Remove the le. if the ele. length is between 8 and 10 or ending with 'o'

    public static void removeIfLengthBetween8and10orEndsWith0(List<String> list){
        Predicate<String > checkCondition=t ->( t.length() > 7 && t.length() < 11) || t.endsWith("o");
        list.removeIf(t -> checkCondition.test(t));
        System.out.println(list);

    }
    //9)Create a method to check if the lengths of all ele.s are less than 12

    public static boolean checkLengthToBeLessThanTwelve(List<String> list){

        return list.stream().allMatch(t->t.length()<12);//true bec. all are less than 12.

    }
    //10)Create a method to check if the initial any of element is not 'X'
    public static boolean checkInitialsNotX(List<String > list){

        return list.stream().noneMatch(t->t.startsWith("X"));

    }
    //11)Check if at least one of the ele.s ending with "r"

    public static boolean checkIfAnyEleEndsWithr(List<String> list){
     return list.stream().anyMatch(t-> t.endsWith("r"));

    }








}