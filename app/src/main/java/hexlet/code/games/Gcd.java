package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Gcd {
    public static void greatestCommonDivisor() {
        Scanner scanner = new Scanner(System.in);
        for (var count = 0; count <= 2; count++) {
            var randomNumber1 = (int) (Math.random() * 100);
            var randomNumber2 = (int) (Math.random() * 100);
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
