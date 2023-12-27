package hexlet.code;

import java.util.Scanner;

public class GameLogic {
    public static void evenNumber() {
        Scanner scanner = new Scanner(System.in);
        for (var count = 0; count <= 2; count++) {
            int randomNumber = (int) (Math.random() * 10);
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.\n"
                    + "Question:" + randomNumber
                    + "\nYour answer:");
            String answer = scanner.next();
            if (randomNumber % 2 == 0) {
                if (answer.equals("yes")) {
                    Engine.congratulations(count);
                } else {
                    Engine.uncorrectAnswer(answer, "yes");
                    break;
                }
            } else {
                if (answer.equals("no")) {
                    Engine.congratulations(count);
                } else {
                    Engine.uncorrectAnswer(answer, "no");
                    break;
                }
            }
        }
    }
    public static void calc() {
        Scanner scanner = new Scanner(System.in);
        for (var count = 0; count <= 2; count++) {
            var randomGame = (int) (Math.random() * 10);
            var randomNumber1 = (int) (Math.random() * 100);
            var randomNumber2 = (int) (Math.random() * 100);
            if (randomGame % 2 == 0) {
                System.out.println("What is the result of the expression?\n"
                        + "Question:" + randomNumber1 + " + " + randomNumber2);
                int answer = scanner.nextInt();
                System.out.println("Your answer: " + answer);
                if (answer == randomNumber1 + randomNumber2) {
                    Engine.congratulations(count);
                } else {
                    var correct = randomNumber1 + randomNumber2;
                    Engine.uncorrectAnswer(answer, correct);
                    break;
                }
            } else if (randomGame % 3 == 0) {
                System.out.println("What is the result of the expression?\n"
                        + "Question:" + randomNumber1 + " - " + randomNumber2);
                int answer = scanner.nextInt();
                System.out.println("Your answer: " + answer);
                if (answer == randomNumber1 - randomNumber2) {
                    Engine.congratulations(count);
                } else {
                    var correct = randomNumber1 - randomNumber2;
                    Engine.uncorrectAnswer(answer, correct);
                    break;
                }
            } else {
                System.out.println("What is the result of the expression?\n"
                        + "Question:" + randomNumber1 + " * " + randomNumber2);
                int answer = scanner.nextInt();
                System.out.println("Your answer: " + answer);
                if (answer == randomNumber1 * randomNumber2) {
                    Engine.congratulations(count);
                } else {
                    var correct = randomNumber1 * randomNumber2;
                    Engine.uncorrectAnswer(answer, correct);
                    break;
                }
            }
        }
    }
    public static void greatestCommonDivisor() {
        Scanner scanner = new Scanner(System.in);
        for (var count = 0; count <= 2; count++) {
            var randomNumber1 = (int) (Math.random() * 100);
            var randomNumber2 = (int) (Math.random() * 100);
            int num = Engine.gcd(randomNumber1, randomNumber2);
            System.out.println("Find the greatest common divisor of given numbers.\n"
                    + "Question:" + randomNumber1 + " " + randomNumber2);
            int answer = scanner.nextInt();
            if (answer == num) {
                Engine.congratulations(count);
            } else {
                Engine.uncorrectAnswer(answer, num);
                break;
            }
        }
    }
}
