package day5;

public class Task1 {
    public static void main(String[] args) {
        Car auto = new Car();
        auto.setModel("Wolksvagen");
        auto.setColor("Blue");
        auto.setYearOfIssue(2021);
        auto.speak();
    }
}

class Car {
    private String model;
    private String color;
    private int yearOfIssue;

    public void setModel(String model) {this.model = model;}
    public String getModel() {return model;}

    public void setColor(String color) {this.color = color;}
    public String getColor() {return color;}

    public void setYearOfIssue(int yearOfIssue) {this.yearOfIssue = yearOfIssue;}
    public int getYearOfIssue() {return yearOfIssue;}

    public void speak(){
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year of issue: " + yearOfIssue);
    }
}
