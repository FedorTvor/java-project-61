package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class EvenNumber {
    public static void evenNumber() {
        Engine.greeting();
        Scanner scanner = new Scanner(System.in);
        var finalCount = 2;
        for (var count = 0; count <= finalCount; count++) {
            int randomNumber = Engine.getRandomNumber1();
            var condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";
            var question = "" + randomNumber;
            var isEvenNumber = isEven(randomNumber);
            var correct = Engine.getYesOrNo(isEvenNumber);
            Engine.stepGame(condition, question, correct, count, finalCount);
        }
    }
    public static boolean isEven(int num) {
        return  num % 2 == 0;
    }
}

