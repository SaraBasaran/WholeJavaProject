package day24Practices;

public class ChildArea extends CalcAreaOfRectAndTriangWithAbs{


    @Override
    double areaOfRect(double width, double height) {
        return width*height;
    }

    @Override
    double areaOfTriangle(double base, double height) {
        return base*height/2;
    }
}
