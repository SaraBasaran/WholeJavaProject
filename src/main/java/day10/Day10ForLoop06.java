package day10;

public class Day10ForLoop06 {

    public static void main(String[] args) {

        /* Find the sum of the digits of decimal part in a double number.

        Ex: 23.1528 ==>1+5+2+8=16

        There are two steps ..1)by using string(we can not do maths operations later on)
                              2)by finding valueOf method ==>converting String value to integer
                              of the integer value(we can do maths operation afterwards)

         */
            //1.way to get decimal part...
        double d= 23.1528;
        String sd= String.valueOf(d);
        System.out.println(sd); //String

        //int idx= sd.indexOf(".") + 1;  //indexOf first digit of the decimal part
        //String decimalPart= sd.substring(idx); //==>>1528 value is here..to find the sum we need to convert string to integer to do math ope.
        //System.out.println(decimalPart);
        //2.way to get decimal part

        String decimalPart= sd.split("\\.")[1];//==>here we add 1 because we will split the part after dot so we put the value one after the dot==>+1...
        int decimalPartInt= Integer.valueOf(decimalPart);//here we convert string to integer
        System.out.println(decimalPartInt); //==>the values ready to be summed up

        int sum = 0;

        for (int i= decimalPartInt; i>0; i=i/10){
        sum= sum + i%10;

        }
        System.out.println(sum);







    }




}
