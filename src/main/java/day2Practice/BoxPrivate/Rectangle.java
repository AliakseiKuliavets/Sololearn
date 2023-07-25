package day2Practice.BoxPrivate;

public class Rectangle {
    private double width;
    private double height;


    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    private double countArea() {
        if (width <= 0 || height <= 0) {
            return -1;
        } else {
            return (width * height);
        }
    }
    private double countPerimeter() {
        if (width <= 0 || height <= 0) {
            return -1;
        } else {
            return ((width * 2) + (height * 2));
        }
    }
    public double getArea() {
        return countArea();
    }
    public double getPerimeter() {
        return countPerimeter();
    }
}

