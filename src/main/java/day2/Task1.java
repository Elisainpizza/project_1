package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите количество этажей:");
        Scanner reader = new Scanner(System.in);
        int floors = reader.nextInt();
        if(floors <= 0){
            System.out.println("Ошибка ввода");
        }
        else if(floors >= 1&&floors <= 4) {
            System.out.println("Малоэтажный дом");
        }
        else if(floors >= 5&&floors <= 8){
            System.out.println("Среднеэтажный дом");
        }
        else{
            System.out.println("Многоэтажный дом");
        }




    }
}
