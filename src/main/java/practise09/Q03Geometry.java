package practise09;

public class Q03Geometry {

    //Create a Java programme to calculate the volume of cylinder and rectangular prism. (Use inheritance)

    public double volumeOfCylinder(double radius, double height){

        final int pi= (int) 3.14;
        return pi*radius*radius*height;


    }

    public double volumeOfRectangularPrism(double width, double height, double length){

        return width*height*length;

    }






}
