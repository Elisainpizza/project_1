package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike first = new Motorbike("Volvo", "Blue", 2021);
        first.speak();
    }
}

class Motorbike {
    private String model;
    private String color;
    private int yearOfIssue;

    public Motorbike(String model, String color, int yearOfIssue){
        if (model.isEmpty()) {
            System.out.println("Enter model of motorbike");
        }
        else { this.model = model; }

        if (color.isEmpty()) {
            System.out.println("Enter color of motorbike");
        }
        else { this.color = color; }

        this.yearOfIssue = yearOfIssue;
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
}
