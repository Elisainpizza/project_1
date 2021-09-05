package day7;

public class Player {
    private int stamina;
    static final int MAX_STAMINA = 100;
    static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < 6) {
            countPlayers++;
        }

    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }


    public void run() {
        if (stamina == 0) {
            countPlayers--;
            return;
        }
        stamina--;
        if (stamina == 0) {
            countPlayers--;
        }
    }

    public static void information() {
        int count = 6 - countPlayers;
        String counter = "";
        if (countPlayers < 6) {
            switch (count) {
                case 1:
                    counter = " свободное место.";
                    break;
                case 2:
                case 3:
                case 4:
                    counter = " свободных места.";
                    break;
                case 5:
                    counter = "свободных мест.";
            }
            System.out.println("Команды неполные. На поле еще есть " +
                    count + counter);
        }
        else System.out.println("На поле нет свободных мест.");
    }
}






