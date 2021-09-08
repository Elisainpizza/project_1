package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long i = 0;
        while (i < 20000) {
            System.out.print(i + " ");
            i++;
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));



        long startTime2 = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder(0);
        int count = 20000;
        for (int j = 0; j < count; j++) {
           builder.append(j + " ");
        }
        System.out.println(builder.toString());
        long stopTime2 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime2 - startTime2));

    }
}
