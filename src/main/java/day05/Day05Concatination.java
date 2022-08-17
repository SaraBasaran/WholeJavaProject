package day05;

public class Day05Concatination {


    /*
    Concatination means :  Joining Strings with each other or with other data types.
                           To do concatination we use 2 options;
                           1) Use '+' sign ==> can be used with all data types
                           2)Use 'concat()' method==> inside the concat() method parenthesis you can put
                           just string not the other data types.
     */
    public static void main(String[] args) {

        String s = "Tom";
        String t = "Hanks";
        int i = 12;
        int k = 5;
        char c = 'A';

        System.out.println(s + " " + t);
        System.out.println(s.concat(" ").concat(t));

        System.out.println( s + i + k);

        System.out.println(s + ( i + k));
        System.out.println( i + k + s);
        System.out.println(i+ s + k);
        System.out.println(s+ k*i);
        System.out.println( i + c + s );
        System.out.println( c + s + k);//The result will be just concatination not a math operation.
                                       // Java always process the operations From left to right.
                                       //The result "ATom5"...




    }


}
