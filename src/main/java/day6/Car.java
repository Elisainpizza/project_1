package day6;

public class Car {
    private String model;
    private String color;
    private int yearOfIssue;
    private int inputYear;

    public void setModel(String model) {this.model = model;}
    public String getModel() {return model;}

    public void setColor(String color) {this.color = color;}
    public String getColor() {return color;}

    public void setYearOfIssue(int yearOfIssue) {this.yearOfIssue = yearOfIssue;}
    public int getYearOfIssue() {return yearOfIssue;}

    public Car(int inputYear) {
        if (inputYear < 0) {
            System.out.println("Incorrect");
        }
        else this.inputYear = inputYear;
    }

    public void speak() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year of issue: " + yearOfIssue);
    }
    void info() {
        System.out.println("This is a car.");
    }
    int yearDifference (int inputYear) {
        this.inputYear = inputYear;
        int dif = inputYear - yearOfIssue;
        System.out.println("Difference: " + dif);
        return dif;
    }
}
