
package day2Practice.CircleAreaPrivate;

public class Circle {
    private double radius;
    private final double PI = Math.PI;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    private double searchAra() {
        return (PI * (radius * radius));
    }
    public double getArea() {
        return  searchAra();
    }

    private double Circumference() {
        return (2 * (radius *  PI));
    }
    public double getCircumference() {
        return  Circumference();
    }

}
