package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args){
        Random random = new Random();
        for (int i = 90; i < 101; i++) {
            random.nextInt();
        }
        Player player1 = new Player(92);
        Player player2 = new Player(95);
        Player player3 = new Player(94);
        Player.information();
        Player player4 = new Player(99);
        Player.information();
        Player player5 = new Player(90);
        Player player6 = new Player(100);
        Player.information();
        Player player7 = new Player(93);
        Player.information();
    }


}

