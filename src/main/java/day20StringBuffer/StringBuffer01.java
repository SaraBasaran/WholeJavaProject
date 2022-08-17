package day20StringBuffer;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class StringBuffer01 {


    //String class is immutable.
        /*The diff. between string class and string buffer.

        1)String class gives you immutable strings. If you need "Mutable Strings" you can use "StringBuilder"
        or "StringBuffer" classes==> In string class original value cannot be updated but if it is mutable
        java will automatically update the "StringBuilder" or "StringBuffer" objects.

        2)When Java was created, Java created "StringBuffer" Class. But then in Java 1.5 version, (for now we use java 17) "StringBuilder" came to the
        stage.StringBuffer is before Stringbuilder...
        3)"StringBuffer" is multi-thread and syncronized but "StringBuilder" is not multithread and synchronized.
        StringBuffer has more features but even StrinBuilder has been created later than but StringBuilder is fASTER THAN StringBuffer bec. it has less features.
        Java did that to provide faster mutable Strings to developers.

        4) When to use "String", "StringBuilder", "StringBuffer".
        String: If you want to operate with small amount of the data use "String".//using state names of USA==>small data for java.
        StringBuilder: If you need single thread operations with large data in fast pays use "StringBuilder"...
        StringBuffer: MultiThread operations with large amount of data needs "StringBuffer".


         */


    public static void main(String[] args) {

        String str="Java";
        LocalDateTime time1=LocalDateTime.now();//we are checking the diff. of time process between two stringbuilder and string buffer
        performanceOfStringBuffer(str);
        LocalDateTime time2=LocalDateTime.now();
        performanceOfStringBuilder(str);
        LocalDateTime time3=LocalDateTime.now();
        System.out.println("StringBuffer time: " + time1.until(time2, ChronoUnit.NANOS));//to check performance of the classes...
        System.out.println("StringBuilder time: " + time2.until(time3, ChronoUnit.NANOS));//StringBuilder is faster İf you need speed use StringBuilder
                                                                                          //if you need multi-thread and synchronization use StringBuffer

    }

    public static StringBuffer performanceOfStringBuffer(String str) {

        StringBuffer strBuffer = new StringBuffer(str);

        for (int i=0; i<10000; i++){
            strBuffer.append("abc"); //to see the speed of process we are appending "abc" 1000 times.
                                     //we will compare the speed of process with Stringbuilder...
        }
         return strBuffer;

    }

    public static StringBuilder performanceOfStringBuilder(String str) {

        StringBuilder strBuilder = new StringBuilder(str);

        for (int i = 0; i < 10000; i++) {
            strBuilder.append("abc");//builder is faster...
        }
        return strBuilder;
    }










}