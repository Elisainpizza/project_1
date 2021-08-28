package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int i = a + 1;
        while(i < b){
            if(i % 5 == 0 && i % 10 != 0){
                System.out.print(i + " ");
            }
            i++;
        }

    }
}
