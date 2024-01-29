package hexlet.code.games;

import hexlet.code.Engine;
public class Gcd {
    public static void greatestCommonDivisor() {
        Engine.greeting();
        var finalCount = 2;
        for (var count = 0; count <= finalCount; count++) {
            var randomNumber1 = Engine.getRandomNumber2();
            var randomNumber2 = Engine.getRandomNumber2();
            var correct = gcd(randomNumber1, randomNumber2);
            var condition = "Find the greatest common divisor of given numbers.";
            var question = randomNumber1 + " " + randomNumber2;
            Engine.stepGame(condition, question, correct, count, finalCount);
        }
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
}
