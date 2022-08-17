package Day19StringImmutability;

public class StringBuilder01 {
    /*
    When you create a class you can make access modifier "public" or "default".
    ===============================================================================
    1)String class is "immutable", but sometimes we need "mutable" Strings bec. of that Java created
    String Builder and String Buffer classes. All 3 Strings will give you String.

    2)When you use "String str1= "Java"; to create a String, Java creates a "String pool" in "Heap" memory
    and puts the str1 object inside the String pool.

    3) When you create a new String by using "String str2="Jack"; ==> Java will check the String pool if there is
    an obj. whose value is same then Java doesnot create a new container, just points the existing one. Java does that to save memory

    4) When multiple pointers point the same object, any update on the obj. will affect the all other Strings but we donot want it.
    To prevent all Strings to be updated Java created "immutability". In "immutability" existing obj.s will not be updated, Java will create a new
    obj. with the new value then change the pointer to the new obj. Just the one you want to update will have a new pointer.

    5) If you want to create diff. objects with the same value you have to use "String newObj= new String("value");==> same obj. with another container

    6) If ANY obj. does not have any pointer , Garbage collector will delete it automatically to make the memory clean.

    7) The difference between "==" and "=":
    "==" for String values ==> to compare Strings, it will check the value and address
    If both are same you will get true.
    "=" ==> will check the value and give value if correct
    String valueA.equals().valueB ==>just checks if the value is same or not (not the addresses). The outcome false or true.

      When we work with Strings, we work with the values mostly. Therefore, we use "equals()" to compare Strings.

     **In Java, String class and Wrapper classes are immutable (Integer, Double, Boolean, Char...)

     */

    public static void main(String[] args) {

        String str1= "Java";
        //we have two types of memory. Stack and Heap memory. Inside heap java created a String pool and address
        //of that string in stack memory.

        String str2= "Java"; //==>Java will go to String pool and check the pool to check any container
                            // whose container has the same value java doesnot create a new cont. to save memo
                             //and just creates a new reference directing to the same container.This is perfect but
                             //that system has a problem
        //str1= "Apex";

        //
        // ==>if java changes str1 to "Apex" then str2 will be "Apex" as well.To save memo java
       // may cause some problem. To make str2 as "Java", once the change is done str2 reference will be
        //updated. So, when you change str1 java will accept the update for str1 differently from str2.
        /*If you donot use immutability once you want to change the value of String then all of the same value holding
        Strings will be changed too.
        **To compare String use "equals" method==> str1 ==str2...
        Double "==" checks value and address of the String.

         str1==str2 are same for ref. and value
         */

        System.out.println(str1==str2);//true
        //if we type just one "=" java checks the value of the String
        //if we change str2 ="Apex"; then the result is false

        str1="Apex";

        System.out.println(str1==str2);

        /*If you make Strings "immutable" then when you change the value of the first given String will affect the other
        copy of the String too.When you update str1 then str2 will be updated too. If you want to check both ref and value
        you should type double equals sign ==> "=="
        but most of the time we need to check just the value for which it is enough to use single equals sign ==> "=".

        Immutable means "unchangeable" after creating String java does not allow you to change the "immutable" Strings
        Once a String is created and another and another String variable is created with the same value then Java will give the same
        ref. address for that String.

         */


//        String str3= "Java";
//        String str4= "Java"; ==>1.reason to save memory
//        String str5= "Java";  ==> all will have the same references.All will point to str1...
//                              ==> 2.reason for immutability: Just a single object wil be used in many tasks.This is called "multi-thread"
//        String str6= "Java";  ==> You create just one object and you are able to do many tasks just using one object.
//        String str7= "Java";   ==>This is the other reason for immutability
//        String str8= "Java";

        /*
        If a company works for only one object.If you have 100 employees and if they work for 100 diff. tasks the work
        will so much complicated bec. of that assign a manager to manage the employees. Manager looks for security, looks for accounting,
        work tracking, customer services etc. Just using one employee java will process just using one value it will assign the same ref.s for others, too.
        Company will talk to manager only and by this way the performance of the company will increase.
     */

     String name="Jack";
     String accountHolder1="Jack"; //after checking the first value the same value holder other strings will have the same ref.s when using immutability
     String accountHolder2="Jack";  //if the first one changes his name, java will create a new container for it and new pointer for it.
     String accountHolder3="Jack";   //so by this way when you create an account you may have same name2 if sb wants to send the money to
                                   // Tom (accountHolder1=Jack) but when you use immutability for first accountHolder java will create
                                 //a new container and a new ref. for it so by this way there will be no confusion.
        /*If you wanna do some critical operation for the first "Jack" do some updates on it then do your critical operation just first one will benefit
        from this operation and then re-update that one then it will be in the same container==>Benefit of immutability for security.

         */

        String s="Sql";      //within the container there is "Sql" but when it is updated
        s="MySql";          //==>updated value a new ref. will be given. What will happen if we update the String?
                            //There is a garbage collector in Java (always scanning the memos) if there is no pointer / ref. then java will delete it
                           //to use memo more efficiently.

        String t= "Jdbc";   //when you create a string value java will create a container inside the pool and will put "Jdbc" and will put pointer for this
                            //if you want to use diff. containers for the same value you need to use "new" keyword...
        String u= new String("Jdbc"); //if the cont.s is in diff. places then you can have diff. ref.s

        System.out.println(t == u);//false
        System.out.println(t.equals(u));//true

           //How to create a StringBuilder object. 1.Class name

        StringBuilder sb1= new StringBuilder("Tom"); //when you type that code you create a String builder obj from StringBuilder class.

        sb1.append("Hanks");  //StringBuilder updates the value with the "append()" method.

        System.out.println(sb1); // TomHanks ==> StringBuilder class is mutable class, you can update it.

//        String sObj1="Tom"; //this will be in a container itself and "TomHanks" in another container
//        sObj1.concat("Hanks");
//        System.out.println(sObj1); //==> Tom bec. String Class is immutable!!! we cannot update the string value by using methods
//                                   //when you want to update String value in Java it will create a copy of it and update the copy version==>TomHanks
//                                   //İf you wanna see the updated value you need to break that pointer and create a new pointer to that one.
//                                   //After update, sObj1=sObj1.concat("Hanks").
//
//
        String sObj1="Tom"; //this updated copy will be in a container itself as "TomHanks" with another pointer.
        sObj1=sObj1.concat("Hanks");
        System.out.println(sObj1);

        //Difference between Immutable and Mutable Classes:

        StringBuilder sb2= new StringBuilder("Hanks");
        System.out.println(sb2);

        int numOfChars= sb2.length();
        System.out.println(numOfChars);  //5 just like length () in String class.==> the number of char.s

        int capacity= sb2.capacity(); //when you create a string builder java gives 16 boxes to type the codes in it and you put "Hanks" over here.
        System.out.println(capacity);  //five of them is used bec. of that java will add 5 more boxes ==>total capacity 21.



        StringBuilder sb3= new StringBuilder("");
        System.out.println(sb3);

        int n= sb3.length();
        System.out.println(n);  //0

        int c= sb2.capacity();
        System.out.println(capacity);//16

        StringBuilder sb4= new StringBuilder();//==> 16 boxes will be given as capacity (as default)
        sb4.append("JavaJavaJava").append("XXXXX");//when you complete 16 + 12 + 5Xs==> boxes will be completed and 1 is lacking
                                                   // so java will give you another 16
        int d= sb4.capacity();
        System.out.println(d);  //34==> if you use more than 16 char.s all "JavaJavaJavaXXXXX==>all will be 17 and 16 more will be given by java
                                //capacity = length + 16 if the value exceeds another 16 boxes will be given for capacity exceeding.


        /* In case we do not need 16 boxes, you can decide the boxes as capacity to save memory.

         */

        //How to decide capacity

        StringBuilder sb5= new StringBuilder(2);
        int e= sb5.capacity();
        System.out.println(e);//2

        //If we exceed the decided capacity, java will give two times of length.

        StringBuilder sb6=new StringBuilder(2);
        sb6.append("FL!");
        int f= sb6.capacity();
        System.out.println(f); //2*2+2 =6

       System.out.println("=====================================");

       StringBuilder trial= new StringBuilder(5);
       trial.append("World!");
       int trialcap= trial.capacity();
       System.out.println(trialcap);

       System.out.println("==========================================");

        StringBuilder sb7= new StringBuilder("Java World");
        sb7.delete(4, 9);
        System.out.println(sb7);//Javad ==> bec. 9 is exclusive
        sb7.delete(4, 10);//==> Java

        StringBuilder sb8= new StringBuilder("Java World");
        sb8.deleteCharAt(4);
        System.out.println(sb8);//8 ==>JavaWorld ==>without space

        StringBuilder sb9= new StringBuilder("Java World");
        sb9.reverse();
        System.out.println(sb9);

        //How to convert a String to StringBuilder

        String str3= "Java";

        StringBuilder sb10= new StringBuilder(str3);
        sb10.reverse();
        System.out.println(str3);  //Java==>String is immutable
        System.out.println(sb10);  //avaJ==> StringBuilder is mutable

//        StringBuilder sb11= new StringBuilder("Java is love");==>not work!!!
//        sb11 = sb11.substring(8);
//        System.out.println(sb11);//the method comes from string class they will behave as immutable...No updates accepted
//

        StringBuilder sb11= new StringBuilder("Java is love");
        String newSb11= sb11.substring(8);
        System.out.println(sb11);//the method comes from string class they will behave as immutable...No updates accepted










    }


















}
