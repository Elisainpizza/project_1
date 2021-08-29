package day6;

public class Task1 {
    public static void main(String[] args) {
        Car firstCar = new Car(2021);
        firstCar.info();
        firstCar.setModel("Volvo");
        firstCar.setColor("Yellow");
        firstCar.setYearOfIssue(2010);
        firstCar.speak();
        firstCar.yearDifference(2020);
        System.out.println("\n");
        Motorbike firstMoto = new Motorbike("BMW", "Red", 2006, 2021);
        firstMoto.info();
        firstMoto.speak();
        firstMoto.yearDifference(2020);


    }
}
