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
    public static void congratulations(int count) {
        System.out.println("Correct!");
        if (count == 2) {
            System.out.println("Congratulations, " + playerName + "!");
        }
    }
    public static void stringQestion(String condition, String questions) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(condition
                + "\nQuestion: " + questions
                + "\nYour answer:");
        stringAnswer = scanner.next();
    }
    public static String getStringAnswer() {
        return stringAnswer;
    }
    public static void intQestions(String condition, String questions) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(condition
                + "\nQuestion: " + questions
                + "\nYour answer:");
        intAnswer = scanner.nextInt();
    }
    public static int getIntAnswer() {
        return intAnswer;
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
}
