package day9.Task2;

public class Rectangle extends Figure{
    double width;
    double height;

    public Rectangle(String color, double width, double height) {
        super (color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        double areaR = Math.pow(width, 2) * Math.pow(height, 2);
        return areaR;
    }
    @Override
    public double perimeter() {
        double perimeterR = (2 * width) * (2 * height);
        return perimeterR;
    }
}
