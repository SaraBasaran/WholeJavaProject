package day04;

public class Day04Operations {


    /* Operations in Java

    1) + , - ,* , /

    Order of operations: a)You should complete Operations inside paranthesis
                         b)If completed all, multiplications and divisions
                         c)after doing mult. and div.s then, complete add.s and subtractions

     2) Increment(increasing) and Decrement(decreasing) operations

                         Increment==>> addition and multiplication
                         Decrement==>> subtraction and division

     3) Comparison Operators:
                      > , < , >= , <= , == , !=

                      Note: In Math, single '=' means equality but in Java, double equal sign '==' means equality.
                      Note: '!' means 'not ' and '!=' means 'not equal'.
                      Note: All comparison operators return boolean with the answer 'true' or 'false'.

     4) Logical Operators:
     3)Comparison Operator
    >, <, >=, <=, ==, !=
    Note: In math, single equal sign'='means equality but in Java equal sign '==' means equality.
    Note: In Java, '!' means 'not' so '!=' means not equal.
    Note: All comparison operators return boolean

    4)Logical Operators
    i) AND Operator : && ==>This operator is used between two boolean value
        true && true ==> true
        true && false ==> false
        false && true ==> false
        false && false ==>false
    ii) OR Operator : || ==> This operator is used between two boolean value
        true || ture ==> true
        ture || false ==> true
        false || true ==> true
        false || false ==> false
        **there is a slight difference between usage of two && operators and one & operator.
        **for && Java will check only the first psrt for the false values and stop and result will be false
        **but for & Java will go on checking the next condition too.

     */


    public static void main(String[] args) {

        // for the first group of operations;

        int result = 10 - 6/ (2 + 5/5) + 7;
        System.out.println(result);

        //for Increment and Decrement operations;

        //instead of typing int a = 12;  and a = a +3;..We should type in the following way.

        int a = 12;
        a+=3;
        System.out.println(a); //15

        int b = 4;

        // instead of typing with repetition b = b + 4;

        b*=3;
        System.out.println(b);

        //Decrement

        int c = 18;
        c-=3;
        System.out.println(c);

        int d = 24;
        d/= 4;
        System.out.println(d);

        //Increment and Decrement by 1
        //**That syntax is used just to increase by 1 not the other numbers.

        int e = 12;
        e = e+1;
        e+=1;
        e++;
        System.out.println(e);

        int f = 13;
        f = f - 1;
        f-= 1;
        f--;
        System.out.println(f);

        //Comparison Operators

        int h = 12;
        int i = 13;

        System.out.println(h < i);//true
        System.out.println(h==i);//false
        System.out.println(h<=i);//true: if one operator sign is valid for math. ope. then accepted as true by Java.
        System.out.println(h!=i);//true

        //Logical Operator
        System.out.println(3<4 && 5>1);//true
        System.out.println(3>4 && 5>1);//false
        System.out.println(3>4 || 5<6);//true

        //Post-Increment and Pre-increment
        //post increment means you will put the name of the variable and then you will put ++.

        int x = 12;
        int y= x++;
        System.out.println(y);//12 as the assignment sign is there for post increment y will be 12 but x will be 13.

        //pre-increment
        int m= 12;
        int n = ++m;
        System.out.println(m);//13 because n and m are both 13 because when you complete that line both n and m values'
                              //will change.

















    }












}
