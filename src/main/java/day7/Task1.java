package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane first = new Airplane("Korea airlines", 2006, 40,40, 6000);
        Airplane second = new Airplane("Australia airlines", 2010, 40, 25, 4000);
        Airplane.compareAirplanes(first, second);


    }
}