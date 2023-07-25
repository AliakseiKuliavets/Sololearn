/*
Создайте класс Rectangle, представляющий прямоугольник, со следующими характеристиками:

        Приватные поля: width (ширина) и height (высота) типа double.
        Конструктор для инициализации ширины и высоты прямоугольника.
        Методы getArea() и getPerimeter() для получения площади и периметра прямоугольника соответственно.
        Приватный метод isValid() для проверки, что ширина и высота прямоугольника положительные числа.
        Если ширина или высота отрицательные или равны 0, то прямоугольник считается недопустимым,
        и значения площади и периметра должны быть равны -1.
        Далее, в методе main класса Main, создайте два объекта типа Rectangle с разными значениями ширины и высоты.
        Выведите информацию о каждом прямоугольнике, включая его площадь и периметр, на экран.


 Create a Rectangle class representing a rectangle with the following characteristics:

        Private fields: width (width) and height (height) of type double.
        Constructor to initialize the width and height of the rectangle.
        Methods getArea() and getPerimeter() to get the area and perimeter of the rectangle, respectively.
        The private isValid() method to check that the rectangle's width and height are positive numbers.
        If the width or height is negative or equal to 0, then the rectangle is considered invalid,
        and the area and perimeter values must be -1.
        Next, in the main method of the Main class, create two Rectangle objects with different width and height values.
        Print information about each rectangle, including its area and perimeter, on the screen.

*/





package day2Practice.BoxPrivate;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5.0, 10.0);
        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Height: " + rectangle1.getHeight());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle(7.5, 3.0);
        System.out.println("\nRectangle 2:");
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Height: " + rectangle2.getHeight());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }
}
