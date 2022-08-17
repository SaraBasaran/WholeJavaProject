package day11;

public class Day11WhileLoop02Review {


    public static void main(String[] args) {

        //if reverse is same with the given number it is called palindrome.
        //121==>121         123321==>123321

        /*int i= 1215;//==> we need to convert to string to be able to take value of char value...
        String iS= String.valueOf(i);//it will convert value to string

        int k= iS.length()-1; //to be able to read from right to left ı will add -1 for index accuracy
        String reversed = "";

        while(k>=0)
            reversed = reversed+ iS.charAt(k);
        k--;*/
         /*
         the value of reversed caharacter will be processed first...
         */
         int j= 567765;
         String jS= String.valueOf(j);

         int m= jS.length()-1;
         String reversed2= "";

         while (m>=0){

           reversed2= reversed2 + jS.charAt(m);
           m--;
         }
        System.out.println(reversed2);
         if (jS.equals(reversed2)){
             System.out.println("This is palindrome");
         }else {
             System.out.println("This is not palindrome");
         }






    }




}
