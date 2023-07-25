/*Create a Circle class representing a circle with the following characteristics:

        Private field radius (radius) of double type.
        Constructor to initialize the radius of the circle.
        getArea() method to get the area of a circle.
        getCircumference() method to get the circumference of a circle.
        Next, in the main method of the Main class, create an object of type Circle with the given radius,
        and display information about the circle, including its area and circumference, on the screen.*/


package day2Practice.CircleAreaPrivate;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}
