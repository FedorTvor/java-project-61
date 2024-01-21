package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String playerName;
    private static String stringAnswer;
    private static Integer intAnswer;

    private static final int NUMBER_TO_MULTIPLY_1 = 10;
    private static final int NUMBER_TO_MULTIPLY_2 = 100;
    public static int getRandomNumber1() {
        return (int) (Math.random() * NUMBER_TO_MULTIPLY_1);
    }
    public static int getRandomNumber2() {
        return (int) (Math.random() * NUMBER_TO_MULTIPLY_2);
    }
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
    public static void congratulations(int count, int finalCount) {
        System.out.println("Correct!");
        if (count == finalCount) {
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
    public static void stepGame(String condition, String questions, String correct, int count, int finalCount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(condition
                + "\nQuestion: " + questions
                + "\nYour answer:");
        stringAnswer = scanner.next();
        if (correct.equals(stringAnswer)) {
            congratulations(count, finalCount);
        } else {
            uncorrectAnswer(stringAnswer, correct);
            System.exit(0);
        }
    }
    public static void stepGame(String condition, String questions, int correct, int count, int finalCount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(condition
                + "\nQuestion: " + questions
                + "\nYour answer:");
        intAnswer = scanner.nextInt();
        if (correct == intAnswer) {
            congratulations(count, finalCount);
        } else {
            uncorrectAnswer(intAnswer, correct);
            System.exit(0);
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
