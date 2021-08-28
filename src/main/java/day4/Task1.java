package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int arrayLength = reader.nextInt();
        Random rand = new Random();
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i ++)
            array[i] = rand.nextInt(10);
        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: "+ array.length);

        int counter8 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8)
                counter8++;
        }
        System.out.println("Количество чисел больше 8: " + counter8);

        int counter1 = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == 1)
                counter1++;
        }
        System.out.println("Количество чисел равных 1: " + counter1);

        int counter2 = 0;
        for (int i = 0; i < array.length; i++)  {
            if (array[i] % 2 == 0)
                counter2++;
        }
        System.out.println("Количество четных чисел: " + counter2);

        int counter3 = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0)
                counter3++;
        }
        System.out.println("Количество нечетных чисел: " + counter3);

        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }

}


