package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    public static void calc() {
        Scanner scanner = new Scanner(System.in);
        final int divider = 3;
        for (var count = 0; count <= 2; count++) {
            var randomGame = Engine.getRandomNumber1();
            var randomNumber1 = Engine.getRandomNumber2();
            var randomNumber2 = Engine.getRandomNumber2();
            var condition = "What is the result of the expression?";
            var question1 = randomNumber1 + " + " + randomNumber2;
            var question2 = randomNumber1 + " - " + randomNumber2;
            var question3 = randomNumber1 + " * " + randomNumber2;

            if (randomGame % 2 == 0) {
                Engine.intQestions(condition, question1);
                var answer = Engine.getIntAnswer();
                if (answer == randomNumber1 + randomNumber2) {
                    Engine.congratulations(count);
                } else {
                    var correct = randomNumber1 + randomNumber2;
                    Engine.uncorrectAnswer(answer, correct);
                    break;
                }
            } else if (randomGame % divider == 0) {
                Engine.intQestions(condition, question2);
                var answer = Engine.getIntAnswer();
                if (answer == randomNumber1 - randomNumber2) {
                    Engine.congratulations(count);
                } else {
                    var correct = randomNumber1 - randomNumber2;
                    Engine.uncorrectAnswer(answer, correct);
                    break;
                }
            } else {
                Engine.intQestions(condition, question3);
                var answer = Engine.getIntAnswer();
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
