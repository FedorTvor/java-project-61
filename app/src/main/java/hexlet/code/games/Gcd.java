package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Gcd {
    public static void greatestCommonDivisor() {
        Scanner scanner = new Scanner(System.in);
        var num1 = 100;
        for (var count = 0; count <= 2; count++) {
            var randomNumber1 = Engine.getRandomNumber(num1);
            var randomNumber2 = Engine.getRandomNumber(num1);
            int num = Engine.gcd(randomNumber1, randomNumber2);
            System.out.println("Find the greatest common divisor of given numbers.\n"
                    + "Question: " + randomNumber1 + " " + randomNumber2);
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
