package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    public static void calc() {
        Scanner scanner = new Scanner(System.in);
        var divider1 = 2;
        var divider2 = 3;
        for (var count = 0; count <= 2; count++) {
            var randomGame = Engine.getRandomNumber1();
            var randomNumber1 = Engine.getRandomNumber2();
            var randomNumber2 = Engine.getRandomNumber2();

            if (randomGame % divider1 == 0) {
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
            } else if (randomGame % divider2 == 0) {
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
