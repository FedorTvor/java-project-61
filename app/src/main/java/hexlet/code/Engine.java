package hexlet.code;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Engine {
    private static String playerName;

    public static int getRandomNumber(int factor) {return (int) (Math.random() * factor);}
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
    public static void stepGame(String condition, String[][] question, int finalCount) {
        Scanner scanner = new Scanner(System.in);
        for (var count = 0; count <= finalCount; count++) {
            System.out.println(condition
                    + "\nQuestion: " + question[count][1]
                    + "\nYour answer:");
            var answer = scanner.next();
            if (answer.equals(question[count][2])) {
                System.out.println("Correct!");
                if (count == finalCount) {
                    System.out.println("Congratulations, " + playerName + "!");
                    count++;
                }
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was '" + question[count][2] + "'.\n"
                        + "Let's try again, " + playerName + "!");
                System.exit(0);
            }
        }
    }
    public static String getYesOrNo(boolean meaning) {
        if (meaning) {
            return "yes";
        } else {
            return "no";
        }
    }

}
