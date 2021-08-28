package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            double dividend = reader.nextDouble();
            double divider = reader.nextDouble();
            System.out.println(dividend / divider);
            if(divider == 0){ System.out.println("Деление на 0");
                continue;
            }

        }

    }
}
