package practice10;

public class Q06_Child extends Q06_Area{
    @Override
    double rectangle(double width, double height) {
        return width*height;
    }

    @Override
    double triangle(double base, double height) {
        return base*height/2;
    }
}
