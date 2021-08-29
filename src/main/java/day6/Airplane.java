package day6;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;
    private int n;

    public Airplane(String producer, int year, int length, int weight, int fuel) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        fuel = 0;
        this.fuel = fuel;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
    void info() {
        System.out.println("Изготовитель: " + producer +
                ", год выпуска: " + year +
                ", длина: " + length +
                " м, масса: " + weight +
                " т, количество топлива в баке: " + fuel + "л");
    }
    int fillUp(int n) {
        this.fuel = n;
        return n;
    }
}
