package Day21ReviewsInheritance.Day22PractiseSessionQ01;

public class StringJoiningWords {

    // Create a method that joins the given Strings
    // input => "Please", "join", "the", "given", "words"
    // output => "Please join the given words"

    public static void main(String[] args) {

        joinStrings("Please","join", "the", "given", "words");



    }
    public static void joinStrings(String... strings){ //use Varargs with for each loop

        String result= "";

        for (String w: strings){
            result += w+ " "; //to see spaces between the words...

        }
        System.out.println(result);



    }


}
