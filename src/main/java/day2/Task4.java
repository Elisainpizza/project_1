package day2;

import java.util.Scanner;
import java.lang.Math.*;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner reader = new Scanner(System.in);
        double x = reader.nextDouble();
        if(x >= 5){
            double y = (Math.pow(x, 2) - 10) / (x + 7);
            System.out.println("y = " + "(x^2 - 10)/(x + 7)" + " = " + y);
        } else if(x < 5 && x > -3){
            double y = (x + 3) * (Math.pow(x, 2) - 2);
            System.out.println("y = " + "(x + 3)(x ^ 2 - 2)" + " = " + y);
        }else System.out.println("420");

    }
}
