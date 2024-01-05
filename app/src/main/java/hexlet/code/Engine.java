package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String playerName;
    public static String getPlayerName() {
        Scanner scanner = new Scanner(System.in);
        playerName = scanner.next();
        return playerName;
    }
    public static void greeting() {
        System.out.println("Welcome to the Brain Games! \n"
                + "May I have your name?");
        String name = getPlayerName();
        System.out.println("Hello, " + name + "!");
    }
    public static void congratulations(int count) {
        System.out.println("Correct!");
        if (count == 2) {
            System.out.println("Congratulations, " + playerName + "!");
        }
    }
    public static void uncorrectAnswer(String answer, String correctAnswer) {
        System.out.println("'" + answer + "' is wrong answer ;(. "
                + "Correct answer was '" + correctAnswer + "'.\n"
                + "Let's try again, " + playerName + "!");

    }
    public static void uncorrectAnswer(int answer, int correctAnswer) {
        System.out.println("'" + answer + "' is wrong answer ;(. "
                + "Correct answer was '" + correctAnswer + "'.\n"
                + "Let's try again, " + playerName + "!");

    }
    public static int gcd(int a, int b) {
        int result = 0;
        for (int i = 1; i <= Math.max(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;
            }
        }
        return result;
    }
    public static boolean isSimple(Integer number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
