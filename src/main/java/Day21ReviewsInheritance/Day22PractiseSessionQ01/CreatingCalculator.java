package Day21ReviewsInheritance.Day22PractiseSessionQ01;

public class CreatingCalculator {

    public void add(double ... a){ //by this way we can calculate any number of numbers
        double sum=0;
        for (double w:a){
            sum+=w;
        }
        System.out.println("Sum is: " + sum);

    }

    public void subtract(double a, double b){
        System.out.println("The result is: " + (a-b));
    }
    public void multiply(double... a) {

        double product = 1; //we should put "1" to see the result without any change
        for (double w : a) {
            product *= w;

        }
        System.out.println("The product is: " + product);

    }
    public void divide(double a, double b){

        if (b==0){
            System.out.println("Do not use 0 for the second parameter");

        }else{
            System.out.println("Quotient is: " +(a/b));
        }

    }
}
