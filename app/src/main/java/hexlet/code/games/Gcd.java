package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Gcd {
    public static void greatestCommonDivisor() {
        Scanner scanner = new Scanner(System.in);
        for (var count = 0; count <= 2; count++) {
            var randomNumber1 = Engine.getRandomNumber2();
            var randomNumber2 = Engine.getRandomNumber2();
            int num = gcd(randomNumber1, randomNumber2);
            var condition = "Find the greatest common divisor of given numbers.";
            var question = randomNumber1 + " " + randomNumber2;

            Engine.intQestions(condition, question);
            var answer = Engine.getIntAnswer();
            if (answer == num) {
                Engine.congratulations(count);
            } else {
                Engine.uncorrectAnswer(answer, num);
                break;
            }
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
