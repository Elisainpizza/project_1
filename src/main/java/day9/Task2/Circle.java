package day9.Task2;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        double areaC = Math.PI * Math.pow(radius, 2);
        return areaC;
    }

    @Override
    public double perimeter() {
        double perimeterC = Math.PI * radius * 2;
        return perimeterC;
    }

}
