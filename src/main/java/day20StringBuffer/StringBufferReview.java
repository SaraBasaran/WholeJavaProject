package day20StringBuffer;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class StringBufferReview {

    public static void main(String[] args) {

       String str="Java";
        LocalDateTime time1=LocalDateTime.now();//before executing to get the time of process
        perfOfStrBuffer(str);

        LocalDateTime time2= LocalDateTime.now();//the time of execution for buffer
        perfOfStringBuilder(str);

        LocalDateTime time3= LocalDateTime.now();//after executing the process I will get the time for builder
        perfOfStringBuilder(str);

        System.out.println("StringBuffer time: " + time1.until(time2, ChronoUnit.NANOS));
        System.out.println("StringBuilder time: " + time2.until(time3, ChronoUnit.NANOS));

    }

    public static StringBuffer perfOfStrBuffer(String str){

        StringBuffer strBuffer=new StringBuffer(str);
        for (int i=0; i<10000; i++){
            strBuffer.append("abc");
        }
        return strBuffer;

    }

    public static StringBuilder perfOfStringBuilder (String str){

        StringBuilder strBuilder= new StringBuilder(str);
        for (int i= 0; i<10000; i++){
            strBuilder.append("abc");
        }
        return strBuilder;
    }












}
