package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while(true){
            double dividend = reader.nextDouble();
            double divider = reader.nextDouble();
            if(divider == 0)
                break;
            System.out.println(dividend / divider);
        }

    }
}
