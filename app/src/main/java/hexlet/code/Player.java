package hexlet.code;

public class Player {
    private static String name;
    public Player() {

    }
    public Player(String name) {
        this.name = name;
    }
    public static String getName() {
        return name;
    }
    public void stName(String namePlayer) {
        this.name = namePlayer;
    }
}
