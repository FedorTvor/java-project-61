package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String playerName() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        Player player = new Player(name);
        return player.getName();
    }
    public static void greeting() {
        System.out.println("Welcome to the Brain Games! \n"
                + "May I have your name?");
        String name = Engine.playerName();
        System.out.println("Hello, " + name + "!");
    }
    public static void congratulations(int count) {
        System.out.println("Correct!");
        if (count == 2) {
            System.out.println("Congratulations, " + Player.getName());
        }
    }
    public static void uncorrectAnswer(String answer, String correctAnswer) {
        System.out.println("'" + answer + "' is wrong answer ;(. "
                + "Correct answer was '" + correctAnswer + "'.\n"
                + "Let's try again, " + Player.getName());

    }
    public static void uncorrectAnswer(int answer, int correctAnswer) {
        System.out.println("'" + answer + "' is wrong answer ;(. "
                + "Correct answer was '" + correctAnswer + "'.\n"
                + "Let's try again, " + Player.getName());

    }
}
