package practice10;

public abstract class Q06_Area {
    /*
    Type code to calculate area of rectangle and triangle(use abstraction)
     */

    abstract double rectangle(double width, double height);

    abstract double triangle(double base, double height);

    public void add(int a, int b){
        System.out.println(a+b);
    }
}
