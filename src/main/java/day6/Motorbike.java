package day6;

public class Motorbike {
    private String model;
    private String color;
    private int yearOfIssue;
    private int inputYear;

    public Motorbike(String model, String color, int yearOfIssue, int inputYear){
        if (model.isEmpty()) {
            System.out.println("Enter model of motorbike");
        }
        else { this.model = model; }

        if (color.isEmpty()) {
            System.out.println("Enter color of motorbike");
        }
        else { this.color = color; }

        this.yearOfIssue = yearOfIssue;

        if (inputYear < 0) {
            System.out.println("Incorrect");
        }
        else this.inputYear = inputYear;
    }

    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void speak() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year of issue: " + yearOfIssue);
    }
    void info() {
        System.out.println("This is a motorbike.");
    }
    int yearDifference (int inputYear) {
        this.inputYear = inputYear;
        int dif = inputYear - yearOfIssue;
        System.out.println("Difference: " + dif);
        return dif;
    }
}
