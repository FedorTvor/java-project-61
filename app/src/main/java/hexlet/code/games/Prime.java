package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    public static void prime() {
        Engine.greeting();
        Scanner scanner = new Scanner(System.in);
        var finalCount = 2;
        for (var count = 0; count <= finalCount; count++) {
            var randomNumber = Engine.getRandomNumber1();
            var condition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
            var question = "" + randomNumber;
            var numIsSimple = isSimple(randomNumber);
            var correct = Engine.getYesOrNo(numIsSimple);
            Engine.stepGame(condition, question, correct, count, finalCount);
        }
    }
    public static boolean isSimple(Integer number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
