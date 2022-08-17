package Day21ReviewsInheritance.Day22PractiseSessionQ01;

public class CalculateVolumeOfCube {

    //Create a method to calculate volume of cube, square prism and rectangular prism.

    public double volumeOfCube(double a){  // a*a //just one value of one edge is enough all are equal in length.

         return a*a*a;

    }
    public static double volumeOfSquarePrism(double a, double b){ //kare prizma==>a*a*b

        return a*a*b;

    }

    public static double volumeOfRectangularPrism(double a, double b, double c){

           return a*b*c;
    }



}
