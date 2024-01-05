package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    public static void calc() {
        Scanner scanner = new Scanner(System.in);
        for (var count = 0; count <= 2; count++) {
            var randomGame = Engine.getRandomNumber(10);
            var randomNumber1 = Engine.getRandomNumber(100);
            var randomNumber2 = Engine.getRandomNumber(100);
            if (randomGame % 2 == 0) {
                System.out.println("What is the result of the expression?\n"
                        + "Question: " + randomNumber1 + " + " + randomNumber2);
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
                        + "Question: " + randomNumber1 + " - " + randomNumber2);
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
                        + "Question: " + randomNumber1 + " * " + randomNumber2);
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
}
