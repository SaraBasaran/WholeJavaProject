package day28Exception;

public class Exception02 {

    public static void main(String[] args) {
        String[] arr= {"A", "B", "C"};

        getElementFromArray(arr, 0); //A ==> to call that method you need to have a method
        getElementFromArray(arr, 3); //if we type "3" java throws "ArrayIndexOutOfBoundsException" ==> from class "ArrayIndexOutOfBoundsException"
                                          //It causes RTE.RunTimeException


    }
    public static void getElementFromArray(String[] s, int idx){ //java gets the element acc. to its index from StringArray

        //at the beginnig we typed like that
        // System.out.println(s[idx]); //gives the array ele. with the given index

        try {
            System.out.println(s[idx]);
                                                    //if we type ==> catch (ArrayIndexOutOfBoundsException e){
                                                    // If we have hundreds of codes for a project
                                                     // we may think it is hard to figure out what kind of execp. we can have
        }catch(Exception e){
            System.err.println(e.getMessage() + "Non-Existing index was used");
                                                    // exception we can put as a class name, to solve this issue we can use "Exception" parent class
        }                                           //instead of ArrayIndexOutOfBoundsException we can put just "Exception".Bec "exception" class
                                                    //is the parent class of "RTE" and "CTE". In RTE class; we have ArithmeticException class,
                                                    // ArrayIndexOutOfBoundsException class and so on. For CTE; we have many sub-classes too.
                                                    //by this way we do want to execute every single code in complete
                                                    //we do not want our codes to be stopped execution by any single error.
        /*
        What is the advantage of using specific Exception class?
        It increases readability and makes you more experienced. Also, it makes java's work faster. Bec. if you type proper Exception class
        directly, you tell java to select directly and java works with it
        but if we do not type exeption class name directly java comes to parent class and then selects RTE or CTE and then chooses subclass.
         */

    }




}
