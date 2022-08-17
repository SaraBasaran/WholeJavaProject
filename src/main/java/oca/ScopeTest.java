package oca;

public class ScopeTest {
    int z;

    public static void main(String[] args) {

        checkStringValues("Bob", "Bob");
        ScopeTest myScope = new ScopeTest();

        int z = 6;
        System.out.println(z);
        myScope.doStuff();
        System.out.println(z);
        System.out.println(myScope.z);

    }
    void doStuff(){
        doStuff2();
        System.out.println(z);
    }
    void doStuff2(){
        z = 4;
    }

    public static void checkStringValues(String a, String b){

        String h1="Bob";
        String h2=new String("Bob");
        if (h1.equals(h2)){
            System.out.println(h1);
        }



    }
}