package day4;

import java.util.Random;

public class Task2 {

    public static int[] array = new int[100];

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
        }

        for (int numbers2: array) {
            if (numbers2 > max)
                max = numbers2;
        }
        System.out.println("Наибольший элемент массива: " + max);


        for (int numbers3: array){
            if (numbers3 < min)
                min = numbers3;
        }
        System.out.println("Наименьший элемент массива: " + min);

        int ten = 0;
        for (int numbers4: array){
            if (numbers4 % 10 == 0)
                ten = numbers4;
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + ten );
        ten += ten;
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + ten);


    }

}





