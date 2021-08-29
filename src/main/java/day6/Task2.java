package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane firstAir = new Airplane("Korea Aerospace Industries", 2015,76, 40, 0);
        firstAir.setYear(2021);
        firstAir.setLength(80);
        firstAir.fillUp(6000);
        firstAir.fillUp(7000);
        firstAir.info();

    }
}
